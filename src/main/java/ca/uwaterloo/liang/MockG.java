package ca.uwaterloo.liang;

public class MockG {
    
    private static MockG globalMockGetter = new MockG();
    
    /* A private Constructor prevents any other
     * class from instantiating.
     */
    private MockG() {}
    
    public static MockG v() {
        return globalMockGetter;
    }
    
    public final class Global {
        private Global() {}
    }

    protected Global g = new Global();
    
    private MockAnalyzer instance_MockAnalyzer;
    public MockAnalyzer instance_MockAnalyzer() {
        if (instance_MockAnalyzer == null) {
            synchronized (this) {
                if (instance_MockAnalyzer == null)
                    instance_MockAnalyzer = new MockAnalyzer(g);
            }
        }
        return instance_MockAnalyzer;
    }
}
