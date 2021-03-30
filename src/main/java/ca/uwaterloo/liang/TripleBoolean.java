package ca.uwaterloo.liang;

public class TripleBoolean {
    private boolean possibleMock;
    private boolean arrayMock;
    private boolean collectionMock;
    
    public TripleBoolean(boolean possibleMock) {
        this(possibleMock, false, false);
    }
    
    public TripleBoolean(boolean possibleMock, boolean arrayMock, boolean collectionMock) {
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
