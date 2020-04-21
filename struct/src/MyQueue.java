import java.util.Objects;

public class MyQueue <T>{
    private T[] arr;
    private int front = 0;
    private int rear = 0;

    public MyQueue(int size) {
        arr =(T[]) new Objects[size];
    }

    public boolean enQueue(T num){
        if (((rear+1) % arr.length) == front){
            return false;
        }else{
            arr[rear] = num;
            rear = (rear+1) % arr.length;
            return true;
        }
    }
    public T deQueue(){
        if (front == rear){
            return null;
        }else{
            T t = arr[front];
            front = (front+1) % arr.length;
            return t;
        }
    }




}
