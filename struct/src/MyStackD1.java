public class MyStackD1 {
    public static void main(String[] args) {
        MyStack s = new MyStack(10);
        s.push(1);
        s.push(2);
        s.push(2);
        s.push(2);
        s.push(2);
        s.push(2);
        s.push(2);
        s.push(2);
        s.push(2);
        System.out.println(s.push(3));
        System.out.println(s.push(3));
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
