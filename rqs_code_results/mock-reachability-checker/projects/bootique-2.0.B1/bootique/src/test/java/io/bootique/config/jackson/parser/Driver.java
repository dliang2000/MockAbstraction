package io.bootique.config.jackson.parser;

public class Driver {
	public void runall() {
		io.bootique.config.jackson.parser.YamlConfigurationFormatParserTest class1 = new io.bootique.config.jackson.parser.YamlConfigurationFormatParserTest();
		class1.testParse();
		try {
			class1.testShouldParse();
		}
		catch (java.net.MalformedURLException err1) {
			err1.printStackTrace();
		}
		io.bootique.config.jackson.parser.MultiFormatJsonNodeParserTest class2 = new io.bootique.config.jackson.parser.MultiFormatJsonNodeParserTest();
		try {
			class2.testParserForUrl();
		}
		catch (java.net.MalformedURLException err2) {
			err2.printStackTrace();
		}
		io.bootique.config.jackson.parser.JsonConfigurationFormatParserTest class3 = new io.bootique.config.jackson.parser.JsonConfigurationFormatParserTest();
		class3.testParse();
		try {
			class3.testShouldParse();
		}
		catch (java.net.MalformedURLException err3) {
			err3.printStackTrace();
		}
	}
}