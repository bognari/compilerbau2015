
class CallChainTest{
    public static void main(String[] args) {
        A z;
        A y;
        A x;
        int r;
        z = new A();
        y = new A();
        x = new A();
        r = z.setValue(42);
        r = y.setValue(4242);
        r = x.setValue(123456);
        z = z.a().d(y.c().b(), x.a().e(),y.c().b(), x.a().e(),y.c().b(), x.a().e(),y.c().b(), x.a().e(),y.c().b(), x.a().e(),y.c().b(), x.a().e(),y.c().b(), x.a().e(),y.c().b(), x.a().e(),y.c().b(), x.a().e());
    }
}

class A{
    int value;

    public A d(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j, int k, int l, int m, int n, int o, int p, int q, int r) {
        System.out.println(4);
        System.out.println(value);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);
        System.out.println(m);
        System.out.println(n);
        System.out.println(o);
        System.out.println(p);
        System.out.println(q);
        System.out.println(r);

        return this;
    }

    public int setValue(int v) {
        value = v;
        return 0;
    }

    public A a() {
        System.out.println(1);
        System.out.println(value);
        return this;
    }

    public int b() {
        System.out.println(2);
        System.out.println(value);
        return 128;
    }

    public int e() {
        System.out.println(5);
        System.out.println(value);
        return 555;
    }

    public A c() {
        A a;
        int r;
        System.out.println(3);
        a = new A();
        r = a.setValue(84);
        System.out.println(value);
        return a;
    }
}