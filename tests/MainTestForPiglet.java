class MainTestForPiglet{
    public static void main(String[] arg0){
    	int n;
    	int sum;
    	int b;
		boolean t;
		int[] a;
    	n=5;
    	sum=0;
		b = 0;
		t = true;
		a = new int[42];
		a[5+5] = 5 * 5;
		b = a[5+5];
    	while(0<n){
    		sum = sum +n;
    		n = n-1;
    	}
		if (t) {
			System.out.println(sum);
		} else {}
		if (!(sum < 0)) {
			System.out.println(sum);
		} else {}
		if (!(sum + 2 < 0 - 2)) {
			System.out.println(sum);
		} else {}
		System.out.println(sum + 0 - 1 * 2);
		System.out.println(0);
    }
}