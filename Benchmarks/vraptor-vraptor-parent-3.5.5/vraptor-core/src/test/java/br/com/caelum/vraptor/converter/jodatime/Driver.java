package br.com.caelum.vraptor.converter.jodatime;

public class Driver {
	public void runall() {
		br.com.caelum.vraptor.converter.jodatime.LocaleBasedJodaTimeConverterTest class1 = new br.com.caelum.vraptor.converter.jodatime.LocaleBasedJodaTimeConverterTest();
		class1.setup();
		try {
			class1.shouldUseTheDefaultLocale();
		}
		catch (java.text.ParseException err1) {
			err1.printStackTrace();
		}
		try {
			class1.shouldUseTheDefaulJvmtLocale();
		}
		catch (java.text.ParseException err2) {
			err2.printStackTrace();
		}
		br.com.caelum.vraptor.converter.jodatime.DateTimeConverterTest class2 = new br.com.caelum.vraptor.converter.jodatime.DateTimeConverterTest();
		class2.setup();
		class2.shouldBeAbleToConvert();
		class2.shouldBeAbleToConvertEmpty();
		class2.shouldBeAbleToConvertNull();
		class2.shouldThrowExceptionWhenUnableToParse();
		br.com.caelum.vraptor.converter.jodatime.LocalDateTimeConverterTest class3 = new br.com.caelum.vraptor.converter.jodatime.LocalDateTimeConverterTest();
		class3.setup();
		class3.shouldBeAbleToConvert();
		class3.shouldBeAbleToConvertEmpty();
		class3.shouldBeAbleToConvertNull();
		class3.shouldThrowExceptionWhenUnableToParse();
		br.com.caelum.vraptor.converter.jodatime.LocalDateConverterTest class4 = new br.com.caelum.vraptor.converter.jodatime.LocalDateConverterTest();
		class4.setup();
		class4.shouldBeAbleToConvert();
		class4.shouldBeAbleToConvertEmpty();
		class4.shouldBeAbleToConvertNull();
		class4.shouldThrowExceptionWhenUnableToParse();
		br.com.caelum.vraptor.converter.jodatime.LocalTimeConverterTest class5 = new br.com.caelum.vraptor.converter.jodatime.LocalTimeConverterTest();
		class5.setup();
		class5.shouldBeAbleToConvert();
		class5.shouldBeAbleToConvertEmpty();
		class5.shouldBeAbleToConvertNull();
		class5.shouldThrowExceptionWhenUnableToParse();
		br.com.caelum.vraptor.converter.jodatime.DateMidnightConverterTest class6 = new br.com.caelum.vraptor.converter.jodatime.DateMidnightConverterTest();
		class6.setup();
		class6.shouldBeAbleToConvert();
		class6.shouldBeAbleToConvertEmpty();
		class6.shouldBeAbleToConvertNull();
		class6.shouldThrowExceptionWhenUnableToParse();
	}
}