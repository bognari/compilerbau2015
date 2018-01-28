class Sum {
    public static void main(String[] args) {
        int[] a;
        int[] b;
    	int i;
        int s;
        s = 0;
        a = new int[2 * 10];
        i = 0;
        while (i < a.length) {
            a[i] = i * 2;
            i = i + 1;
        }
        b = a;
        i = 0;
        while (i < a.length) {
            System.out.println(b[i]);
            s = s + b[i];
            i = i + 1;
        }
        System.out.println(s);
    }
}
