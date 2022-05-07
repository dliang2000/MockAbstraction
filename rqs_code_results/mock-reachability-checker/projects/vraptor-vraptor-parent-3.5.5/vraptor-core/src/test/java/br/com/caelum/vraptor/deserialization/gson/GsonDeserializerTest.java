package br.com.caelum.vraptor.deserialization.gson;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

import javax.servlet.http.HttpServletRequest;

import net.vidageek.mirror.dsl.Mirror;

import org.junit.Before;
import org.junit.Test;

import br.com.caelum.vraptor.core.Localization;
import br.com.caelum.vraptor.http.ParameterNameProvider;
import br.com.caelum.vraptor.resource.DefaultResourceClass;
import br.com.caelum.vraptor.resource.DefaultResourceMethod;
import br.com.caelum.vraptor.resource.ResourceClass;
import br.com.caelum.vraptor.resource.ResourceMethod;
import br.com.caelum.vraptor.serialization.gson.adapters.CalendarDeserializer;
import br.com.caelum.vraptor.util.ISO8601Util;
import br.com.caelum.vraptor.view.GenericController;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

public class GsonDeserializerTest {

	private GsonDeserialization deserializer;
	private ResourceMethod bark;
	private ParameterNameProvider provider;
	private Localization localization;
	private ResourceMethod jump;
	private DefaultResourceMethod woof;
	private DefaultResourceMethod dropDead;
	private DefaultResourceMethod adopt;
	private DefaultResourceMethod sell;
	private HttpServletRequest request;

	@Before
	public void setUp() throws Exception {
		provider = mock(ParameterNameProvider.class);
		localization = mock(Localization.class);
		request = mock(HttpServletRequest.class);

		when(localization.getLocale()).thenReturn(new Locale("pt", "BR"));

		List<JsonDeserializer> deserializers = new ArrayList<JsonDeserializer>();
		CalendarDeserializer calendarDeserializer = new CalendarDeserializer(localization);
		deserializers.add(calendarDeserializer);
		deserializer = new GsonDeserialization(provider, new DefaultJsonDeserializers(deserializers), request);
		DefaultResourceClass resourceClass = new DefaultResourceClass(DogController.class);

		woof = new DefaultResourceMethod(resourceClass, DogController.class.getDeclaredMethod("woof"));
		bark = new DefaultResourceMethod(resourceClass, DogController.class.getDeclaredMethod("bark", Dog.class));
		jump = new DefaultResourceMethod(resourceClass, DogController.class.getDeclaredMethod("jump", Dog.class,
				Integer.class));
		dropDead = new DefaultResourceMethod(resourceClass, DogController.class.getDeclaredMethod("dropDead",
				Integer.class, Dog.class));
		adopt = new DefaultResourceMethod(resourceClass, DogController.class.getDeclaredMethod("adopt",
				List.class));
		sell = new DefaultResourceMethod(resourceClass, DogController.class.getDeclaredMethod("sell",
				List.class, String.class));
	}

	static class Dog {
		private String name;
		private Integer age;
		private Calendar birthday;
		@Override
		public String toString() {
			return "Dog [name=" + name + ", age=" + age + ", birthday="
					+ birthday + "]";
		}
	}

	static class ExtGenericController extends GenericController<Dog>{
	}

	static class DogController {

		public void woof() {
		}

		public void bark(Dog dog) {
		}

		public void jump(Dog dog, Integer times) {
		}

		public void dropDead(Integer times, Dog dog) {
		}
		
		public void adopt(List<Dog> dogs) {
		}
		
		public void sell(List<Dog> dogs, String customer) {
		}
		
	}

	private class DogDeserializer implements JsonDeserializer<Dog> {

		public Dog deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
				throws JsonParseException {
			Dog dog = new Dog();
			dog.name = "Renan";
			dog.age = 25;

			return dog;
		}

	}

