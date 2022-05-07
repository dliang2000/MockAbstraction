package br.com.caelum.vraptor.serialization.xstream;

public class Driver {
	public void runall() {
		br.com.caelum.vraptor.serialization.xstream.XStreamJSONSerializationTest class1 = new br.com.caelum.vraptor.serialization.xstream.XStreamJSONSerializationTest();
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
		class1.shouldExcludeAllPrimitiveFields();
		class1.shouldExcludeAllPrimitiveParentFields();
		class1.shouldExcludeAllPrimitiveFieldsInACollection();
		class1.shouldExcludeAllThanIncludeAndSerialize();
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
		br.com.caelum.vraptor.serialization.xstream.XStreamXMLSerializationTest class2 = new br.com.caelum.vraptor.serialization.xstream.XStreamXMLSerializationTest();
		try {
			class2.setup();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		class2.shouldSerializeGenericClass();
		class2.shouldSerializeMaps();
		class2.shouldSerializeAllBasicFields();
		class2.shouldUseAlias();
		class2.shouldSerializeEnumFields();
		class2.shouldSerializeCollection();
		class2.shouldSerializeCollectionWithPrefixTag();
		class2.shouldIncludeFieldsFromACollection();
		class2.shouldWorkWithEmptyCollections();
		class2.shouldIncludeAllFieldsWhenRecursive();
		class2.shouldExcludeFieldsFromACollection();
		class2.shouldThrowAnExceptionWhenYouIncludeANonExistantField();
		class2.shouldThrowAnExceptionWhenYouIncludeANonExistantFieldInsideOther();
		class2.shouldSerializeCollectionWithPrefixTagAndNamespace();
		class2.shouldSerializeParentFields();
		class2.shouldOptionallyExcludeFields();
		class2.shouldOptionallyIncludeFieldAndNotItsNonPrimitiveFields();
		class2.shouldOptionallyIncludeChildField();
		class2.shouldOptionallyExcludeChildField();
		class2.shouldOptionallyIncludeListChildFields();
		class2.shouldOptionallyExcludeFieldsFromIncludedListChildFields();
		class2.shouldExcludeAllPrimitiveFields();
		class2.shouldExcludeAllPrimitiveParentFields();
		class2.shouldExcludeAllThanIncludeAndSerialize();
		class2.shouldAutomaticallyReadXStreamAnnotations();
		class2.shouldAutomaticallyReadXStreamAnnotationsForIncludedAttributes();
		try {
			class2.shouldBeAbleToIncludeSubclassesFields();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
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