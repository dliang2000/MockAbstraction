package ca.uwaterloo.liang;

public enum MockLibrary {
    EASYMOCK ("org.easymock.EasyMock", "createMock", "java.lang.Object createMock(java.lang.Class)"),
    MOCKITO ("org.mockito.Mockito", "mock", "java.lang.Object mock(java.lang.Class)"),
    POWERMOCK ("org.powermock.api.mockito.PowerMockito", "mock", "java.lang.Object mock(java.lang.Class)");
    
    private final String library;
    private final String method;
    private final String subSignature;
    
    MockLibrary(String library, String method, String subSignature) {
        this.library = library;
        this.method = method;
        this.subSignature = subSignature;
    }
    
    public String library() {
        return library;
    }
    public String method() {
        return method;
    }
    public String subSignature() {
        return subSignature;
    }
    
}
