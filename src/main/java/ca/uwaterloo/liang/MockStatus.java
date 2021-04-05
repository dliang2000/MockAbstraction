package ca.uwaterloo.liang;

public class MockStatus {
    // Determines if the object is a possible Mock. The "possible" here considers for the branch condition.
    private boolean possibleMock;
    
    // Determine if an array contains any "possible" mock objects.
    private boolean arrayMock;
    
    // Determine if a collection contains any "possible" mock objects.
    private boolean collectionMock;
    
    public MockStatus(boolean possibleMock) {
        this(possibleMock, false, false);
    }
    
    public MockStatus(boolean possibleMock, boolean arrayMock, boolean collectionMock) {
        this.possibleMock = possibleMock;
        this.arrayMock = arrayMock;
        this.collectionMock = collectionMock;
    }

    public void setPossibleMock(boolean possibleMock) {
        this.possibleMock = possibleMock;
    }
    
    public boolean getPossibleMock() {
        return possibleMock;
    }
}
