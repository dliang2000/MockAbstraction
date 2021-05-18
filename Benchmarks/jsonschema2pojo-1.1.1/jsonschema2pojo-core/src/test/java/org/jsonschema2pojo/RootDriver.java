package org.jsonschema2pojo;

public class RootDriver {
	public static void main(String[] argv) {
		org.jsonschema2pojo.example.Driver class1 = new org.jsonschema2pojo.example.Driver();
		class1.runall();
		org.jsonschema2pojo.util.Driver class2 = new org.jsonschema2pojo.util.Driver();
		class2.runall();
		org.jsonschema2pojo.rules.Driver class3 = new org.jsonschema2pojo.rules.Driver();
		class3.runall();
		org.jsonschema2pojo.SchemaStoreTest class4 = new org.jsonschema2pojo.SchemaStoreTest();
		try {
			class4.createWithAbsolutePath();
		}
		catch (java.net.URISyntaxException err1) {
			err1.printStackTrace();
		}
		try {
			class4.createWithRelativePath();
		}
		catch (java.net.URISyntaxException err2) {
			err2.printStackTrace();
		}
		try {
			class4.createWithRelativeSegmentsInPath();
		}
		catch (java.net.URISyntaxException err3) {
			err3.printStackTrace();
		}
		try {
			class4.createWithSelfRef();
		}
		catch (java.net.URISyntaxException err4) {
			err4.printStackTrace();
		}
		try {
			class4.createWithEmbeddedSelfRef();
		}
		catch (java.net.URISyntaxException err5) {
			err5.printStackTrace();
		}
		try {
			class4.createWithFragmentResolution();
		}
		catch (java.net.URISyntaxException err6) {
			err6.printStackTrace();
		}
		try {
			class4.schemaAlreadyReadIsReused();
		}
		catch (java.net.URISyntaxException err7) {
			err7.printStackTrace();
		}
		try {
			class4.setIfEmptyOnlySetsIfEmpty();
		}
		catch (java.net.URISyntaxException err8) {
			err8.printStackTrace();
		}
		org.jsonschema2pojo.FragmentResolverTest class5 = new org.jsonschema2pojo.FragmentResolverTest();
		class5.hashResolvesToRoot();
		class5.slashDelimitedWordsResolveToChildNodes();
		class5.pathCanReferToArrayContentsByIndex();
		class5.pathCanReferToArrayContentsAtTheDocumentRoot();
		class5.missingPathThrowsIllegalArgumentException();
		class5.attemptToUsePropertyNameOnArrayNodeThrowsIllegalArgumentException();
		org.jsonschema2pojo.AnnotatorFactoryTest class6 = new org.jsonschema2pojo.AnnotatorFactoryTest();
		class6.canCreateCorrectAnnotatorFromAnnotationStyle();
		class6.canCreateCorrectAnnotatorFromClass();
		class6.canCreateCompositeAnnotator();
		try {
			class6.attemptToCreateAnnotatorFromIncompatibleClassCausesIllegalArgumentException();
		}
		catch (java.lang.NoSuchMethodException err9) {
			err9.printStackTrace();
		}
		catch (java.lang.IllegalAccessException err10) {
			err10.printStackTrace();
		}
		catch (java.lang.reflect.InvocationTargetException err11) {
			err11.printStackTrace();
		}
		org.jsonschema2pojo.SchemaMapperTest class7 = new org.jsonschema2pojo.SchemaMapperTest();
		try {
			class7.generateReadsSchemaAsObject();
		}
		catch (java.io.IOException err12) {
			err12.printStackTrace();
		}
		try {
			class7.generateCreatesSchemaFromExampleJsonWhenInJsonMode();
		}
		catch (java.io.IOException err13) {
			err13.printStackTrace();
		}
		try {
			class7.generateCreatesSchemaFromExampleJSONAsStringInput();
		}
		catch (java.io.IOException err14) {
			err14.printStackTrace();
		}
		try {
			class7.generateCreatesSchemaFromSchemaAsStringInput();
		}
		catch (java.io.IOException err15) {
			err15.printStackTrace();
		}
		org.jsonschema2pojo.ContentResolverTest class8 = new org.jsonschema2pojo.ContentResolverTest();
		class8.wrongProtocolCausesIllegalArgumentException();
		try {
			class8.fileLinkIsResolvedToContent();
		}
		catch (java.io.IOException err16) {
			err16.printStackTrace();
		}
		class8.classpathLinkIsResolvedToContent();
		org.jsonschema2pojo.ContentResolverNetworkTest class9 = new org.jsonschema2pojo.ContentResolverNetworkTest();
		class9.before();
		class9.after();
		class9.brokenLinkCausesIllegalArgumentException();
		class9.serverErrorCausesIllegalArgumentException();
		class9.httpLinkIsResolvedToContent();
		org.jsonschema2pojo.SourceSortOrderTest class10 = new org.jsonschema2pojo.SourceSortOrderTest();
		try {
			class10.testTwoFilesAreCompared_FILES_FIRST();
		}
		catch (java.io.IOException err17) {
			err17.printStackTrace();
		}
		try {
			class10.twoDirectoriesAreCompared_FILES_FIRST();
		}
		catch (java.io.IOException err18) {
			err18.printStackTrace();
		}
		try {
			class10.testTwoFilesAreCompared_SUBDIRS_FIRST();
		}
		catch (java.io.IOException err19) {
			err19.printStackTrace();
		}
		try {
			class10.twoDirectoriesAreCompared_SUBDIRS_FIRST();
		}
		catch (java.io.IOException err20) {
			err20.printStackTrace();
		}
		class10.filesBeforeDirectories_FILES_FIRST();
		class10.filesBeforeDirectories_SUBDIRS_FIRST();
	}
}