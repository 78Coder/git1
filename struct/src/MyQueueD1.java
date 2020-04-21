public class MyQueueD1 {
    public static void main(String[] args) {
        MyQueue q = new MyQueue(10);
        for (int i = 0; i < 20; i++) {
            q.enQueue(i);
            System.out.println(q.deQueue());
        }
    }
}
