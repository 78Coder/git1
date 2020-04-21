public class MyListd1 {
    public static void main(String[] args) {
        MyList l1 = new MyList(10);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(6);
        l1.add(0,1);
        System.out.println(l1.getIndex(6));
        l1.print();

    }
}
