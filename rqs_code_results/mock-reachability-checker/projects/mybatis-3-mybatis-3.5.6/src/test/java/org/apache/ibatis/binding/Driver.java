/**
 *    Copyright ${license.git.copyrightYears} the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.apache.ibatis.binding;

public class Driver {
	public void runall() {
		org.apache.ibatis.binding.BindingTest class1 = new org.apache.ibatis.binding.BindingTest();
		try {
			class1.setup();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		class1.shouldSelectBlogWithPostsUsingSubSelect();
		class1.shouldFindPostsInList();
		class1.shouldFindPostsInArray();
		class1.shouldFindThreeSpecificPosts();
		class1.shouldInsertAuthorWithSelectKey();
		class1.verifyErrorMessageFromSelectKey();
		class1.verifyErrorMessageFromInsertAfterSelectKey();
		class1.shouldInsertAuthorWithSelectKeyAndDynamicParams();
		class1.shouldSelectRandom();
		class1.shouldExecuteBoundSelectListOfBlogsStatement();
		class1.shouldExecuteBoundSelectMapOfBlogsById();
		class1.shouldExecuteMultipleBoundSelectOfBlogsByIdInWithProvidedResultHandlerBetweenSessions();
		class1.shouldExecuteMultipleBoundSelectOfBlogsByIdInWithProvidedResultHandlerInSameSession();
		class1.shouldExecuteMultipleBoundSelectMapOfBlogsByIdInSameSessionWithoutClearingLocalCache();
		class1.shouldExecuteMultipleBoundSelectMapOfBlogsByIdBetweenTwoSessionsWithGlobalCacheEnabled();
		class1.shouldSelectListOfBlogsUsingXMLConfig();
		class1.shouldExecuteBoundSelectListOfBlogsStatementUsingProvider();
		class1.shouldExecuteBoundSelectListOfBlogsAsMaps();
		class1.shouldSelectListOfPostsLike();
		class1.shouldSelectListOfPostsLikeTwoParameters();
		class1.shouldExecuteBoundSelectOneBlogStatement();
		class1.shouldExecuteBoundSelectOneBlogStatementWithConstructor();
		class1.shouldExecuteBoundSelectBlogUsingConstructorWithResultMap();
		class1.shouldExecuteBoundSelectBlogUsingConstructorWithResultMapAndProperties();
		class1.shouldExecuteBoundSelectBlogUsingConstructorWithResultMapCollection();
		class1.shouldExecuteBoundSelectOneBlogStatementWithConstructorUsingXMLConfig();
		class1.shouldSelectOneBlogAsMap();
		class1.shouldSelectOneAuthor();
		class1.shouldSelectOneAuthorFromCache();
		class1.shouldSelectOneAuthorByConstructor();
		class1.shouldSelectDraftTypedPosts();
		class1.shouldSelectDraftTypedPostsWithResultMap();
		class1.shouldReturnANotNullToString();
		class1.shouldReturnANotNullHashCode();
		class1.shouldCompareTwoMappers();
		class1.shouldFailWhenSelectingOneBlogWithNonExistentParam();
		class1.shouldFailWhenSelectingOneBlogWithNullParam();
		class1.shouldFailWhenSelectingOneBlogWithNonExistentNestedParam();
		class1.shouldSelectBlogWithDefault30ParamNames();
		class1.shouldSelectBlogWithDefault31ParamNames();
		class1.shouldSelectBlogWithAParamNamedValue();
		try {
			class1.shouldCacheMapperMethod();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		class1.shouldGetBlogsWithAuthorsAndPosts();
		class1.shouldGetBlogsWithAuthorsAndPostsEagerly();
		class1.executeWithResultHandlerAndRowBounds();
		class1.executeWithMapKeyAndRowBounds();
		class1.executeWithCursorAndRowBounds();
		class1.registeredMappers();
		class1.shouldMapPropertiesUsingRepeatableAnnotation();
		class1.shouldMapConstructorUsingRepeatableAnnotation();
		class1.shouldMapUsingSingleRepeatableAnnotation();
		class1.shouldMapWhenSpecifyBothArgAndConstructorArgs();
		class1.shouldMapWhenSpecifyBothResultAndResults();
		org.apache.ibatis.binding.MapperMethodParamTest class2 = new org.apache.ibatis.binding.MapperMethodParamTest();
		try {
			class2.setup();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		class2.parameterNameIsSizeAndTypeIsLong();
		class2.parameterNameIsSizeUsingHashMap();
		org.apache.ibatis.binding.WrongNamespacesTest class3 = new org.apache.ibatis.binding.WrongNamespacesTest();
		class3.shouldFailForWrongNamespace();
		class3.shouldFailForMissingNamespace();
		org.apache.ibatis.binding.FlushTest class4 = new org.apache.ibatis.binding.FlushTest();
		try {
			class4.setup();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		class4.invokeFlushStatementsViaMapper();
		org.apache.ibatis.binding.WrongMapperTest class5 = new org.apache.ibatis.binding.WrongMapperTest();
		class5.shouldFailForBothOneAndMany();
	}
}