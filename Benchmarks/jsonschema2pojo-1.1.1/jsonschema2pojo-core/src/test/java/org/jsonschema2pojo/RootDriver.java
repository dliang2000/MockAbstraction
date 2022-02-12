/**
 * Copyright © 2010-2020 Nokia
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jsonschema2pojo;

public class RootDriver {
	public static void main(String[] argv) {
		org.jsonschema2pojo.example.Driver class1 = new org.jsonschema2pojo.example.Driver();
		class1.runall();
		org.jsonschema2pojo.util.Driver class2 = new org.jsonschema2pojo.util.Driver();
		class2.runall();
		org.jsonschema2pojo.rules.Driver class3 = new org.jsonschema2pojo.rules.Driver();
		class3.runall();
		org.jsonschema2pojo.FragmentResolverTest class4 = new org.jsonschema2pojo.FragmentResolverTest();
		class4.hashResolvesToRoot();
		class4.slashDelimitedWordsResolveToChildNodes();
		class4.pathCanReferToArrayContentsByIndex();
		class4.pathCanReferToArrayContentsAtTheDocumentRoot();
		class4.missingPathThrowsIllegalArgumentException();
		class4.attemptToUsePropertyNameOnArrayNodeThrowsIllegalArgumentException();
		org.jsonschema2pojo.SchemaMapperTest class5 = new org.jsonschema2pojo.SchemaMapperTest();
		try {
			class5.generateReadsSchemaAsObject();
		}
		catch (java.io.IOException err1) {
			err1.printStackTrace();
		}
		try {
			class5.generateCreatesSchemaFromExampleJsonWhenInJsonMode();
		}
		catch (java.io.IOException err2) {
			err2.printStackTrace();
		}
		try {
			class5.generateCreatesSchemaFromExampleJSONAsStringInput();
		}
		catch (java.io.IOException err3) {
			err3.printStackTrace();
		}
		try {
			class5.generateCreatesSchemaFromSchemaAsStringInput();
		}
		catch (java.io.IOException err4) {
			err4.printStackTrace();
		}
		org.jsonschema2pojo.ContentResolverNetworkTest class6 = new org.jsonschema2pojo.ContentResolverNetworkTest();
		class6.before();
		class6.after();
		class6.brokenLinkCausesIllegalArgumentException();
		class6.serverErrorCausesIllegalArgumentException();
		class6.httpLinkIsResolvedToContent();
		org.jsonschema2pojo.AnnotatorFactoryTest class7 = new org.jsonschema2pojo.AnnotatorFactoryTest();
		class7.canCreateCorrectAnnotatorFromAnnotationStyle();
		class7.canCreateCorrectAnnotatorFromClass();
		class7.canCreateCompositeAnnotator();
		try {
			class7.attemptToCreateAnnotatorFromIncompatibleClassCausesIllegalArgumentException();
		}
		catch (java.lang.NoSuchMethodException err5) {
			err5.printStackTrace();
		}
		catch (java.lang.IllegalAccessException err6) {
			err6.printStackTrace();
		}
		catch (java.lang.reflect.InvocationTargetException err7) {
			err7.printStackTrace();
		}
		org.jsonschema2pojo.SchemaStoreTest class8 = new org.jsonschema2pojo.SchemaStoreTest();
		try {
			class8.createWithAbsolutePath();
		}
		catch (java.net.URISyntaxException err8) {
			err8.printStackTrace();
		}
		try {
			class8.createWithRelativePath();
		}
		catch (java.net.URISyntaxException err9) {
			err9.printStackTrace();
		}
		try {
			class8.createWithRelativeSegmentsInPath();
		}
		catch (java.net.URISyntaxException err10) {
			err10.printStackTrace();
		}
		try {
			class8.createWithSelfRef();
		}
		catch (java.net.URISyntaxException err11) {
			err11.printStackTrace();
		}
		try {
			class8.createWithEmbeddedSelfRef();
		}
		catch (java.net.URISyntaxException err12) {
			err12.printStackTrace();
		}
		try {
			class8.createWithFragmentResolution();
		}
		catch (java.net.URISyntaxException err13) {
			err13.printStackTrace();
		}
		try {
			class8.schemaAlreadyReadIsReused();
		}
		catch (java.net.URISyntaxException err14) {
			err14.printStackTrace();
		}
		try {
			class8.setIfEmptyOnlySetsIfEmpty();
		}
		catch (java.net.URISyntaxException err15) {
			err15.printStackTrace();
		}
		org.jsonschema2pojo.SourceSortOrderTest class9 = new org.jsonschema2pojo.SourceSortOrderTest();
		try {
			class9.testTwoFilesAreCompared_FILES_FIRST();
		}
		catch (java.io.IOException err16) {
			err16.printStackTrace();
		}
		try {
			class9.twoDirectoriesAreCompared_FILES_FIRST();
		}
		catch (java.io.IOException err17) {
			err17.printStackTrace();
		}
		try {
			class9.testTwoFilesAreCompared_SUBDIRS_FIRST();
		}
		catch (java.io.IOException err18) {
			err18.printStackTrace();
		}
		try {
			class9.twoDirectoriesAreCompared_SUBDIRS_FIRST();
		}
		catch (java.io.IOException err19) {
			err19.printStackTrace();
		}
		class9.filesBeforeDirectories_FILES_FIRST();
		class9.filesBeforeDirectories_SUBDIRS_FIRST();
		org.jsonschema2pojo.ContentResolverTest class10 = new org.jsonschema2pojo.ContentResolverTest();
		class10.wrongProtocolCausesIllegalArgumentException();
		try {
			class10.fileLinkIsResolvedToContent();
		}
		catch (java.io.IOException err20) {
			err20.printStackTrace();
		}
		class10.classpathLinkIsResolvedToContent();
	}
}