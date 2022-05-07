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
package org.apache.ibatis.session;

public class Driver {
	public void runall() {
		org.apache.ibatis.session.AutoMappingUnknownColumnBehaviorTest class1 = new org.apache.ibatis.session.AutoMappingUnknownColumnBehaviorTest();
		try {
			class1.setup();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		class1.none();
		class1.warningCauseByUnknownPropertyType();
		class1.failingCauseByUnknownColumn();
		org.apache.ibatis.session.SqlSessionTest class2 = new org.apache.ibatis.session.SqlSessionTest();
		try {
			class2.setup();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		class2.shouldResolveBothSimpleNameAndFullyQualifiedName();
		class2.shouldFailOverToMostApplicableSimpleName();
		class2.shouldSucceedWhenFullyQualifiedButFailDueToAmbiguity();
		class2.shouldFailToAddDueToNameConflict();
		class2.shouldOpenAndClose();
		class2.shouldCommitAnUnUsedSqlSession();
		class2.shouldRollbackAnUnUsedSqlSession();
		class2.shouldSelectAllAuthors();
		class2.shouldFailWithTooManyResultsException();
		class2.shouldSelectAllAuthorsAsMap();
		class2.shouldSelectCountOfPosts();
		class2.shouldEnsureThatBothEarlyAndLateResolutionOfNesteDiscriminatorsResolesToUseNestedResultSetHandler();
		class2.shouldSelectOneAuthor();
		class2.shouldSelectOneAuthorAsList();
		class2.shouldSelectOneImmutableAuthor();
		class2.shouldSelectOneAuthorWithInlineParams();
		class2.shouldInsertAuthor();
		class2.shouldUpdateAuthorImplicitRollback();
		class2.shouldUpdateAuthorCommit();
		class2.shouldUpdateAuthorIfNecessary();
		class2.shouldDeleteAuthor();
		class2.shouldSelectBlogWithPostsAndAuthorUsingSubSelects();
		class2.shouldSelectBlogWithPostsAndAuthorUsingSubSelectsLazily();
		class2.shouldSelectBlogWithPostsAndAuthorUsingJoin();
		class2.shouldSelectNestedBlogWithPostsAndAuthorUsingJoin();
		class2.shouldThrowExceptionIfMappedStatementDoesNotExist();
		class2.shouldThrowExceptionIfTryingToAddStatementWithSameNameInXml();
		class2.shouldThrowExceptionIfTryingToAddStatementWithSameNameInAnnotation();
		class2.shouldCacheAllAuthors();
		class2.shouldNotCacheAllAuthors();
		class2.shouldSelectAuthorsUsingMapperClass();
		class2.shouldExecuteSelectOneAuthorUsingMapperClass();
		class2.shouldExecuteSelectOneAuthorUsingMapperClassThatReturnsALinedHashMap();
		class2.shouldExecuteSelectAllAuthorsUsingMapperClassThatReturnsSet();
		class2.shouldExecuteSelectAllAuthorsUsingMapperClassThatReturnsVector();
		class2.shouldExecuteSelectAllAuthorsUsingMapperClassThatReturnsLinkedList();
		class2.shouldExecuteSelectAllAuthorsUsingMapperClassThatReturnsAnArray();
		class2.shouldExecuteSelectOneAuthorUsingMapperClassWithResultHandler();
		class2.shouldFailExecutingAnAnnotatedMapperClassWithResultHandler();
		class2.shouldSelectAuthorsUsingMapperClassWithResultHandler();
		class2.shouldFailSelectOneAuthorUsingMapperClassWithTwoResultHandlers();
		class2.shouldFailSelectOneAuthorUsingMapperClassWithTwoRowBounds();
		class2.shouldInsertAuthorUsingMapperClass();
		class2.shouldDeleteAuthorUsingMapperClass();
		class2.shouldUpdateAuthorUsingMapperClass();
		class2.shouldSelectAllPostsUsingMapperClass();
		class2.shouldLimitResultsUsingMapperClass();
		class2.shouldHandleZeroParameters();
		class2.shouldStopResultHandler();
		class2.shouldOffsetAndLimitResultsUsingMapperClass();
		class2.shouldFindPostsAllPostsWithDynamicSql();
		class2.shouldFindPostByIDWithDynamicSql();
		class2.shouldFindPostsInSetOfIDsWithDynamicSql();
		class2.shouldFindPostsWithBlogIdUsingDynamicSql();
		class2.shouldFindPostsWithAuthorIdUsingDynamicSql();
		class2.shouldFindPostsWithAuthorAndBlogIdUsingDynamicSql();
		class2.shouldFindPostsInList();
		class2.shouldFindOddPostsInList();
		class2.shouldSelectOddPostsInKeysList();
		org.apache.ibatis.session.SqlSessionManagerTest class3 = new org.apache.ibatis.session.SqlSessionManagerTest();
		try {
			class3.setup();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		class3.shouldThrowExceptionIfMappedStatementDoesNotExistAndSqlSessionIsOpen();
		class3.shouldCommitInsertedAuthor();
		class3.shouldRollbackInsertedAuthor();
		class3.shouldImplicitlyRollbackInsertedAuthor();
		try {
			class3.shouldFindAllPostLites();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		try {
			class3.shouldFindAllMutablePostLites();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
	}
}