package ca.uwaterloo.liang;

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
