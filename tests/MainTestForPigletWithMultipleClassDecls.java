class MainTest{
    public static void main(String[] arg0){
    	A a;
    	A2 a2;
    	A wirklichA2;
    	
    	a = new A();
    	a2 = new A2();
    	wirklichA2 = new A2();

    	System.out.println(a.getZahl());                    // 1
    	System.out.println(a.getNochNeZahl());              // 3
    	System.out.println(a2.getZahl());                   // 2
    	System.out.println(a2.getNochNeZahl());             // 3
    	System.out.println(wirklichA2.getZahl());           // 2
    	System.out.println(wirklichA2.getNochNeZahl());     // 3
    }
}

class A{
	public int getZahl(){
		return 1;
	}
	
	public int getNochNeZahl(){
		return 3;
	}
}
class A2 extends A{
	public int getZahl(){
		return 2;
	}
}