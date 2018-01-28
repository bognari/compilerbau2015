class CallInCallTest {
    public static void main(String[] args) {
        Test t;
        t = new Test();
        System.out.println(t.foo(t.bar().getNum()));
    }
}

class Test {
    public Test bar() {
        System.out.println(1337);
        return this;
    }
    
    public int getNum() {
        return 42;
    }
    
    public int foo(int z) {
        System.out.println(z);
        return 4711;
    }
}
