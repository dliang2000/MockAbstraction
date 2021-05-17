package br.com.caelum.vraptor.converter;

public class Driver {
	public void runall() {
		br.com.caelum.vraptor.converter.LocaleBasedTimeConverterTest class1 = new br.com.caelum.vraptor.converter.LocaleBasedTimeConverterTest();
		class1.setup();
		try {
			class1.shouldBeAbleToConvert();
		}
		catch (java.text.ParseException err1) {
			err1.printStackTrace();
		}
		try {
			class1.shouldUseTheDefaultLocale();
		}
		catch (java.text.ParseException err2) {
			err2.printStackTrace();
		}
		class1.shouldBeAbleToConvertEmpty();
		class1.shouldBeAbleToConvertNull();
		class1.shouldThrowExceptionWhenUnableToParse();
		br.com.caelum.vraptor.converter.PrimitiveIntConverterTest class2 = new br.com.caelum.vraptor.converter.PrimitiveIntConverterTest();
		class2.setup();
		class2.shouldBeAbleToConvertNumbers();
		class2.shouldComplainAboutInvalidNumber();
		class2.shouldConvertToZeroWhenNull();
		class2.shouldConvertToZeroWhenEmpty();
		br.com.caelum.vraptor.converter.PrimitiveShortConverterTest class3 = new br.com.caelum.vraptor.converter.PrimitiveShortConverterTest();
		class3.setup();
		class3.shouldBeAbleToConvertNumbers();
		class3.shouldComplainAboutInvalidNumber();
		class3.shouldConvertToZeroWhenNull();
		class3.shouldConvertToZeroWhenEmpty();
		br.com.caelum.vraptor.converter.IntegerConverterTest class4 = new br.com.caelum.vraptor.converter.IntegerConverterTest();
		class4.setup();
		class4.shouldBeAbleToConvertNumbers();
		class4.shouldComplainAboutInvalidNumber();
		class4.shouldNotComplainAboutNull();
		class4.shouldNotComplainAboutEmpty();
		br.com.caelum.vraptor.converter.PrimitiveFloatConverterTest class5 = new br.com.caelum.vraptor.converter.PrimitiveFloatConverterTest();
		class5.setup();
		class5.shouldBeAbleToConvertNumbers();
		class5.shouldComplainAboutInvalidNumber();
		class5.shouldConvertToZeroWhenNull();
		class5.shouldConvertToZeroWhenEmpty();
		br.com.caelum.vraptor.converter.PrimitiveDoubleConverterTest class6 = new br.com.caelum.vraptor.converter.PrimitiveDoubleConverterTest();
		class6.setup();
		class6.shouldBeAbleToConvertNumbers();
		class6.shouldComplainAboutInvalidNumber();
		class6.shouldConvertToZeroWhenNull();
		class6.shouldConvertToZeroWhenEmpty();
		br.com.caelum.vraptor.converter.LocaleBasedDateConverterTest class7 = new br.com.caelum.vraptor.converter.LocaleBasedDateConverterTest();
		class7.setup();
		try {
			class7.shouldBeAbleToConvert();
		}
		catch (java.text.ParseException err3) {
			err3.printStackTrace();
		}
		try {
			class7.shouldUseTheDefaultLocale();
		}
		catch (java.text.ParseException err4) {
			err4.printStackTrace();
		}
		class7.shouldBeAbleToConvertEmpty();
		class7.shouldBeAbleToConvertNull();
		class7.shouldThrowExceptionWhenUnableToParse();
		br.com.caelum.vraptor.converter.BooleanConverterTest class8 = new br.com.caelum.vraptor.converter.BooleanConverterTest();
		class8.setup();
		class8.shouldBeAbleToConvertTrueAndFalse();
		class8.shouldConvertEmptyToNull();
		class8.shouldNotComplainAboutNull();
		class8.shouldConvertYesNo();
		class8.shouldConvertYN();
		class8.shouldConvertOnOff();
		class8.shouldConvertIgnoringCase();
		class8.shouldThrowExceptionForInvalidString();
		br.com.caelum.vraptor.converter.ShortConverterTest class9 = new br.com.caelum.vraptor.converter.ShortConverterTest();
		class9.setup();
		class9.shouldBeAbleToConvertNumbers();
		class9.shouldComplainAboutInvalidNumber();
		class9.shouldComplainAboutNull();
		class9.shouldComplainAboutEmpty();
		br.com.caelum.vraptor.converter.LongConverterTest class10 = new br.com.caelum.vraptor.converter.LongConverterTest();
		class10.setup();
		class10.shouldBeAbleToConvertNumbers();
		class10.shouldComplainAboutInvalidNumber();
		class10.shouldNotComplainAboutNull();
		class10.shouldNotComplainAboutEmpty();
		br.com.caelum.vraptor.converter.EnumConverterTest class11 = new br.com.caelum.vraptor.converter.EnumConverterTest();
		class11.setup();
		class11.shouldBeAbleToConvertByOrdinal();
		class11.shouldBeAbleToConvertByName();
		class11.shouldConvertEmptyToNull();
		class11.shouldComplainAboutInvalidIndex();
		class11.shouldComplainAboutInvalidNumber();
		class11.shouldComplainAboutInvalidOrdinal();
		class11.shouldAcceptNull();
		br.com.caelum.vraptor.converter.LocaleBasedCalendarConverterTest class12 = new br.com.caelum.vraptor.converter.LocaleBasedCalendarConverterTest();
		class12.setup();
		class12.shouldBeAbleToConvert();
		try {
			class12.shouldUseTheDefaultLocale();
		}
		catch (java.text.ParseException err5) {
			err5.printStackTrace();
		}
		class12.shouldBeAbleToConvertEmpty();
		class12.shouldBeAbleToConvertNull();
		class12.shouldThrowExceptionWhenUnableToParse();
		br.com.caelum.vraptor.converter.PrimitiveByteConverterTest class13 = new br.com.caelum.vraptor.converter.PrimitiveByteConverterTest();
		class13.setup();
		class13.shouldBeAbleToConvertNumbers();
		class13.shouldComplainAboutInvalidNumber();
		class13.shouldConvertToZeroWhenNull();
		class13.shouldConvertToZeroWhenEmpty();
		br.com.caelum.vraptor.converter.PrimitiveBooleanConverterTest class14 = new br.com.caelum.vraptor.converter.PrimitiveBooleanConverterTest();
		class14.setup();
		class14.shouldBeAbleToConvertNumbers();
		class14.shouldConvertToZeroWhenNull();
		class14.shouldConvertToZeroWhenEmpty();
		class14.shouldConvertYesNo();
		class14.shouldConvertYN();
		class14.shouldConvertOnOff();
		class14.shouldConvertIgnoringCase();
		class14.shouldThrowExceptionForInvalidString();
		br.com.caelum.vraptor.converter.BigIntegerConverterTest class15 = new br.com.caelum.vraptor.converter.BigIntegerConverterTest();
		class15.setup();
		class15.shouldBeAbleToConvertIntegerNumbers();
		class15.shouldComplainAboutNonIntegerNumbers();
		class15.shouldComplainAboutInvalidNumber();
		class15.shouldNotComplainAboutNull();
		class15.shouldNotComplainAboutEmpty();
		br.com.caelum.vraptor.converter.DoubleConverterTest class16 = new br.com.caelum.vraptor.converter.DoubleConverterTest();
		class16.setup();
		class16.shouldBeAbleToConvertNumbers();
		class16.shouldComplainAboutInvalidNumber();
		class16.shouldNotComplainAboutNull();
		class16.shouldNotComplainAboutEmpty();
		br.com.caelum.vraptor.converter.ByteConverterTest class17 = new br.com.caelum.vraptor.converter.ByteConverterTest();
		class17.setup();
		class17.shouldBeAbleToConvertNumbers();
		class17.shouldComplainAboutInvalidNumber();
		class17.shouldNotComplainAboutNull();
		class17.shouldNotComplainAboutEmpty();
		br.com.caelum.vraptor.converter.PrimitiveCharConverterTest class18 = new br.com.caelum.vraptor.converter.PrimitiveCharConverterTest();
		class18.setup();
		class18.shouldBeAbleToConvertNumbers();
		class18.shouldComplainAboutInvalidNumber();
		class18.shouldConvertToZeroWhenNull();
		class18.shouldConvertToZeroWhenEmpty();
		br.com.caelum.vraptor.converter.PrimitiveLongConverterTest class19 = new br.com.caelum.vraptor.converter.PrimitiveLongConverterTest();
		class19.setup();
		class19.shouldBeAbleToConvertNumbers();
		class19.shouldComplainAboutInvalidNumber();
		class19.shouldConvertToZeroWhenNull();
		class19.shouldConvertToZeroWhenEmpty();
		br.com.caelum.vraptor.converter.FloatConverterTest class20 = new br.com.caelum.vraptor.converter.FloatConverterTest();
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
		br.com.caelum.vraptor.converter.BigDecimalConverterTest class22 = new br.com.caelum.vraptor.converter.BigDecimalConverterTest();
		class22.setup();
		class22.shouldBeAbleToConvertIntegerNumbers();
		class22.shouldComplainAboutInvalidNumber();
		class22.shouldNotComplainAboutNull();
		class22.shouldNotComplainAboutEmpty();
	}
}