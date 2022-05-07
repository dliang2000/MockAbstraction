package io.bootique.jackson;

public class Driver {
	public void runall() {
		io.bootique.jackson.ZoneOffSetDeserializerIT class1 = new io.bootique.jackson.ZoneOffSetDeserializerIT();
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
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		try {
			class1.testDeserialization04();
		}
		catch (java.io.IOException err4) {
			err4.printStackTrace();
		}
		try {
			class1.testDeserializationWithTypeInfo01();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		io.bootique.jackson.DateDeserializerIT class2 = new io.bootique.jackson.DateDeserializerIT();
		try {
			class2.testDeserialize();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		io.bootique.jackson.YearMonthDeserializerIT class3 = new io.bootique.jackson.YearMonthDeserializerIT();
		try {
			class3.testDeserialization_Value1();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		try {
			class3.testDeserialization_Value2();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		try {
			class3.testDeserialization_Pattern();
		}
		catch (java.lang.Exception err9) {
			err9.printStackTrace();
		}
		io.bootique.jackson.PeriodDeserializerIT class4 = new io.bootique.jackson.PeriodDeserializerIT();
		try {
			class4.testDeserialization_Value1();
		}
		catch (java.lang.Exception err10) {
			err10.printStackTrace();
		}
		try {
			class4.testDeserialization_Value2();
		}
		catch (java.lang.Exception err11) {
			err11.printStackTrace();
		}
		try {
			class4.testDeserialization_Object();
		}
		catch (java.io.IOException err12) {
			err12.printStackTrace();
		}
		io.bootique.jackson.LocalDateTimeDeserializerIT class5 = new io.bootique.jackson.LocalDateTimeDeserializerIT();
		try {
			class5.testDeserialization11();
		}
		catch (java.lang.Exception err13) {
			err13.printStackTrace();
		}
		try {
			class5.testDeserialization2();
		}
		catch (java.lang.Exception err14) {
			err14.printStackTrace();
		}
		try {
			class5.testDeserialization_Nanoseconds();
		}
		catch (java.lang.Exception err15) {
			err15.printStackTrace();
		}
		io.bootique.jackson.LocalDateDeserializerIT class6 = new io.bootique.jackson.LocalDateDeserializerIT();
		try {
			class6.testDeserialization();
		}
		catch (java.lang.Throwable err16) {
			err16.printStackTrace();
		}
		io.bootique.jackson.LocalTimeDeserializerIT class7 = new io.bootique.jackson.LocalTimeDeserializerIT();
		try {
			class7.testDeserialization();
		}
		catch (java.lang.Exception err17) {
			err17.printStackTrace();
		}
		io.bootique.jackson.YearDeserializerIT class8 = new io.bootique.jackson.YearDeserializerIT();
		try {
			class8.testDeserialization_Value();
		}
		catch (java.lang.Exception err18) {
			err18.printStackTrace();
		}
		try {
			class8.testDeserialization_Object();
		}
		catch (java.lang.Exception err19) {
			err19.printStackTrace();
		}
		io.bootique.jackson.PercentValueYamlDeserializerIT class9 = new io.bootique.jackson.PercentValueYamlDeserializerIT();
		try {
			class9.testDeserialization_AsPercent();
		}
		catch (java.lang.Exception err20) {
			err20.printStackTrace();
		}
		try {
			class9.testDeserialization_AsDouble();
		}
		catch (java.lang.Exception err21) {
			err21.printStackTrace();
		}
		try {
			class9.testDeserialization_AsInt();
		}
		catch (java.lang.Exception err22) {
			err22.printStackTrace();
		}
		try {
			class9.testDeserialization_Object();
		}
		catch (java.io.IOException err23) {
			err23.printStackTrace();
		}
		io.bootique.jackson.OffsetDateTimeDeserializerIT class10 = new io.bootique.jackson.OffsetDateTimeDeserializerIT();
		try {
			class10.testDeserialization01();
		}
		catch (java.lang.Exception err24) {
			err24.printStackTrace();
		}
		try {
			class10.testDeserialization02();
		}
		catch (java.lang.Exception err25) {
			err25.printStackTrace();
		}
		try {
			class10.testDeserialization03();
		}
		catch (java.io.IOException err26) {
			err26.printStackTrace();
		}
		try {
			class10.testDeserializationWithTypeInfo01();
		}
		catch (java.lang.Exception err27) {
			err27.printStackTrace();
		}
		io.bootique.jackson.MonthDayDeserializerIT class11 = new io.bootique.jackson.MonthDayDeserializerIT();
		try {
			class11.testDeserialization_Value1();
		}
		catch (java.lang.Exception err28) {
			err28.printStackTrace();
		}
		try {
			class11.testDeserialization_Value2();
		}
		catch (java.lang.Exception err29) {
			err29.printStackTrace();
		}
		try {
			class11.testDeserialization_Object();
		}
		catch (java.io.IOException err30) {
			err30.printStackTrace();
		}
		try {
			class11.testDeserializationWithTypeInfo();
		}
		catch (java.lang.Exception err31) {
			err31.printStackTrace();
		}
		io.bootique.jackson.OffsetTimeDeserializerIT class12 = new io.bootique.jackson.OffsetTimeDeserializerIT();
		try {
			class12.testDeserialization01();
		}
		catch (java.lang.Exception err32) {
			err32.printStackTrace();
		}
		try {
			class12.testDeserialization02();
		}
		catch (java.lang.Exception err33) {
			err33.printStackTrace();
		}
		try {
			class12.testDeserialization03();
		}
		catch (java.io.IOException err34) {
			err34.printStackTrace();
		}
		try {
			class12.testDeserializationWithTypeInfo01();
		}
		catch (java.lang.Exception err35) {
			err35.printStackTrace();
		}
		io.bootique.jackson.DurationValueYamlDeserializerIT class13 = new io.bootique.jackson.DurationValueYamlDeserializerIT();
		try {
			class13.testDeserialization_AsString();
		}
		catch (java.io.IOException err36) {
			err36.printStackTrace();
		}
		try {
			class13.testDeserialization_AsString_Object();
		}
		catch (java.io.IOException err37) {
			err37.printStackTrace();
		}
		try {
			class13.testDeserialization_AsLongMs();
		}
		catch (java.io.IOException err38) {
			err38.printStackTrace();
		}
		try {
			class13.testDeserialization_AsLong_Object();
		}
		catch (java.io.IOException err39) {
			err39.printStackTrace();
		}
		io.bootique.jackson.DefaultJacksonServiceIT class14 = new io.bootique.jackson.DefaultJacksonServiceIT();
		class14.before();
		try {
			class14.testNewObjectMapper_Inheritance();
		}
		catch (java.io.IOException err40) {
			err40.printStackTrace();
		}
		io.bootique.jackson.InstantDeserializerIT class15 = new io.bootique.jackson.InstantDeserializerIT();
		try {
			class15.testDeserialize();
		}
		catch (java.lang.Exception err41) {
			err41.printStackTrace();
		}
		io.bootique.jackson.ZonedDateTimeDeserializerIT class16 = new io.bootique.jackson.ZonedDateTimeDeserializerIT();
		try {
			class16.testDeserialization01();
		}
		catch (java.lang.Exception err42) {
			err42.printStackTrace();
		}
		try {
			class16.testDeserialization02();
		}
		catch (java.lang.Exception err43) {
			err43.printStackTrace();
		}
		try {
			class16.testDeserialization03();
		}
		catch (java.io.IOException err44) {
			err44.printStackTrace();
		}
		try {
			class16.testDeserializationWithTypeInfo01();
		}
		catch (java.lang.Exception err45) {
			err45.printStackTrace();
		}
		io.bootique.jackson.DurationDeserializerIT class17 = new io.bootique.jackson.DurationDeserializerIT();
		try {
			class17.testDeserialization();
		}
		catch (java.lang.Exception err46) {
			err46.printStackTrace();
		}
		try {
			class17.testDeserializationAsFloat();
		}
		catch (java.lang.Exception err47) {
			err47.printStackTrace();
		}
	}
}