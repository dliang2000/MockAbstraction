package ca.uwaterloo.liang;

public class MockStatus {
    // Determines if the object is a must Mock. The "must" here considers for all possible branch paths.
    private boolean mustMock;
    
    // Determine if an array contains any "must" mock objects.
    private boolean arrayMock;
    
    // Determine if a collection contains any "must" mock objects.
    private boolean collectionMock;
    
    public MockStatus(boolean mustMock) {
        this(mustMock, false, false);
    }
    
    public MockStatus(boolean mustMock, boolean arrayMock, boolean collectionMock) {
        this.mustMock = mustMock;
        this.arrayMock = arrayMock;
        this.collectionMock = collectionMock;
    }

    public void setMustMock(boolean mustMock) {
        this.mustMock = mustMock;
    }
    
    public boolean getMustMock() {
        return mustMock;
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
