
class ManyVars{
    public static void main(String[] args) {
              //       temp 0 is classloader
        int a;//s0          1
        int b;//s1          2
        int c;//s2          3
        int d;//s3          4
        int e;//s4          5
        int f;//s5          6
        int g;//s6          7
        int h;//s7          8
        int i;//st0 + 8     9
        int j;//st1 + 8     10
        int k;//st2 + 8     11
        int l;//st3 + 8     12
        int m;//st4 + 8     13
        int n;//st5 + 8     14
        int o;//st6 + 8     15
        int p;//st7 + 8     16
        m = 42;
        l = 84;
        o = m;
        p = l;
        n = o + p + l;

        System.out.println(n);
        if (n + 10 < 100 * 2) {
            System.out.println(o);
        } else {
            System.out.println(p);
        }
    }
}