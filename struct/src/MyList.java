import java.util.Arrays;
import java.util.List;

public class MyList {
    private int[] arr;
    private int length;

    public MyList(int initlength) {
        if (initlength >= 0) {
            this.arr = new int[initlength];
            length = 0;
        }else{
            System.out.println("初始值不能小于0");
        }
    }

    public int length(){
        return this.length;
    }

    public boolean add(int index,int num){
        if (this.length < arr.length && index >= 0 && index <= this.length){
            for (int i = this.length; i >= index; i--) {
                arr[i+1] = arr[i];
            }
            arr[index] = num;
            this.length++;
            return true;
        }else {
            return false;
        }
    }

    public boolean add(int num){
        if (this.length < arr.length){
            arr[this.length++] = num;
            return true;
        }else {
            return false;
        }
    }

    public Integer del(int index){
        if (index < this.length && index >= 0) {
            int t =arr[index];
            for (int i = index; i < this.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            this.length--;
            return t;
        }
        return null;
    }
    public boolean set(int index,int a){
        if (index < this.length && index >= 0){
            arr[index] = a;
            return true;
        }else {
            return false;
        }
    }

    public Integer getNum(int index){
        if (index < this.length && index >= 0){
            return arr[index];
        }else {
            return null;
        }
    }

    public void print (){
        for (int i = 0; i < this.length; i++) {
            System.out.print(arr[i]+",");

        }
    }


    public Integer getIndex(int num){
        for (int i = 0; i < this.length; i++) {
            if (arr[i] == num){
                return i;
            }
        }
        return null;
    }





}
