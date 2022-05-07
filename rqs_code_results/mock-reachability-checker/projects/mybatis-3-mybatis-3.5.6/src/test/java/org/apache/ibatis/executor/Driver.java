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
package org.apache.ibatis.executor;

public class Driver {
	public void runall() {
		org.apache.ibatis.executor.CachingBatchExecutorTest class1 = new org.apache.ibatis.executor.CachingBatchExecutorTest();
		class1.dummy();
		org.apache.ibatis.executor.BatchExecutorTest class2 = new org.apache.ibatis.executor.BatchExecutorTest();
		class2.dummy();
		org.apache.ibatis.executor.BaseExecutorTest class3 = new org.apache.ibatis.executor.BaseExecutorTest();
		try {
			class3.setup();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class3.shouldInsertNewAuthorWithBeforeAutoKey();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class3.shouldInsertNewAuthor();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		try {
			class3.shouldSelectAllAuthorsAutoMapped();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		try {
			class3.shouldInsertNewAuthorWithAutoKey();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class3.shouldInsertNewAuthorByProc();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		try {
			class3.shouldInsertNewAuthorUsingSimpleNonPreparedStatements();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		try {
			class3.shouldUpdateAuthor();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		try {
			class3.shouldDeleteAuthor();
		}
		catch (java.lang.Exception err9) {
			err9.printStackTrace();
		}
		try {
			class3.shouldSelectDiscriminatedPost();
		}
		catch (java.lang.Exception err10) {
			err10.printStackTrace();
		}
		try {
			class3.shouldSelect2DiscriminatedPosts();
		}
		catch (java.lang.Exception err11) {
			err11.printStackTrace();
		}
		try {
			class3.shouldSelectTwoSetsOfAuthorsViaProc();
		}
		catch (java.lang.Exception err12) {
			err12.printStackTrace();
		}
		try {
			class3.shouldSelectAuthorViaOutParams();
		}
		catch (java.lang.Exception err13) {
			err13.printStackTrace();
		}
		try {
			class3.shouldFetchPostsForBlog();
		}
		catch (java.lang.Exception err14) {
			err14.printStackTrace();
		}
		try {
			class3.shouldFetchOneOrphanedPostWithNoBlog();
		}
		catch (java.lang.Exception err15) {
			err15.printStackTrace();
		}
		try {
			class3.shouldFetchPostWithBlogWithCompositeKey();
		}
		catch (java.lang.Exception err16) {
			err16.printStackTrace();
		}
		try {
			class3.shouldFetchComplexBlogs();
		}
		catch (java.lang.Exception err17) {
			err17.printStackTrace();
		}
		try {
			class3.shouldMapConstructorResults();
		}
		catch (java.lang.Exception err18) {
			err18.printStackTrace();
		}
		try {
			class3.shouldClearDeferredLoads();
		}
		catch (java.lang.Exception err19) {
			err19.printStackTrace();
		}
		org.apache.ibatis.executor.CachingSimpleExecutorTest class4 = new org.apache.ibatis.executor.CachingSimpleExecutorTest();
		class4.dummy();
		org.apache.ibatis.executor.ResultExtractorTest class5 = new org.apache.ibatis.executor.ResultExtractorTest();
		class5.setUp();
		class5.shouldExtractNullForNullTargetType();
		class5.shouldExtractList();
		class5.shouldExtractArray();
		class5.shouldExtractSet();
		class5.shouldExtractSingleObject();
		class5.shouldFailWhenMutipleItemsInList();
		org.apache.ibatis.executor.CachingReuseExecutorTest class6 = new org.apache.ibatis.executor.CachingReuseExecutorTest();
		class6.dummy();
		org.apache.ibatis.executor.ReuseExecutorTest class7 = new org.apache.ibatis.executor.ReuseExecutorTest();
		class7.dummy();
		try {
			class7.shouldFetchPostWithBlogWithCompositeKey();
		}
		catch (java.lang.Exception err20) {
			err20.printStackTrace();
		}
		org.apache.ibatis.executor.ErrorContextTest class8 = new org.apache.ibatis.executor.ErrorContextTest();
		class8.shouldShowProgressiveErrorContextBuilding();
		try {
			class8.verifyStoreRecall();
		}
		catch (java.lang.Exception err21) {
			err21.printStackTrace();
		}
	}
}