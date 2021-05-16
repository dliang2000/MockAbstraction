package io.bootique.jackson;

public class Driver {
	public void runall() {
		io.bootique.jackson.DefaultJacksonServiceIT class1 = new io.bootique.jackson.DefaultJacksonServiceIT();
		class1.before();
		try {
			class1.testNewObjectMapper_Inheritance();
		}
		catch (java.io.IOException err1) {
			err1.printStackTrace();
		}
		io.bootique.jackson.LocalDateDeserializerIT class2 = new io.bootique.jackson.LocalDateDeserializerIT();
		try {
			class2.testDeserialization();
		}
		catch (java.lang.Throwable err2) {
			err2.printStackTrace();
		}
		io.bootique.jackson.InstantDeserializerIT class3 = new io.bootique.jackson.InstantDeserializerIT();
		try {
			class3.testDeserialize();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		io.bootique.jackson.OffsetTimeDeserializerIT class4 = new io.bootique.jackson.OffsetTimeDeserializerIT();
		try {
			class4.testDeserialization01();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		try {
			class4.testDeserialization02();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class4.testDeserialization03();
		}
		catch (java.io.IOException err6) {
			err6.printStackTrace();
		}
		try {
			class4.testDeserializationWithTypeInfo01();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		io.bootique.jackson.DurationDeserializerIT class5 = new io.bootique.jackson.DurationDeserializerIT();
		try {
			class5.testDeserialization();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		try {
			class5.testDeserializationAsFloat();
		}
		catch (java.lang.Exception err9) {
			err9.printStackTrace();
		}
		io.bootique.jackson.ZoneOffSetDeserializerIT class6 = new io.bootique.jackson.ZoneOffSetDeserializerIT();
		try {
			class6.testDeserialization01();
		}
		catch (java.lang.Exception err10) {
			err10.printStackTrace();
		}
		try {
			class6.testDeserialization02();
		}
		catch (java.lang.Exception err11) {
			err11.printStackTrace();
		}
		try {
			class6.testDeserialization03();
		}
		catch (java.lang.Exception err12) {
			err12.printStackTrace();
		}
		try {
			class6.testDeserialization04();
		}
		catch (java.io.IOException err13) {
			err13.printStackTrace();
		}
		try {
			class6.testDeserializationWithTypeInfo01();
		}
		catch (java.lang.Exception err14) {
			err14.printStackTrace();
		}
		io.bootique.jackson.YearMonthDeserializerIT class7 = new io.bootique.jackson.YearMonthDeserializerIT();
		try {
			class7.testDeserialization_Value1();
		}
		catch (java.lang.Exception err15) {
			err15.printStackTrace();
		}
		try {
			class7.testDeserialization_Value2();
		}
		catch (java.lang.Exception err16) {
			err16.printStackTrace();
		}
		try {
			class7.testDeserialization_Pattern();
		}
		catch (java.lang.Exception err17) {
			err17.printStackTrace();
		}
		io.bootique.jackson.LocalTimeDeserializerIT class8 = new io.bootique.jackson.LocalTimeDeserializerIT();
		try {
			class8.testDeserialization();
		}
		catch (java.lang.Exception err18) {
			err18.printStackTrace();
		}
		io.bootique.jackson.DurationValueYamlDeserializerIT class9 = new io.bootique.jackson.DurationValueYamlDeserializerIT();
		try {
			class9.testDeserialization_AsString();
		}
		catch (java.io.IOException err19) {
			err19.printStackTrace();
		}
		try {
			class9.testDeserialization_AsString_Object();
		}
		catch (java.io.IOException err20) {
			err20.printStackTrace();
		}
		try {
			class9.testDeserialization_AsLongMs();
		}
		catch (java.io.IOException err21) {
			err21.printStackTrace();
		}
		try {
			class9.testDeserialization_AsLong_Object();
		}
		catch (java.io.IOException err22) {
			err22.printStackTrace();
		}
		io.bootique.jackson.YearDeserializerIT class10 = new io.bootique.jackson.YearDeserializerIT();
		try {
			class10.testDeserialization_Value();
		}
		catch (java.lang.Exception err23) {
			err23.printStackTrace();
		}
		try {
			class10.testDeserialization_Object();
		}
		catch (java.lang.Exception err24) {
			err24.printStackTrace();
		}
		io.bootique.jackson.ZonedDateTimeDeserializerIT class11 = new io.bootique.jackson.ZonedDateTimeDeserializerIT();
		try {
			class11.testDeserialization01();
		}
		catch (java.lang.Exception err25) {
			err25.printStackTrace();
		}
		try {
			class11.testDeserialization02();
		}
		catch (java.lang.Exception err26) {
			err26.printStackTrace();
		}
		try {
			class11.testDeserialization03();
		}
		catch (java.io.IOException err27) {
			err27.printStackTrace();
		}
		try {
			class11.testDeserializationWithTypeInfo01();
		}
		catch (java.lang.Exception err28) {
			err28.printStackTrace();
		}
		io.bootique.jackson.PercentValueYamlDeserializerIT class12 = new io.bootique.jackson.PercentValueYamlDeserializerIT();
		try {
			class12.testDeserialization_AsPercent();
		}
		catch (java.lang.Exception err29) {
			err29.printStackTrace();
		}
		try {
			class12.testDeserialization_AsDouble();
		}
		catch (java.lang.Exception err30) {
			err30.printStackTrace();
		}
		try {
			class12.testDeserialization_AsInt();
		}
		catch (java.lang.Exception err31) {
			err31.printStackTrace();
		}
		try {
			class12.testDeserialization_Object();
		}
		catch (java.io.IOException err32) {
			err32.printStackTrace();
		}
		io.bootique.jackson.OffsetDateTimeDeserializerIT class13 = new io.bootique.jackson.OffsetDateTimeDeserializerIT();
		try {
			class13.testDeserialization01();
		}
		catch (java.lang.Exception err33) {
			err33.printStackTrace();
		}
		try {
			class13.testDeserialization02();
		}
		catch (java.lang.Exception err34) {
			err34.printStackTrace();
		}
		try {
			class13.testDeserialization03();
		}
		catch (java.io.IOException err35) {
			err35.printStackTrace();
		}
		try {
			class13.testDeserializationWithTypeInfo01();
		}
		catch (java.lang.Exception err36) {
			err36.printStackTrace();
		}
		io.bootique.jackson.LocalDateTimeDeserializerIT class14 = new io.bootique.jackson.LocalDateTimeDeserializerIT();
		try {
			class14.testDeserialization11();
		}
		catch (java.lang.Exception err37) {
			err37.printStackTrace();
		}
		try {
			class14.testDeserialization2();
		}
		catch (java.lang.Exception err38) {
			err38.printStackTrace();
		}
		try {
			class14.testDeserialization_Nanoseconds();
		}
		catch (java.lang.Exception err39) {
			err39.printStackTrace();
		}
		io.bootique.jackson.PeriodDeserializerIT class15 = new io.bootique.jackson.PeriodDeserializerIT();
		try {
			class15.testDeserialization_Value1();
		}
		catch (java.lang.Exception err40) {
			err40.printStackTrace();
		}
		try {
			class15.testDeserialization_Value2();
		}
		catch (java.lang.Exception err41) {
			err41.printStackTrace();
		}
		try {
			class15.testDeserialization_Object();
		}
		catch (java.io.IOException err42) {
			err42.printStackTrace();
		}
		io.bootique.jackson.MonthDayDeserializerIT class16 = new io.bootique.jackson.MonthDayDeserializerIT();
		try {
			class16.testDeserialization_Value1();
		}
		catch (java.lang.Exception err43) {
			err43.printStackTrace();
		}
		try {
			class16.testDeserialization_Value2();
		}
		catch (java.lang.Exception err44) {
			err44.printStackTrace();
		}
		try {
			class16.testDeserialization_Object();
		}
		catch (java.io.IOException err45) {
			err45.printStackTrace();
		}
		try {
			class16.testDeserializationWithTypeInfo();
		}
		catch (java.lang.Exception err46) {
			err46.printStackTrace();
		}
		io.bootique.jackson.DateDeserializerIT class17 = new io.bootique.jackson.DateDeserializerIT();
		try {
			class17.testDeserialize();
		}
		catch (java.lang.Exception err47) {
			err47.printStackTrace();
		}
	}
}