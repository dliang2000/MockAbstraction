package ca.uwaterloo.liang;

public class MockStatus {
    // Determines if the object is a possible Mock. The "possible" here considers for the branch condition.
    private boolean possiblyMock;
    
    // Determine if an array contains any "possible" mock objects.
    private boolean arrayMock;
    
    // Determine if a collection contains any "possible" mock objects.
    private boolean collectionMock;
    
    public MockStatus(boolean possibleMock) {
        this(possibleMock, false, false);
    }
    
    public MockStatus(boolean possiblyMock, boolean arrayMock, boolean collectionMock) {
        this.possiblyMock = possiblyMock;
        this.arrayMock = arrayMock;
        this.collectionMock = collectionMock;
    }

    public void setPossiblyMock(boolean possiblyMock) {
        this.possiblyMock = possiblyMock;
    }
    
    public boolean getPossiblyMock() {
        return possiblyMock;
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
