class Factorial{
    public static void main(String[] a){
        Fac rec;
        System.out.println(new Fac().ComputeFac(10));
        rec = new Fac();
        System.out.println(rec.ComputeFacField(5));
    }
}

class Fac {
    int result;
    
    public int ComputeFac(int num){
        int num_aux ;
        if (num < 1)
            num_aux = 1 ;
        else
            num_aux = num * (this.ComputeFac(num-1)) ;
        return num_aux ;
    }
    
    public int ComputeFacField(int num) {
        
        if (num < 0) {
            num = -1*num;
        } else {}
        
        // use field, to test, if recursion with side effects on fields works
        if (1 < num) {
            result = num*this.ComputeFacField(num-1);
        } else {
            result = 1;
        }
        return result;
    }
}