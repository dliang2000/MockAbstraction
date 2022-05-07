package br.com.caelum.vraptor.converter.jodatime;

public class Driver {
	public void runall() {
		br.com.caelum.vraptor.converter.jodatime.LocalTimeConverterTest class1 = new br.com.caelum.vraptor.converter.jodatime.LocalTimeConverterTest();
		class1.setup();
		class1.shouldBeAbleToConvert();
		class1.shouldBeAbleToConvertEmpty();
		class1.shouldBeAbleToConvertNull();
		class1.shouldThrowExceptionWhenUnableToParse();
		br.com.caelum.vraptor.converter.jodatime.LocaleBasedJodaTimeConverterTest class2 = new br.com.caelum.vraptor.converter.jodatime.LocaleBasedJodaTimeConverterTest();
		class2.setup();
		try {
			class2.shouldUseTheDefaultLocale();
		}
		catch (java.text.ParseException err1) {
			err1.printStackTrace();
		}
		try {
			class2.shouldUseTheDefaulJvmtLocale();
		}
		catch (java.text.ParseException err2) {
			err2.printStackTrace();
		}
		br.com.caelum.vraptor.converter.jodatime.DateTimeConverterTest class3 = new br.com.caelum.vraptor.converter.jodatime.DateTimeConverterTest();
		class3.setup();
		class3.shouldBeAbleToConvert();
		class3.shouldBeAbleToConvertEmpty();
		class3.shouldBeAbleToConvertNull();
		class3.shouldThrowExceptionWhenUnableToParse();
		br.com.caelum.vraptor.converter.jodatime.DateMidnightConverterTest class4 = new br.com.caelum.vraptor.converter.jodatime.DateMidnightConverterTest();
		class4.setup();
		class4.shouldBeAbleToConvert();
		class4.shouldBeAbleToConvertEmpty();
		class4.shouldBeAbleToConvertNull();
		class4.shouldThrowExceptionWhenUnableToParse();
		br.com.caelum.vraptor.converter.jodatime.LocalDateConverterTest class5 = new br.com.caelum.vraptor.converter.jodatime.LocalDateConverterTest();
		class5.setup();
		class5.shouldBeAbleToConvert();
		class5.shouldBeAbleToConvertEmpty();
		class5.shouldBeAbleToConvertNull();
		class5.shouldThrowExceptionWhenUnableToParse();
		br.com.caelum.vraptor.converter.jodatime.LocalDateTimeConverterTest class6 = new br.com.caelum.vraptor.converter.jodatime.LocalDateTimeConverterTest();
		class6.setup();
		class6.shouldBeAbleToConvert();
		class6.shouldBeAbleToConvertEmpty();
		class6.shouldBeAbleToConvertNull();
		class6.shouldThrowExceptionWhenUnableToParse();
	}
}