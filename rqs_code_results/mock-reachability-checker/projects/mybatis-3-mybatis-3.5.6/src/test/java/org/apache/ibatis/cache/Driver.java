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
package org.apache.ibatis.cache;

public class Driver {
	public void runall() {
		org.apache.ibatis.cache.LruCacheTest class1 = new org.apache.ibatis.cache.LruCacheTest();
		class1.shouldRemoveLeastRecentlyUsedItemInBeyondFiveEntries();
		class1.shouldRemoveItemOnDemand();
		class1.shouldFlushAllItemsOnDemand();
		org.apache.ibatis.cache.ScheduledCacheTest class2 = new org.apache.ibatis.cache.ScheduledCacheTest();
		try {
			class2.shouldDemonstrateHowAllObjectsAreFlushedAfterBasedOnTime();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		class2.shouldRemoveItemOnDemand();
		class2.shouldFlushAllItemsOnDemand();
		org.apache.ibatis.cache.WeakCacheTest class3 = new org.apache.ibatis.cache.WeakCacheTest();
		class3.shouldDemonstrateObjectsBeingCollectedAsNeeded();
		class3.shouldDemonstrateCopiesAreEqual();
		class3.shouldRemoveItemOnDemand();
		class3.shouldFlushAllItemsOnDemand();
		org.apache.ibatis.cache.BaseCacheTest class4 = new org.apache.ibatis.cache.BaseCacheTest();
		class4.shouldDemonstrateEqualsAndHashCodeForVariousCacheTypes();
		org.apache.ibatis.cache.FifoCacheTest class5 = new org.apache.ibatis.cache.FifoCacheTest();
		class5.shouldRemoveFirstItemInBeyondFiveEntries();
		class5.shouldRemoveItemOnDemand();
		class5.shouldFlushAllItemsOnDemand();
		org.apache.ibatis.cache.CacheKeyTest class6 = new org.apache.ibatis.cache.CacheKeyTest();
		class6.shouldTestCacheKeysEqual();
		try {
			class6.shouldTestCacheKeysNotEqualDueToDateDifference();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class6.shouldTestCacheKeysNotEqualDueToOrder();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		class6.shouldDemonstrateEmptyAndNullKeysAreEqual();
		class6.shouldTestCacheKeysWithBinaryArrays();
		class6.throwExceptionWhenTryingToUpdateNullCacheKey();
		class6.throwExceptionWhenTryingToUpdateAllNullCacheKey();
		try {
			class6.shouldDemonstrateClonedNullCacheKeysAreEqual();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		class6.serializationExceptionTest();
		try {
			class6.serializationTest();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		org.apache.ibatis.cache.SerializedCacheTest class7 = new org.apache.ibatis.cache.SerializedCacheTest();
		class7.shouldDemonstrateSerializedObjectAreEqual();
		class7.shouldDemonstrateNullsAreSerializable();
		class7.throwExceptionWhenTryingToCacheNonSerializableObject();
		org.apache.ibatis.cache.SuperCacheTest class8 = new org.apache.ibatis.cache.SuperCacheTest();
		class8.shouldDemonstrate5LevelSuperCacheHandlesLotsOfEntriesWithoutCrashing();
		org.apache.ibatis.cache.PerpetualCacheTest class9 = new org.apache.ibatis.cache.PerpetualCacheTest();
		class9.shouldDemonstrateHowAllObjectsAreKept();
		class9.shouldDemonstrateCopiesAreEqual();
		class9.shouldRemoveItemOnDemand();
		class9.shouldFlushAllItemsOnDemand();
		class9.shouldDemonstrateIdIsNull();
		org.apache.ibatis.cache.SoftCacheTest class10 = new org.apache.ibatis.cache.SoftCacheTest();
		class10.shouldDemonstrateObjectsBeingCollectedAsNeeded();
		class10.shouldDemonstrateCopiesAreEqual();
		class10.shouldRemoveItemOnDemand();
		class10.shouldFlushAllItemsOnDemand();
	}
}