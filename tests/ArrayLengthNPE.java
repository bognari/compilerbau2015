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
        i = arr.length; // expected NPE
        return i;
    }
}
