package io.bootique.jackson;

public class Driver {
	public void runall() {
		io.bootique.jackson.OffsetDateTimeDeserializerIT class1 = new io.bootique.jackson.OffsetDateTimeDeserializerIT();
		try {
			class1.testDeserialization01();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class1.testDeserialization02();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class1.testDeserialization03();
		}
		catch (java.io.IOException err3) {
			err3.printStackTrace();
		}
		try {
			class1.testDeserializationWithTypeInfo01();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		io.bootique.jackson.ZoneOffSetDeserializerIT class2 = new io.bootique.jackson.ZoneOffSetDeserializerIT();
		try {
			class2.testDeserialization01();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class2.testDeserialization02();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		try {
			class2.testDeserialization03();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		try {
			class2.testDeserialization04();
		}
		catch (java.io.IOException err8) {
			err8.printStackTrace();
		}
		try {
			class2.testDeserializationWithTypeInfo01();
		}
		catch (java.lang.Exception err9) {
			err9.printStackTrace();
		}
		io.bootique.jackson.PercentValueYamlDeserializerIT class3 = new io.bootique.jackson.PercentValueYamlDeserializerIT();
		try {
			class3.testDeserialization_AsPercent();
		}
		catch (java.lang.Exception err10) {
			err10.printStackTrace();
		}
		try {
			class3.testDeserialization_AsDouble();
		}
		catch (java.lang.Exception err11) {
			err11.printStackTrace();
		}
		try {
			class3.testDeserialization_AsInt();
		}
		catch (java.lang.Exception err12) {
			err12.printStackTrace();
		}
		try {
			class3.testDeserialization_Object();
		}
		catch (java.io.IOException err13) {
			err13.printStackTrace();
		}
		io.bootique.jackson.YearMonthDeserializerIT class4 = new io.bootique.jackson.YearMonthDeserializerIT();
		try {
			class4.testDeserialization_Value1();
		}
		catch (java.lang.Exception err14) {
			err14.printStackTrace();
		}
		try {
			class4.testDeserialization_Value2();
		}
		catch (java.lang.Exception err15) {
			err15.printStackTrace();
		}
		try {
			class4.testDeserialization_Pattern();
		}
		catch (java.lang.Exception err16) {
			err16.printStackTrace();
		}
		io.bootique.jackson.LocalTimeDeserializerIT class5 = new io.bootique.jackson.LocalTimeDeserializerIT();
		try {
			class5.testDeserialization();
		}
		catch (java.lang.Exception err17) {
			err17.printStackTrace();
		}
		io.bootique.jackson.OffsetTimeDeserializerIT class6 = new io.bootique.jackson.OffsetTimeDeserializerIT();
		try {
			class6.testDeserialization01();
		}
		catch (java.lang.Exception err18) {
			err18.printStackTrace();
		}
		try {
			class6.testDeserialization02();
		}
		catch (java.lang.Exception err19) {
			err19.printStackTrace();
		}
		try {
			class6.testDeserialization03();
		}
		catch (java.io.IOException err20) {
			err20.printStackTrace();
		}
		try {
			class6.testDeserializationWithTypeInfo01();
		}
		catch (java.lang.Exception err21) {
			err21.printStackTrace();
		}
		io.bootique.jackson.LocalDateTimeDeserializerIT class7 = new io.bootique.jackson.LocalDateTimeDeserializerIT();
		try {
			class7.testDeserialization11();
		}
		catch (java.lang.Exception err22) {
			err22.printStackTrace();
		}
		try {
			class7.testDeserialization2();
		}
		catch (java.lang.Exception err23) {
			err23.printStackTrace();
		}
		try {
			class7.testDeserialization_Nanoseconds();
		}
		catch (java.lang.Exception err24) {
			err24.printStackTrace();
		}
		io.bootique.jackson.LocalDateDeserializerIT class8 = new io.bootique.jackson.LocalDateDeserializerIT();
		try {
			class8.testDeserialization();
		}
		catch (java.lang.Throwable err25) {
			err25.printStackTrace();
		}
		io.bootique.jackson.ZonedDateTimeDeserializerIT class9 = new io.bootique.jackson.ZonedDateTimeDeserializerIT();
		try {
			class9.testDeserialization01();
		}
		catch (java.lang.Exception err26) {
			err26.printStackTrace();
		}
		try {
			class9.testDeserialization02();
		}
		catch (java.lang.Exception err27) {
			err27.printStackTrace();
		}
		try {
			class9.testDeserialization03();
		}
		catch (java.io.IOException err28) {
			err28.printStackTrace();
		}
		try {
			class9.testDeserializationWithTypeInfo01();
		}
		catch (java.lang.Exception err29) {
			err29.printStackTrace();
		}
		io.bootique.jackson.PeriodDeserializerIT class10 = new io.bootique.jackson.PeriodDeserializerIT();
		try {
			class10.testDeserialization_Value1();
		}
		catch (java.lang.Exception err30) {
			err30.printStackTrace();
		}
		try {
			class10.testDeserialization_Value2();
		}
		catch (java.lang.Exception err31) {
			err31.printStackTrace();
		}
		try {
			class10.testDeserialization_Object();
		}
		catch (java.io.IOException err32) {
			err32.printStackTrace();
		}
		io.bootique.jackson.MonthDayDeserializerIT class11 = new io.bootique.jackson.MonthDayDeserializerIT();
		try {
			class11.testDeserialization_Value1();
		}
		catch (java.lang.Exception err33) {
			err33.printStackTrace();
		}
		try {
			class11.testDeserialization_Value2();
		}
		catch (java.lang.Exception err34) {
			err34.printStackTrace();
		}
		try {
			class11.testDeserialization_Object();
		}
		catch (java.io.IOException err35) {
			err35.printStackTrace();
		}
		try {
			class11.testDeserializationWithTypeInfo();
		}
		catch (java.lang.Exception err36) {
			err36.printStackTrace();
		}
		io.bootique.jackson.InstantDeserializerIT class12 = new io.bootique.jackson.InstantDeserializerIT();
		try {
			class12.testDeserialize();
		}
		catch (java.lang.Exception err37) {
			err37.printStackTrace();
		}
		io.bootique.jackson.YearDeserializerIT class13 = new io.bootique.jackson.YearDeserializerIT();
		try {
			class13.testDeserialization_Value();
		}
		catch (java.lang.Exception err38) {
			err38.printStackTrace();
		}
		try {
			class13.testDeserialization_Object();
		}
		catch (java.lang.Exception err39) {
			err39.printStackTrace();
		}
		io.bootique.jackson.DurationValueYamlDeserializerIT class14 = new io.bootique.jackson.DurationValueYamlDeserializerIT();
		try {
			class14.testDeserialization_AsString();
		}
		catch (java.io.IOException err40) {
			err40.printStackTrace();
		}
		try {
			class14.testDeserialization_AsString_Object();
		}
		catch (java.io.IOException err41) {
			err41.printStackTrace();
		}
		try {
			class14.testDeserialization_AsLongMs();
		}
		catch (java.io.IOException err42) {
			err42.printStackTrace();
		}
		try {
			class14.testDeserialization_AsLong_Object();
		}
		catch (java.io.IOException err43) {
			err43.printStackTrace();
		}
		io.bootique.jackson.DurationDeserializerIT class15 = new io.bootique.jackson.DurationDeserializerIT();
		try {
			class15.testDeserialization();
		}
		catch (java.lang.Exception err44) {
			err44.printStackTrace();
		}
		try {
			class15.testDeserializationAsFloat();
		}
		catch (java.lang.Exception err45) {
			err45.printStackTrace();
		}
		io.bootique.jackson.DateDeserializerIT class16 = new io.bootique.jackson.DateDeserializerIT();
		try {
			class16.testDeserialize();
		}
		catch (java.lang.Exception err46) {
			err46.printStackTrace();
		}
		io.bootique.jackson.DefaultJacksonServiceIT class17 = new io.bootique.jackson.DefaultJacksonServiceIT();
		class17.before();
		try {
			class17.testNewObjectMapper_Inheritance();
		}
		catch (java.io.IOException err47) {
			err47.printStackTrace();
		}
	}
}