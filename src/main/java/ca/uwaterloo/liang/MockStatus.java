package ca.uwaterloo.liang;

public class MockStatus {
    // Determines if the object is a may Mock. The "may" here considers for if any possible branch path would return a mock.
    private boolean mayMock;
    
    // Determine if an array contains any "may" mock objects.
    private boolean arrayMock;
    
    // Determine if a collection contains any "may" mock objects.
    private boolean collectionMock;
    
    public MockStatus(boolean mayMock) {
        this(mayMock, false, false);
    }
    
    public MockStatus(boolean mayMock, boolean arrayMock, boolean collectionMock) {
        this.mayMock = mayMock;
        this.arrayMock = arrayMock;
        this.collectionMock = collectionMock;
    }

    public void setMayMock(boolean mayMock) {
        this.mayMock = mayMock;
    }
    
    public boolean getMayMock() {
        return mayMock;
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