	@Test(expected = IllegalArgumentException.class)
	public void shouldNotAcceptMethodsWithoutArguments() throws Exception {
		deserializer.deserialize(new ByteArrayInputStream(new byte[0]), woof);
	}

	@Test
	public void shouldBeAbleToDeserializeADog() throws Exception {
		InputStream stream = new ByteArrayInputStream("{'dog':{'name':'Brutus','age':7}}".getBytes());

		when(provider.parameterNamesFor(bark.getMethod())).thenReturn(new String[] { "dog" });

		Object[] deserialized = deserializer.deserialize(stream, bark);

		assertThat(deserialized.length, is(1));
		assertThat(deserialized[0], is(instanceOf(Dog.class)));
		Dog dog = (Dog) deserialized[0];
		assertThat(dog.name, is("Brutus"));
		assertThat(dog.age, is(7));
	}
	
	@Test
	public void shouldBeAbleToDeserializeAListOfDogs() throws Exception {
		String jsonArrayOfDogs = "{'dogs': [{'name':'Brutus','age':7}, {'name':'Snoop','age':10}] }";
		
		InputStream stream = new ByteArrayInputStream(jsonArrayOfDogs.getBytes());

		when(provider.parameterNamesFor(adopt.getMethod())).thenReturn(new String[] { "dogs" });

		Object[] deserialized = deserializer.deserialize(stream, adopt);
		assertThat(deserialized.length, is(1));
		assertThat(deserialized[0], is(instanceOf(List.class)));
		
		List<Dog> dogs = (List<Dog>) deserialized[0];
		assertThat(dogs.size(), is(2));
		assertThat(dogs.get(0).name, is("Brutus"));
		assertThat(dogs.get(0).age, is(7));
		assertThat(dogs.get(1).name, is("Snoop"));
		assertThat(dogs.get(1).age, is(10));
	}
	
	@Test
	public void shouldBeAbleToDeserializeAListOfDogsWithNoRoot() throws Exception {
		String jsonArrayOfDogs = "[{'name':'Brutus','age':7}, {'name':'Snoop','age':10}]";
		
		InputStream stream = new ByteArrayInputStream(jsonArrayOfDogs.getBytes());

		when(provider.parameterNamesFor(adopt.getMethod())).thenReturn(new String[] { "dogs" });

		Object[] deserialized = deserializer.deserialize(stream, adopt);
		assertThat(deserialized.length, is(1));
		assertThat(deserialized[0], is(instanceOf(List.class)));
		
		List<Dog> dogs = (List<Dog>) deserialized[0];
		assertThat(dogs.size(), is(2));
		assertThat(dogs.get(0).name, is("Brutus"));
		assertThat(dogs.get(0).age, is(7));
		assertThat(dogs.get(1).name, is("Snoop"));
		assertThat(dogs.get(1).age, is(10));
	}
	
	@Test
	public void shouldBeAbleToDeserializeAListOfDogsWhenMethodHasMoreThenOneParameter() throws Exception {
		String jsonArrayOfDogs = "{dogs: [{'name':'Brutus','age':7}, {'name':'Snoop','age':10}], customer: 'Me'}";
		
		InputStream stream = new ByteArrayInputStream(jsonArrayOfDogs.getBytes());

		when(provider.parameterNamesFor(sell.getMethod())).thenReturn(new String[] { "dogs", "customer" });

		Object[] deserialized = deserializer.deserialize(stream, sell);
		assertThat(deserialized.length, is(2));
		assertThat(deserialized[0], is(instanceOf(List.class)));
		
		List<Dog> dogs = (List<Dog>) deserialized[0];
		assertThat(dogs.size(), is(2));
		assertThat(dogs.get(0).name, is("Brutus"));
		assertThat(dogs.get(0).age, is(7));
		assertThat(dogs.get(1).name, is("Snoop"));
		assertThat(dogs.get(1).age, is(10));
		
		String customer = (String) deserialized[1];
		assertThat(customer, is("Me"));
	}

