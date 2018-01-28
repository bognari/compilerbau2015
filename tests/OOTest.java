class OOTest{
    public static void main(String[] args) {
        List list;
        int r;

        list = new List();
        r = list.init();
        System.out.println(42);
        r = list.print();
        System.out.println(43);
        r = list.insert(1);
        System.out.println(44);
        r = list.print();
        System.out.println(45);
        r = list.insert(2);
        System.out.println(46);
        r = list.print();
        System.out.println(47);
        r = list.insert(3);
        System.out.println(48);
        r = list.print();
        System.out.println(49);
        r = list.insert(4);
        System.out.println(50);
        r = list.print();
        System.out.println(51);
        r = list.insert(5);
        System.out.println(52);
        r = list.print();
    }
}


class List {

    int value;
    List next;
    boolean hasNext;


    public int init() {
        value = 0;
        hasNext = false;
        next = this;
        return value * 2 + 1;
    }

    public int setValue(int x) {
        value = x;
        return 0;
    }

    public int setNext(List l) {
        next = l;
        hasNext = true;
        return 0;
    }

    public boolean isEmpty() {
        return !hasNext;
    }

    public int insert(int x) {
        int r;
        List list;
        if (this.isEmpty()) {
            list = new List();
            r = list.init();
            r = list.setValue(x);
            r = this.setNext(list);
        } else {
            r = next.insert(x);
        }

        return 0;
    }

    public int print() {
        int r;
        if (this.isEmpty()) {

        } else {
            System.out.println(value);
            r = next.print();
        }
        return 0;
    }
}
