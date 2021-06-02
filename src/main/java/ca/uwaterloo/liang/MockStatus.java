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
}