	@Test
	public void shouldBeAbleToDeserializeADogWithoutRoot() {
		InputStream stream = new ByteArrayInputStream("{'name':'Brutus','age':7}".getBytes());

		when(provider.parameterNamesFor(bark.getMethod())).thenReturn(new String[] { "dog" });

		Object[] deserialized = deserializer.deserialize(stream, bark);

		assertThat(deserialized.length, is(1));
		assertThat(deserialized[0], is(instanceOf(Dog.class)));
		Dog dog = (Dog) deserialized[0];
		assertThat(dog.name, is("Brutus"));
		assertThat(dog.age, is(7));
	}

	@Test
	public void shouldBeAbleToDeserializeADogWithDeserializerAdapter() throws Exception {
		List<JsonDeserializer> deserializers = new ArrayList<JsonDeserializer>();
		deserializers.add(new DogDeserializer());

		deserializer = new GsonDeserialization(provider, new DefaultJsonDeserializers(deserializers), request);

		InputStream stream = new ByteArrayInputStream("{'dog':{'name':'Renan Reis','age':'0'}}".getBytes());

		when(provider.parameterNamesFor(bark.getMethod())).thenReturn(new String[] { "dog" });

		Object[] deserialized = deserializer.deserialize(stream, bark);

		assertThat(deserialized.length, is(1));
		assertThat(deserialized[0], is(instanceOf(Dog.class)));
		Dog dog = (Dog) deserialized[0];
		assertThat(dog.name, is("Renan"));
		assertThat(dog.age, is(25));
	}

	@Test
	public void shouldBeAbleToDeserializeADogWhenMethodHasMoreThanOneArgument() throws Exception {
		InputStream stream = new ByteArrayInputStream("{'dog':{'name':'Brutus','age':7}}".getBytes());

		when(provider.parameterNamesFor(jump.getMethod())).thenReturn(new String[] { "dog", "times" });

		Object[] deserialized = deserializer.deserialize(stream, jump);

		assertThat(deserialized.length, is(2));
		assertThat(deserialized[0], is(instanceOf(Dog.class)));
		Dog dog = (Dog) deserialized[0];
		assertThat(dog.name, is("Brutus"));
		assertThat(dog.age, is(7));
	}

	@Test
	public void shouldBeAbleToDeserializeADogWhenMethodHasMoreThanOneArgumentAndHasNotRoot() throws Exception {
		InputStream stream = new ByteArrayInputStream("{'name':'Brutus','age':7}".getBytes());

		when(provider.parameterNamesFor(jump.getMethod())).thenReturn(new String[] { "dog", "times" });

		Object[] deserialized = deserializer.deserialize(stream, jump);

		assertThat(deserialized.length, is(2));
		assertThat(deserialized[0], is(instanceOf(Dog.class)));
		Dog dog = (Dog) deserialized[0];
		assertThat(dog.name, is("Brutus"));
		assertThat(dog.age, is(7));
	}

	@Test
	public void shouldBeAbleToDeserializeADogWhenMethodHasMoreThanOneArgumentAndTheXmlIsTheLastOne() throws Exception {
		InputStream stream = new ByteArrayInputStream("{'dog':{'name':'Brutus','age':7}}".getBytes());

		when(provider.parameterNamesFor(dropDead.getMethod())).thenReturn(new String[] { "times", "dog" });

		Object[] deserialized = deserializer.deserialize(stream, dropDead);

		assertThat(deserialized.length, is(2));
		assertThat(deserialized[1], is(instanceOf(Dog.class)));
		Dog dog = (Dog) deserialized[1];
		assertThat(dog.name, is("Brutus"));
		assertThat(dog.age, is(7));
	}

