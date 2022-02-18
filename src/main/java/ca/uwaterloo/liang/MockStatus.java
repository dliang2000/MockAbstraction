package ca.uwaterloo.liang;
/* MockAnalysis
 * Copyright (C) 2021 Qian Liang <q8liang@uwaterloo.ca>
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the
 * Free Software Foundation, Inc., 59 Temple Place - Suite 330,
 * Boston, MA 02111-1307, USA.
 */

public class MockStatus {
    // Determines if the object is a may Mock. The "may" here considers for if any possible branch path would return a mock.
    private boolean mock;
    
    // Determine if an array contains any "may" mock objects.
    private boolean arrayMock;
    
    // Determine if a collection contains any "may" mock objects.
    private boolean collectionMock;
    
    public MockStatus(boolean mock) {
        this(mock, false, false);
    }
    
    public MockStatus(boolean mock, boolean arrayMock, boolean collectionMock) {
        this.mock = mock;
        this.arrayMock = arrayMock;
        this.collectionMock = collectionMock;
    }

    public void setMock(boolean mock) {
        this.mock = mock;
    }
    
    public boolean getMock() {
        return mock;
    }
    
    public void setArrayMock(boolean arrayMock) {
        this.arrayMock = arrayMock;
    }
    
    public boolean getArrayMock() {
        return arrayMock;
    }
    
    public void setCollectionMock(boolean collectionMock) {
        this.collectionMock = collectionMock;
    }
    
    public boolean getCollectionMock() {
        return collectionMock;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        
        if (! (o instanceof MockStatus) )
            return false;
        
        MockStatus other = (MockStatus) o;
        
        return this.mock == other.mock 
                && this.arrayMock == other.arrayMock 
                && this.collectionMock == other.collectionMock; 
    }
    
    @Override
    public int hashCode() {
        Boolean mock_prim = new Boolean(mock);
        Boolean arrayMock_prim = new Boolean(arrayMock);
        Boolean collectionMock_prim = new Boolean(collectionMock);
        
        return mock_prim.hashCode() * 139 + arrayMock_prim.hashCode() * 383 + collectionMock_prim.hashCode() * 97;
    }
}
