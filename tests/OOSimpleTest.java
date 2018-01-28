class OOSimpleTest{
    public static void main(String[] args) {
        int r;
        A a;
        A b;

        a = new A();
        r = a.init();
        r = a.print();
        r = a.setValue(44, 55, true);
        r = a.print();
        System.out.println(42);
        b = new A();
        r = b.init();
        r = b.print();
        r = b.setValue(99, 88, false);
        r = b.print();
        System.out.println(42);
        r = a.print();
    }
}


class A {

    int a;
    int b;
    boolean c;


    public int init() {
        a = 0;
        b = 0;
        c = false;
        return 0;
    }

    public int setValue(int a1, int b1, boolean c1) {
        a = a1;
        b = b1;
        c = c1;
        System.out.println(10101);
        return 0;
    }

    public int print() {
        System.out.println(a);
        System.out.println(b);
        if (c) {
            System.out.println(111111111);
        } else {
            System.out.println(100000000);
        }
        return 0;
    }
}