	@Test
	public void shouldBeAbleToDeserializeADogNamedDifferently() throws Exception {
		InputStream stream = new ByteArrayInputStream("{'pet':{'name':'Brutus','age':7}}".getBytes());

		when(provider.parameterNamesFor(bark.getMethod())).thenReturn(new String[] { "pet" });

		Object[] deserialized = deserializer.deserialize(stream, bark);

		assertThat(deserialized.length, is(1));
		assertThat(deserialized[0], is(instanceOf(Dog.class)));
		Dog dog = (Dog) deserialized[0];
		assertThat(dog.name, is("Brutus"));
		assertThat(dog.age, is(7));
	}

	@Test
	public void shouldDeserializeADogWithCalendarAttribute() {
		InputStream stream = new ByteArrayInputStream(
				"{'dog':{'name':'Brutus','age':7,'birthday':'06/01/1987'}}".getBytes());

		when(provider.parameterNamesFor(bark.getMethod())).thenReturn(new String[] { "dog" });
		when(provider.parameterNamesFor(bark.getMethod())).thenReturn(new String[] { "dog" });

		Object[] deserialized = deserializer.deserialize(stream, bark);

		assertThat(deserialized.length, is(1));
		assertThat(deserialized[0], is(instanceOf(Dog.class)));
		Dog dog = (Dog) deserialized[0];
		assertThat(dog.name, is("Brutus"));
		assertThat(dog.age, is(7));

		Calendar birthday = new GregorianCalendar(1987, 0, 6);
		assertThat(dog.birthday, is(birthday));
	}

	@Test
	public void shouldDeserializeADogWithCalendarAsISO8601Attribute() {
		InputStream stream = new ByteArrayInputStream(
				"{'dog':{'name':'Brutus','age':7,'birthday':'2013-07-23T17:14:14.000-0300'}}".getBytes());
		when(provider.parameterNamesFor(bark.getMethod())).thenReturn(new String[] { "dog" });
		List<JsonDeserializer> deserializers = new ArrayList<JsonDeserializer>();
		deserializers.add(new br.com.caelum.vraptor.serialization.iso8601.gson.CalendarISO8601Deserializer(new ISO8601Util()));

		deserializer = new GsonDeserialization(provider, new DefaultJsonDeserializers(deserializers), request);

		Object[] deserialized = deserializer.deserialize(stream, bark);

		assertThat(deserialized.length, is(1));
		assertThat(deserialized[0], is(instanceOf(Dog.class)));
		Dog dog = (Dog) deserialized[0];
		assertThat(dog.name, is("Brutus"));
		assertThat(dog.age, is(7));

		Calendar birthday = new GregorianCalendar(2013, 6, 23, 17, 14, 14);
		birthday.setTimeZone(TimeZone.getTimeZone("GMT-0300"));

		assertThat(dog.birthday, is(birthday));
	}

	@Test
	public void shouldDeserializeADogWithCalendarAsObjectAttribute() {
		InputStream stream = new ByteArrayInputStream(
				"{'dog':{'name':'Brutus','age':7,'birthday':{'time':1301886000000,'timezone':'America/Sao_Paulo'}}}".getBytes());

		when(provider.parameterNamesFor(bark.getMethod())).thenReturn(new String[] { "dog" });

		Object[] deserialized = deserializer.deserialize(stream, bark);

		assertThat(deserialized.length, is(1));
		assertThat(deserialized[0], is(instanceOf(Dog.class)));
		Dog dog = (Dog) deserialized[0];
		assertThat(dog.name, is("Brutus"));
		assertThat(dog.age, is(7));

		Calendar birthday = new GregorianCalendar(2011, 03, 04);//04/04/2011
		birthday.setTimeZone(TimeZone.getTimeZone("America/Sao_Paulo"));
		assertThat(dog.birthday, is(birthday));
	}

	@Test
	public void shouldHonorRequestHeaderAcceptCharset() throws Exception {
		InputStream stream = new ByteArrayInputStream("{'pet':{'name':'Ã§'}}".getBytes("ISO-8859-1"));
		when(provider.parameterNamesFor(bark.getMethod())).thenReturn(new String[] { "pet" });

		when(request.getHeader("Accept-Charset")).thenReturn("UTF-8,*;q=0.5");
		Object[] deserialized = deserializer.deserialize(stream, bark);

		assertThat(deserialized.length, is(1));
		assertThat(deserialized[0], is(instanceOf(Dog.class)));

		Dog dog = (Dog) deserialized[0];

		assertThat(dog.name, is("ç"));
	}

