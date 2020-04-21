public class MyStack {
    private int[] arr;
    private int top = -1;

    public MyStack(int size) {
        this.arr = new int[size];
    }

    public boolean push(int num){
        if (top == arr.length - 1){
            return false;
        }else{
            top++;
            arr[top] = num;
            return true;
        }
    }

    public Integer pop(){
        if (top != -1){
            int t = arr[top];
            top--;
            return t;
        }else {
            return null;
        }
    }

    public Integer getTop(){
        if (top != -1){
            return arr[top];
        }else {
            return null;
        }
    }


}
