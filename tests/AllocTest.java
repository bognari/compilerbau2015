class AllocTest{
    public static void main(String[] a){
		System.out.println(new Test().i());
		System.out.println(new Test2().i());
		System.out.println(new Test().j());
		System.out.println(new Test2().j());
    }
}

class Test {
	public int i(){
		return 2;
	}
	public int j(){
		return 88;
	}
}

class Test2 {
	public int i(){
		return 42;
	}
	public int j(){
		return 99;
	}
}