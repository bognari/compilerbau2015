class MainTest{
    public static void main(String[] a){
        MathUtil u;
        BlubSub blu;
        u = new MathUtil();
         blu= new BlubSub();
         
      System.out.println(u.fac(4));
      System.out.println(blu.blub());
    }
}

class MathUtil {
    public int fac(int k) {
        int r; r = 1;
        while (0 < k) {
            r = r * k;
           k = k - 1;
        }
        return r;
    }
}

class BlubSub extends Blub {
    
    int subvar;
    
    // override blub
    public int blub() {
        return 0;
    }
    
    public int subblub() {
        basevar = basevar + subvar;
        return basevar;
    }
}

class Blub extends Base {
    
    public int blub(int anzahl){
        anzahl = anzahl -1;
        return anzahl+basevar;
    }
}

class Base {
    int basevar;
    
    public int justbase() {
        return -42;
    }
}