	@Test
	public void whenNoCharsetHeaderIsFoundThanAssumeItIsUTF8() throws Exception {
		InputStream stream = new ByteArrayInputStream("{'pet':{'name':'Ã§'}}".getBytes("ISO-8859-1"));
		when(provider.parameterNamesFor(bark.getMethod())).thenReturn(new String[] { "pet" });

		when(request.getHeader("Accept-Charset")).thenReturn(null);
		Object[] deserialized = deserializer.deserialize(stream, bark);

		assertThat(deserialized.length, is(1));
		assertThat(deserialized[0], is(instanceOf(Dog.class)));

		Dog dog = (Dog) deserialized[0];

		assertThat(dog.name, is("ç"));
	}

	@Test
	public void shouldByPassDeserializationWhenHasNoContent() {
		InputStream stream = new ByteArrayInputStream("".getBytes());
		when(provider.parameterNamesFor(bark.getMethod())).thenReturn(new String[] { "pet" });

		Object[] deserialized = deserializer.deserialize(stream, bark);

		assertThat(deserialized.length, is(1));
		assertThat(deserialized[0], is(nullValue()));
	}

	@Test
	public void shouldDeserializeFromGenericTypeOneParam() {
		InputStream stream = new ByteArrayInputStream(
				"{'entity':{'name':'Brutus','age':7,'birthday':'06/01/1987'}}".getBytes());
		ResourceClass resourceClass = new DefaultResourceClass(ExtGenericController.class);
		Method method = new Mirror().on(GenericController.class).reflect().method("method").withAnyArgs();
		ResourceMethod resource = new DefaultResourceMethod(resourceClass, method);
		when(provider.parameterNamesFor(resource.getMethod())).thenReturn(new String[] { "entity" });

		Object[] deserialized = deserializer.deserialize(stream, resource);

		Dog dog = (Dog) deserialized[0];

		assertThat(dog.name, equalTo("Brutus"));
	}

	@Test
	public void shouldDeserializeFromGenericTypeTwoParams() {
		InputStream stream = new ByteArrayInputStream(
				"{'entity':{'name':'Brutus','age':7,'birthday':'06/01/1987'}, 'param': 'test'}".getBytes());
		ResourceClass resourceClass = new DefaultResourceClass(ExtGenericController.class);
		Method method = new Mirror().on(GenericController.class).reflect().method("anotherMethod").withAnyArgs();
		ResourceMethod resource = new DefaultResourceMethod(resourceClass, method);
		when(provider.parameterNamesFor(resource.getMethod())).thenReturn(new String[] { "entity", "param" });

		Object[] deserialized = deserializer.deserialize(stream, resource);

		Dog dog = (Dog) deserialized[0];
		String param = (String) deserialized[1];

		assertThat(dog.name, equalTo("Brutus"));
		assertThat(param, equalTo("test"));
		assertThat(deserialized.length, equalTo(2));
	}

	@Test
	public void shouldDeserializeWithoutGenericType() {
		InputStream stream = new ByteArrayInputStream(
				"{'param': 'test'}".getBytes());
		ResourceClass resourceClass = new DefaultResourceClass(ExtGenericController.class);
		Method method = new Mirror().on(GenericController.class).reflect().method("methodWithoutGenericType").withArgs(String.class);
		ResourceMethod resource = new DefaultResourceMethod(resourceClass, method);
		when(provider.parameterNamesFor(resource.getMethod())).thenReturn(new String[] { "param" });

		Object[] deserialized = deserializer.deserialize(stream, resource);

		String param = (String) deserialized[0];

		assertThat(param, equalTo("test"));
	}
}