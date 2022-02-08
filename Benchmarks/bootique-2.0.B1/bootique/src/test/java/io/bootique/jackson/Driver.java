package io.bootique.jackson;

public class Driver {
	public void runall() {
		io.bootique.jackson.DurationDeserializerIT class1 = new io.bootique.jackson.DurationDeserializerIT();
		try {
			class1.testDeserialization();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class1.testDeserializationAsFloat();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		io.bootique.jackson.OffsetTimeDeserializerIT class2 = new io.bootique.jackson.OffsetTimeDeserializerIT();
		try {
			class2.testDeserialization01();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		try {
			class2.testDeserialization02();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		try {
			class2.testDeserialization03();
		}
		catch (java.io.IOException err5) {
			err5.printStackTrace();
		}
		try {
			class2.testDeserializationWithTypeInfo01();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		io.bootique.jackson.DurationValueYamlDeserializerIT class3 = new io.bootique.jackson.DurationValueYamlDeserializerIT();
		try {
			class3.testDeserialization_AsString();
		}
		catch (java.io.IOException err7) {
			err7.printStackTrace();
		}
		try {
			class3.testDeserialization_AsString_Object();
		}
		catch (java.io.IOException err8) {
			err8.printStackTrace();
		}
		try {
			class3.testDeserialization_AsLongMs();
		}
		catch (java.io.IOException err9) {
			err9.printStackTrace();
		}
		try {
			class3.testDeserialization_AsLong_Object();
		}
		catch (java.io.IOException err10) {
			err10.printStackTrace();
		}
		io.bootique.jackson.ZonedDateTimeDeserializerIT class4 = new io.bootique.jackson.ZonedDateTimeDeserializerIT();
		try {
			class4.testDeserialization01();
		}
		catch (java.lang.Exception err11) {
			err11.printStackTrace();
		}
		try {
			class4.testDeserialization02();
		}
		catch (java.lang.Exception err12) {
			err12.printStackTrace();
		}
		try {
			class4.testDeserialization03();
		}
		catch (java.io.IOException err13) {
			err13.printStackTrace();
		}
		try {
			class4.testDeserializationWithTypeInfo01();
		}
		catch (java.lang.Exception err14) {
			err14.printStackTrace();
		}
		io.bootique.jackson.MonthDayDeserializerIT class5 = new io.bootique.jackson.MonthDayDeserializerIT();
		try {
			class5.testDeserialization_Value1();
		}
		catch (java.lang.Exception err15) {
			err15.printStackTrace();
		}
		try {
			class5.testDeserialization_Value2();
		}
		catch (java.lang.Exception err16) {
			err16.printStackTrace();
		}
		try {
			class5.testDeserialization_Object();
		}
		catch (java.io.IOException err17) {
			err17.printStackTrace();
		}
		try {
			class5.testDeserializationWithTypeInfo();
		}
		catch (java.lang.Exception err18) {
			err18.printStackTrace();
		}
		io.bootique.jackson.ZoneOffSetDeserializerIT class6 = new io.bootique.jackson.ZoneOffSetDeserializerIT();
		try {
			class6.testDeserialization01();
		}
		catch (java.lang.Exception err19) {
			err19.printStackTrace();
		}
		try {
			class6.testDeserialization02();
		}
		catch (java.lang.Exception err20) {
			err20.printStackTrace();
		}
		try {
			class6.testDeserialization03();
		}
		catch (java.lang.Exception err21) {
			err21.printStackTrace();
		}
		try {
			class6.testDeserialization04();
		}
		catch (java.io.IOException err22) {
			err22.printStackTrace();
		}
		try {
			class6.testDeserializationWithTypeInfo01();
		}
		catch (java.lang.Exception err23) {
			err23.printStackTrace();
		}
		io.bootique.jackson.DefaultJacksonServiceIT class7 = new io.bootique.jackson.DefaultJacksonServiceIT();
		class7.before();
		try {
			class7.testNewObjectMapper_Inheritance();
		}
		catch (java.io.IOException err24) {
			err24.printStackTrace();
		}
		io.bootique.jackson.LocalDateTimeDeserializerIT class8 = new io.bootique.jackson.LocalDateTimeDeserializerIT();
		try {
			class8.testDeserialization11();
		}
		catch (java.lang.Exception err25) {
			err25.printStackTrace();
		}
		try {
			class8.testDeserialization2();
		}
		catch (java.lang.Exception err26) {
			err26.printStackTrace();
		}
		try {
			class8.testDeserialization_Nanoseconds();
		}
		catch (java.lang.Exception err27) {
			err27.printStackTrace();
		}
		io.bootique.jackson.InstantDeserializerIT class9 = new io.bootique.jackson.InstantDeserializerIT();
		try {
			class9.testDeserialize();
		}
		catch (java.lang.Exception err28) {
			err28.printStackTrace();
		}
		io.bootique.jackson.OffsetDateTimeDeserializerIT class10 = new io.bootique.jackson.OffsetDateTimeDeserializerIT();
		try {
			class10.testDeserialization01();
		}
		catch (java.lang.Exception err29) {
			err29.printStackTrace();
		}
		try {
			class10.testDeserialization02();
		}
		catch (java.lang.Exception err30) {
			err30.printStackTrace();
		}
		try {
			class10.testDeserialization03();
		}
		catch (java.io.IOException err31) {
			err31.printStackTrace();
		}
		try {
			class10.testDeserializationWithTypeInfo01();
		}
		catch (java.lang.Exception err32) {
			err32.printStackTrace();
		}
		io.bootique.jackson.PercentValueYamlDeserializerIT class11 = new io.bootique.jackson.PercentValueYamlDeserializerIT();
		try {
			class11.testDeserialization_AsPercent();
		}
		catch (java.lang.Exception err33) {
			err33.printStackTrace();
		}
		try {
			class11.testDeserialization_AsDouble();
		}
		catch (java.lang.Exception err34) {
			err34.printStackTrace();
		}
		try {
			class11.testDeserialization_AsInt();
		}
		catch (java.lang.Exception err35) {
			err35.printStackTrace();
		}
		try {
			class11.testDeserialization_Object();
		}
		catch (java.io.IOException err36) {
			err36.printStackTrace();
		}
		io.bootique.jackson.DateDeserializerIT class12 = new io.bootique.jackson.DateDeserializerIT();
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
		io.bootique.jackson.LocalDateDeserializerIT class14 = new io.bootique.jackson.LocalDateDeserializerIT();
		try {
			class14.testDeserialization();
		}
		catch (java.lang.Throwable err40) {
			err40.printStackTrace();
		}
		io.bootique.jackson.PeriodDeserializerIT class15 = new io.bootique.jackson.PeriodDeserializerIT();
		try {
			class15.testDeserialization_Value1();
		}
		catch (java.lang.Exception err41) {
			err41.printStackTrace();
		}
		try {
			class15.testDeserialization_Value2();
		}
		catch (java.lang.Exception err42) {
			err42.printStackTrace();
		}
		try {
			class15.testDeserialization_Object();
		}
		catch (java.io.IOException err43) {
			err43.printStackTrace();
		}
		io.bootique.jackson.YearMonthDeserializerIT class16 = new io.bootique.jackson.YearMonthDeserializerIT();
		try {
			class16.testDeserialization_Value1();
		}
		catch (java.lang.Exception err44) {
			err44.printStackTrace();
		}
		try {
			class16.testDeserialization_Value2();
		}
		catch (java.lang.Exception err45) {
			err45.printStackTrace();
		}
		try {
			class16.testDeserialization_Pattern();
		}
		catch (java.lang.Exception err46) {
			err46.printStackTrace();
		}
		io.bootique.jackson.LocalTimeDeserializerIT class17 = new io.bootique.jackson.LocalTimeDeserializerIT();
		try {
			class17.testDeserialization();
		}
		catch (java.lang.Exception err47) {
			err47.printStackTrace();
		}
	}
}