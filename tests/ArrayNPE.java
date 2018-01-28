class Main {
    public static void main(String[] args) {
        ANPE o;
        o = new ANPE();
        System.out.println(o.getInt());
    }
}

class ANPE {
    
    int[] arr;
    
    public int getInt() {
        int i;
        i = arr[0]; // expected NPE
        return i;
    }
}
