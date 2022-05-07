package br.com.caelum.vraptor.scan;

import static java.util.Arrays.asList;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Collection;
import java.util.concurrent.Callable;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import br.com.caelum.vraptor.ComponentRegistry;

public class JavassistBootstrapGeneratorTest {

	private @Mock ComponentRegistry registry;
	private @Mock ClasspathResolver resolver;
	private JavassistBootstrapGenerator generator;

	@Before
	public void setup() throws Exception {
		MockitoAnnotations.initMocks(this);
		generator = new JavassistBootstrapGenerator();
	}

	@Test
	public void shouldRegisterClasses() throws Exception {
		runInADifferentClassLoader(new Callable<Void>() {
			public Void call() throws Exception {
				URL url = File.createTempFile("vraptor", "test").getParentFile().toURI().toURL();
				when(resolver.findWebInfClassesLocation()).thenReturn(url);

				Collection<String> components = asList(ResourceA.class.getName(), ResourceB.class.getName());
				Class<WebAppBootstrap> generated = generator.generate(components, resolver);
				WebAppBootstrap instance = generated.newInstance();

				instance.configure(registry);

				verify(registry).deepRegister(ResourceA.class);
				verify(registry).deepRegister(ResourceB.class);
				return null;
			}
		});
	}

	@Test
	public void shouldThrowScannerExceptionIfAnErrorOccurs() throws Exception {
		URL url = File.createTempFile("vraptor", "test").getParentFile().toURI().toURL();
		when(resolver.findWebInfClassesLocation()).thenReturn(url);

		try {
		Collection<String> components = asList("a.resource.that.nobody.can.find");
			generator.generate(components, resolver);
			fail("Should throw ScannerException");
		} catch (ScannerException e) {

		}
	}

	private void runInADifferentClassLoader(final Callable<?> c) throws Exception {
		ClassLoader classLoader = new URLClassLoader(new URL[] {});
		Thread t = new Thread(new Runnable() {
			public void run() {
				try {
					c.call();
				} catch (Exception e) {
					throw new RuntimeException(e);
				}
			}
		});
		t.setContextClassLoader(classLoader);
		t.start();
		t.join();
	}
}
