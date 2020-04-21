public class MyLinkedList {
    private MyLinkedNode head;
    private int length = 0;

    public MyLinkedList() {
        this.head = new MyLinkedNode();
        length = 0;

    }
    public void headInsert(int num){
        MyLinkedNode hi = new MyLinkedNode(num);
        hi.next = head.next;
        head.next = hi;
        length++;
    }


    public MyLinkedNode get(int index){
        if (index <= length){
            MyLinkedNode t =head;
            for (int i = 0; i < index; i++) {
                t = t.next;
            }
            return t;
        }
        return null;
    }

    public void printl(){
        MyLinkedNode t = head.next;
        while (t != null){
            System.out.println(t.data + ",");
            t = t.next;
        }
    }

    public void add(int index, int num){
        if (index <= length + 1){
            MyLinkedNode n = new MyLinkedNode(num);
            MyLinkedNode t = get(index - 1);
            n.next = t.next;
            t.next = n;
            length++;
        }
    }

    public Integer del(int index){
        int t;
        if (index <= length){
            MyLinkedNode n = get(index - 1);
            t = n.next.data;
            n.next = n.next.next;
            length--;
            return t;
        }else {
            return null;
        }

    }


}
