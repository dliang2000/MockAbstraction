package br.com.caelum.vraptor.serialization;

public class Driver {
	public void runall() {
		br.com.caelum.vraptor.serialization.DefaultXMLConfigurationTest class1 = new br.com.caelum.vraptor.serialization.DefaultXMLConfigurationTest();
		class1.setup();
		class1.shouldUndernalizeAllCamelcase();
		class1.shouldUndernalizeAllCamelcaseCharacters();
		br.com.caelum.vraptor.serialization.HTMLSerializationTest class2 = new br.com.caelum.vraptor.serialization.HTMLSerializationTest();
		try {
			class2.setUp();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class2.shouldForwardToDefaultViewWithoutAlias();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class2.shouldForwardToDefaultViewWithAlias();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		try {
			class2.shouldIncludeOnResultWithoutAlias();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		try {
			class2.shouldIncludeOnResultWithAlias();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class2.shouldReturnAnIgnoringSerializerWithoutAlias();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		try {
			class2.shouldReturnAnIgnoringSerializerWithAlias();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		br.com.caelum.vraptor.serialization.I18nMessageSerializationTest class3 = new br.com.caelum.vraptor.serialization.I18nMessageSerializationTest();
		try {
			class3.setup();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		class3.shouldCallXStreamJsonSerialization();
		class3.shouldCallXStreamXmlSerialization();
		class3.shouldCallXStreamSerializationWithParams();
		br.com.caelum.vraptor.serialization.PackageComparatorTest class4 = new br.com.caelum.vraptor.serialization.PackageComparatorTest();
		class4.shouldSortBasedOnPackageNamesLessPriorityToCaelumInitialList3rdPartyFirst();
		class4.shouldSortBasedOnPackageNamesLessPriorityToCaelumInitialList3rdPartyLast();
		class4.shouldSortBasedOnPackageNamesLessPriorityToCaelumMoreToRestfulieInitialList3rdPartyLast();
		br.com.caelum.vraptor.serialization.DefaultRepresentationResultTest class5 = new br.com.caelum.vraptor.serialization.DefaultRepresentationResultTest();
		try {
			class5.setUp();
		}
		catch (java.lang.Exception err9) {
			err9.printStackTrace();
		}
		try {
			class5.whenThereIsNoFormatGivenShouldForwardToDefaultPage();
		}
		catch (java.lang.Exception err10) {
			err10.printStackTrace();
		}
		try {
			class5.shouldSend404IfNothingIsRendered();
		}
		catch (java.lang.Exception err11) {
			err11.printStackTrace();
		}
		try {
			class5.whenThereIsNoFormatGivenShouldForwardToDefaultPageWithAlias();
		}
		catch (java.lang.Exception err12) {
			err12.printStackTrace();
		}
		try {
			class5.whenThereIsAFormatGivenShouldUseCorrectSerializer();
		}
		catch (java.lang.Exception err13) {
			err13.printStackTrace();
		}
		try {
			class5.whenThereIsAFormatGivenShouldUseCorrectSerializerWithAlias();
		}
		catch (java.lang.Exception err14) {
			err14.printStackTrace();
		}
		try {
			class5.whenSerializationDontAcceptsFormatItShouldntBeUsed();
		}
		catch (java.lang.Exception err15) {
			err15.printStackTrace();
		}
		try {
			class5.whenTheResourceIsHypermediaAddRestHeaders();
		}
		catch (java.lang.Exception err16) {
			err16.printStackTrace();
		}
	}
}