class Main {
    public static void main(String[] args) {
        AOOB o;
        o = new AOOB();
        System.out.println(o.getInt());
    }
}

class AOOB {
    
    int[] arr;
    
    public int getInt() {
        arr = new int[5];
        return arr[10]; // expected ArrayIndexOutOfBounds
    }
}
