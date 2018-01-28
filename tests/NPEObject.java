class Main {
    public static void main(String[] args) {
        NPEObject o;
        o = new NPEObject();
        System.out.println(o.getInt());
    }
}

class NPEObject {
    
    NPEObject o;
    
    public int getInt() {
        return o.getInt(); // expected NullPointerException
    }
}
