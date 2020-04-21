public class MyLinkedListD1 {
    public static void main(String[] args) {
        MyLinkedList l1 = new MyLinkedList();
        for (int i = 5; i > 0; i--) {
            l1.headInsert(i);
        }
        System.out.println(l1.get(1));
        l1.printl();

    }
}
