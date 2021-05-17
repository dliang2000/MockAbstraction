package br.com.caelum.vraptor.serialization.gson;

public class Driver {
	public void runall() {
		br.com.caelum.vraptor.serialization.gson.GsonJSONSerializationTest class1 = new br.com.caelum.vraptor.serialization.gson.GsonJSONSerializationTest();
		try {
			class1.setup();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		class1.shouldSerializeGenericClass();
		class1.shouldSerializeAllBasicFields();
		class1.shouldSerializeAllBasicFieldsIdented();
		class1.shouldUseAlias();
		class1.shouldSerializeEnumFields();
		class1.shouldSerializeCollection();
		class1.shouldSerializeCollectionWithPrefixTag();
		class1.shouldExcludeNonPrimitiveFieldsFromACollection();
		class1.shouldSerializeCollectionWithPrefixTagAndNamespace();
		class1.shouldSerializeParentFields();
		class1.shouldExcludeNonPrimitiveParentFields();
		class1.shouldExcludeParentFields();
		class1.shouldOptionallyExcludeFields();
		class1.shouldOptionallyIncludeFieldAndNotItsNonPrimitiveFields();
		class1.shouldOptionallyIncludeChildField();
		class1.shouldOptionallyExcludeChildField();
		class1.shouldOptionallyIncludeListChildFields();
		class1.shouldOptionallyExcludeFieldsFromIncludedListChildFields();
		class1.shouldOptionallyRemoveRoot();
		class1.shouldOptionallyRemoveRootIdented();
		try {
			class1.shouldRunHibernateLazyInitialization();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		class1.shouldUseCollectionConverterWhenItExists();
		class1.shouldSerializeCalendarLikeXstream();
		class1.shouldSerializeCalendarLikeISO8601();
		class1.shouldExcludeAllPrimitiveFields();
		class1.shouldExcludeAllPrimitiveParentFields();
		class1.shouldExcludeAllThanIncludeAndSerialize();
	}
}