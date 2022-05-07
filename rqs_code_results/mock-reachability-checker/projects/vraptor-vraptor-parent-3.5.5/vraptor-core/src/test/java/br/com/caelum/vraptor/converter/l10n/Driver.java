package br.com.caelum.vraptor.converter.l10n;

public class Driver {
	public void runall() {
		br.com.caelum.vraptor.converter.l10n.LocaleBasedDoubleConverterTest class1 = new br.com.caelum.vraptor.converter.l10n.LocaleBasedDoubleConverterTest();
		class1.setup();
		class1.shouldBeAbleToConvertWithPTBR();
		class1.shouldBeAbleToConvertWithENUS();
		try {
			class1.shouldUseTheDefaultLocale();
		}
		catch (java.text.ParseException err1) {
			err1.printStackTrace();
		}
		class1.shouldBeAbleToConvertEmpty();
		class1.shouldBeAbleToConvertNull();
		class1.shouldThrowExceptionWhenUnableToParse();
		br.com.caelum.vraptor.converter.l10n.LocaleBasedBigDecimalConverterTest class2 = new br.com.caelum.vraptor.converter.l10n.LocaleBasedBigDecimalConverterTest();
		class2.setup();
		class2.shouldBeAbleToConvertWithPTBR();
		class2.shouldBeAbleToConvertWithENUS();
		try {
			class2.shouldUseTheDefaultLocale();
		}
		catch (java.text.ParseException err2) {
			err2.printStackTrace();
		}
		class2.shouldBeAbleToConvertEmpty();
		class2.shouldBeAbleToConvertNull();
		class2.shouldThrowExceptionWhenUnableToParse();
		br.com.caelum.vraptor.converter.l10n.LocaleBasedPrimitiveFloatConverterTest class3 = new br.com.caelum.vraptor.converter.l10n.LocaleBasedPrimitiveFloatConverterTest();
		class3.setup();
		class3.shouldBeAbleToConvertWithPTBR();
		class3.shouldBeAbleToConvertWithENUS();
		try {
			class3.shouldUseTheDefaultLocale();
		}
		catch (java.text.ParseException err3) {
			err3.printStackTrace();
		}
		class3.shouldBeAbleToConvertEmpty();
		class3.shouldBeAbleToConvertNull();
		class3.shouldThrowExceptionWhenUnableToParse();
		br.com.caelum.vraptor.converter.l10n.LocaleBasedFloatConverterTest class4 = new br.com.caelum.vraptor.converter.l10n.LocaleBasedFloatConverterTest();
		class4.setup();
		class4.shouldBeAbleToConvertWithPTBR();
		class4.shouldBeAbleToConvertWithENUS();
		try {
			class4.shouldUseTheDefaultLocale();
		}
		catch (java.text.ParseException err4) {
			err4.printStackTrace();
		}
		class4.shouldBeAbleToConvertEmpty();
		class4.shouldBeAbleToConvertNull();
		class4.shouldThrowExceptionWhenUnableToParse();
		br.com.caelum.vraptor.converter.l10n.LocaleBasedPrimitiveDoubleConverterTest class5 = new br.com.caelum.vraptor.converter.l10n.LocaleBasedPrimitiveDoubleConverterTest();
		class5.setup();
		class5.shouldBeAbleToConvertWithPTBR();
		class5.shouldBeAbleToConvertWithENUS();
		try {
			class5.shouldUseTheDefaultLocale();
		}
		catch (java.text.ParseException err5) {
			err5.printStackTrace();
		}
		class5.shouldBeAbleToConvertEmpty();
		class5.shouldBeAbleToConvertNull();
		class5.shouldThrowExceptionWhenUnableToParse();
	}
}