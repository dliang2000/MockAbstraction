package br.com.caelum.vraptor.serialization.xstream;

public class Driver {
	public void runall() {
		br.com.caelum.vraptor.serialization.xstream.XStreamXMLSerializationTest class1 = new br.com.caelum.vraptor.serialization.xstream.XStreamXMLSerializationTest();
		try {
			class1.setup();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		class1.shouldSerializeGenericClass();
		class1.shouldSerializeMaps();
		class1.shouldSerializeAllBasicFields();
		class1.shouldUseAlias();
		class1.shouldSerializeEnumFields();
		class1.shouldSerializeCollection();
		class1.shouldSerializeCollectionWithPrefixTag();
		class1.shouldIncludeFieldsFromACollection();
		class1.shouldWorkWithEmptyCollections();
		class1.shouldIncludeAllFieldsWhenRecursive();
		class1.shouldExcludeFieldsFromACollection();
		class1.shouldThrowAnExceptionWhenYouIncludeANonExistantField();
		class1.shouldThrowAnExceptionWhenYouIncludeANonExistantFieldInsideOther();
		class1.shouldSerializeCollectionWithPrefixTagAndNamespace();
		class1.shouldSerializeParentFields();
		class1.shouldOptionallyExcludeFields();
		class1.shouldOptionallyIncludeFieldAndNotItsNonPrimitiveFields();
		class1.shouldOptionallyIncludeChildField();
		class1.shouldOptionallyExcludeChildField();
		class1.shouldOptionallyIncludeListChildFields();
		class1.shouldOptionallyExcludeFieldsFromIncludedListChildFields();
		class1.shouldExcludeAllPrimitiveFields();
		class1.shouldExcludeAllPrimitiveParentFields();
		class1.shouldExcludeAllThanIncludeAndSerialize();
		class1.shouldAutomaticallyReadXStreamAnnotations();
		class1.shouldAutomaticallyReadXStreamAnnotationsForIncludedAttributes();
		try {
			class1.shouldBeAbleToIncludeSubclassesFields();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		br.com.caelum.vraptor.serialization.xstream.XStreamJSONSerializationTest class2 = new br.com.caelum.vraptor.serialization.xstream.XStreamJSONSerializationTest();
		try {
			class2.setup();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		class2.shouldSerializeGenericClass();
		class2.shouldSerializeAllBasicFields();
		class2.shouldSerializeAllBasicFieldsIdented();
		class2.shouldUseAlias();
		class2.shouldSerializeEnumFields();
		class2.shouldSerializeCollection();
		class2.shouldSerializeCollectionWithPrefixTag();
		class2.shouldExcludeNonPrimitiveFieldsFromACollection();
		class2.shouldSerializeCollectionWithPrefixTagAndNamespace();
		class2.shouldSerializeParentFields();
		class2.shouldExcludeNonPrimitiveParentFields();
		class2.shouldExcludeParentFields();
		class2.shouldExcludeAllPrimitiveFields();
		class2.shouldExcludeAllPrimitiveParentFields();
		class2.shouldExcludeAllPrimitiveFieldsInACollection();
		class2.shouldExcludeAllThanIncludeAndSerialize();
		class2.shouldOptionallyExcludeFields();
		class2.shouldOptionallyIncludeFieldAndNotItsNonPrimitiveFields();
		class2.shouldOptionallyIncludeChildField();
		class2.shouldOptionallyExcludeChildField();
		class2.shouldOptionallyIncludeListChildFields();
		class2.shouldOptionallyExcludeFieldsFromIncludedListChildFields();
		class2.shouldOptionallyRemoveRoot();
		class2.shouldOptionallyRemoveRootIdented();
		try {
			class2.shouldRunHibernateLazyInitialization();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		class2.shouldUseCollectionConverterWhenItExists();
		br.com.caelum.vraptor.serialization.xstream.XStreamJSONPSerializationTest class3 = new br.com.caelum.vraptor.serialization.xstream.XStreamJSONPSerializationTest();
		try {
			class3.setup();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		class3.shouldIncludeCallbackPadding();
		class3.shouldSerializeGenericClass();
	}
}