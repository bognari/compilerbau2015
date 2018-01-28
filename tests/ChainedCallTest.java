class ChainedCallTest {

    public static void main(String[] args) {
        TestClass t;
        t = new TestClass();
        t = t.print(5).and(7).and(14).delegating().print(42);
    }
    
}

class TestClass {
    public TestClass print(int z) {
        System.out.println(z);
        return this;
    }
    
    public TestClass and(int z) {
        return this.print(z);
    }
    
    public OtherClass delegating() {
        OtherClass o;
        o = new OtherClass();
        return o.byCaller(this);
    }
}

class OtherClass {
    TestClass caller;
    
    public OtherClass byCaller(TestClass tc) {
        caller = tc;
        return this;
    }
    
    public TestClass print(int z) {
        System.out.println(z);
        return caller;
    }
}
