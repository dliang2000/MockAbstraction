package br.com.caelum.vraptor.converter;

public class Driver {
	public void runall() {
		br.com.caelum.vraptor.converter.PrimitiveShortConverterTest class1 = new br.com.caelum.vraptor.converter.PrimitiveShortConverterTest();
		class1.setup();
		class1.shouldBeAbleToConvertNumbers();
		class1.shouldComplainAboutInvalidNumber();
		class1.shouldConvertToZeroWhenNull();
		class1.shouldConvertToZeroWhenEmpty();
		br.com.caelum.vraptor.converter.LocaleBasedCalendarConverterTest class2 = new br.com.caelum.vraptor.converter.LocaleBasedCalendarConverterTest();
		class2.setup();
		class2.shouldBeAbleToConvert();
		try {
			class2.shouldUseTheDefaultLocale();
		}
		catch (java.text.ParseException err1) {
			err1.printStackTrace();
		}
		class2.shouldBeAbleToConvertEmpty();
		class2.shouldBeAbleToConvertNull();
		class2.shouldThrowExceptionWhenUnableToParse();
		br.com.caelum.vraptor.converter.LocaleBasedTimeConverterTest class3 = new br.com.caelum.vraptor.converter.LocaleBasedTimeConverterTest();
		class3.setup();
		try {
			class3.shouldBeAbleToConvert();
		}
		catch (java.text.ParseException err2) {
			err2.printStackTrace();
		}
		try {
			class3.shouldUseTheDefaultLocale();
		}
		catch (java.text.ParseException err3) {
			err3.printStackTrace();
		}
		class3.shouldBeAbleToConvertEmpty();
		class3.shouldBeAbleToConvertNull();
		class3.shouldThrowExceptionWhenUnableToParse();
		br.com.caelum.vraptor.converter.PrimitiveLongConverterTest class4 = new br.com.caelum.vraptor.converter.PrimitiveLongConverterTest();
		class4.setup();
		class4.shouldBeAbleToConvertNumbers();
		class4.shouldComplainAboutInvalidNumber();
		class4.shouldConvertToZeroWhenNull();
		class4.shouldConvertToZeroWhenEmpty();
		br.com.caelum.vraptor.converter.BooleanConverterTest class5 = new br.com.caelum.vraptor.converter.BooleanConverterTest();
		class5.setup();
		class5.shouldBeAbleToConvertTrueAndFalse();
		class5.shouldConvertEmptyToNull();
		class5.shouldNotComplainAboutNull();
		class5.shouldConvertYesNo();
		class5.shouldConvertYN();
		class5.shouldConvertOnOff();
		class5.shouldConvertIgnoringCase();
		class5.shouldThrowExceptionForInvalidString();
		br.com.caelum.vraptor.converter.PrimitiveCharConverterTest class6 = new br.com.caelum.vraptor.converter.PrimitiveCharConverterTest();
		class6.setup();
		class6.shouldBeAbleToConvertNumbers();
		class6.shouldComplainAboutInvalidNumber();
		class6.shouldConvertToZeroWhenNull();
		class6.shouldConvertToZeroWhenEmpty();
		br.com.caelum.vraptor.converter.ShortConverterTest class7 = new br.com.caelum.vraptor.converter.ShortConverterTest();
		class7.setup();
		class7.shouldBeAbleToConvertNumbers();
		class7.shouldComplainAboutInvalidNumber();
		class7.shouldComplainAboutNull();
		class7.shouldComplainAboutEmpty();
		br.com.caelum.vraptor.converter.PrimitiveIntConverterTest class8 = new br.com.caelum.vraptor.converter.PrimitiveIntConverterTest();
		class8.setup();
		class8.shouldBeAbleToConvertNumbers();
		class8.shouldComplainAboutInvalidNumber();
		class8.shouldConvertToZeroWhenNull();
		class8.shouldConvertToZeroWhenEmpty();
		br.com.caelum.vraptor.converter.PrimitiveBooleanConverterTest class9 = new br.com.caelum.vraptor.converter.PrimitiveBooleanConverterTest();
		class9.setup();
		class9.shouldBeAbleToConvertNumbers();
		class9.shouldConvertToZeroWhenNull();
		class9.shouldConvertToZeroWhenEmpty();
		class9.shouldConvertYesNo();
		class9.shouldConvertYN();
		class9.shouldConvertOnOff();
		class9.shouldConvertIgnoringCase();
		class9.shouldThrowExceptionForInvalidString();
		br.com.caelum.vraptor.converter.BigDecimalConverterTest class10 = new br.com.caelum.vraptor.converter.BigDecimalConverterTest();
		class10.setup();
		class10.shouldBeAbleToConvertIntegerNumbers();
		class10.shouldComplainAboutInvalidNumber();
		class10.shouldNotComplainAboutNull();
		class10.shouldNotComplainAboutEmpty();
		br.com.caelum.vraptor.converter.LocaleBasedDateConverterTest class11 = new br.com.caelum.vraptor.converter.LocaleBasedDateConverterTest();
		class11.setup();
		try {
			class11.shouldBeAbleToConvert();
		}
		catch (java.text.ParseException err4) {
			err4.printStackTrace();
		}
		try {
			class11.shouldUseTheDefaultLocale();
		}
		catch (java.text.ParseException err5) {
			err5.printStackTrace();
		}
		class11.shouldBeAbleToConvertEmpty();
		class11.shouldBeAbleToConvertNull();
		class11.shouldThrowExceptionWhenUnableToParse();
		br.com.caelum.vraptor.converter.PrimitiveFloatConverterTest class12 = new br.com.caelum.vraptor.converter.PrimitiveFloatConverterTest();
		class12.setup();
		class12.shouldBeAbleToConvertNumbers();
		class12.shouldComplainAboutInvalidNumber();
		class12.shouldConvertToZeroWhenNull();
		class12.shouldConvertToZeroWhenEmpty();
		br.com.caelum.vraptor.converter.ByteConverterTest class13 = new br.com.caelum.vraptor.converter.ByteConverterTest();
		class13.setup();
		class13.shouldBeAbleToConvertNumbers();
		class13.shouldComplainAboutInvalidNumber();
		class13.shouldNotComplainAboutNull();
		class13.shouldNotComplainAboutEmpty();
		br.com.caelum.vraptor.converter.EnumConverterTest class14 = new br.com.caelum.vraptor.converter.EnumConverterTest();
		class14.setup();
		class14.shouldBeAbleToConvertByOrdinal();
		class14.shouldBeAbleToConvertByName();
		class14.shouldConvertEmptyToNull();
		class14.shouldComplainAboutInvalidIndex();
		class14.shouldComplainAboutInvalidNumber();
		class14.shouldComplainAboutInvalidOrdinal();
		class14.shouldAcceptNull();
		br.com.caelum.vraptor.converter.LongConverterTest class15 = new br.com.caelum.vraptor.converter.LongConverterTest();
		class15.setup();
		class15.shouldBeAbleToConvertNumbers();
		class15.shouldComplainAboutInvalidNumber();
		class15.shouldNotComplainAboutNull();
		class15.shouldNotComplainAboutEmpty();
		br.com.caelum.vraptor.converter.BigIntegerConverterTest class16 = new br.com.caelum.vraptor.converter.BigIntegerConverterTest();
		class16.setup();
		class16.shouldBeAbleToConvertIntegerNumbers();
		class16.shouldComplainAboutNonIntegerNumbers();
		class16.shouldComplainAboutInvalidNumber();
		class16.shouldNotComplainAboutNull();
		class16.shouldNotComplainAboutEmpty();
		br.com.caelum.vraptor.converter.FloatConverterTest class17 = new br.com.caelum.vraptor.converter.FloatConverterTest();
		class17.setup();
		class17.shouldBeAbleToConvertNumbers();
		class17.shouldComplainAboutInvalidNumber();
		class17.shouldNotComplainAboutNull();
		class17.shouldNotComplainAboutEmpty();
		br.com.caelum.vraptor.converter.PrimitiveDoubleConverterTest class18 = new br.com.caelum.vraptor.converter.PrimitiveDoubleConverterTest();
		class18.setup();
		class18.shouldBeAbleToConvertNumbers();
		class18.shouldComplainAboutInvalidNumber();
		class18.shouldConvertToZeroWhenNull();
		class18.shouldConvertToZeroWhenEmpty();
		br.com.caelum.vraptor.converter.IntegerConverterTest class19 = new br.com.caelum.vraptor.converter.IntegerConverterTest();
		class19.setup();
		class19.shouldBeAbleToConvertNumbers();
		class19.shouldComplainAboutInvalidNumber();
		class19.shouldNotComplainAboutNull();
		class19.shouldNotComplainAboutEmpty();
		br.com.caelum.vraptor.converter.DoubleConverterTest class20 = new br.com.caelum.vraptor.converter.DoubleConverterTest();
		class20.setup();
		class20.shouldBeAbleToConvertNumbers();
		class20.shouldComplainAboutInvalidNumber();
		class20.shouldNotComplainAboutNull();
		class20.shouldNotComplainAboutEmpty();
		br.com.caelum.vraptor.converter.CharacterConverterTest class21 = new br.com.caelum.vraptor.converter.CharacterConverterTest();
		class21.setup();
		class21.shouldBeAbleToConvertCharacters();
		class21.shouldComplainAboutStringTooBig();
		class21.shouldNotComplainAboutNullAndEmpty();
		br.com.caelum.vraptor.converter.PrimitiveByteConverterTest class22 = new br.com.caelum.vraptor.converter.PrimitiveByteConverterTest();
		class22.setup();
		class22.shouldBeAbleToConvertNumbers();
		class22.shouldComplainAboutInvalidNumber();
		class22.shouldConvertToZeroWhenNull();
		class22.shouldConvertToZeroWhenEmpty();
	}
}