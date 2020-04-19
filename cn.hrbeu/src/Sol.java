import javax.swing.tree.TreeNode;
import java.util.*;

public class Sol {
    public static void main(String[] args) {
        int[] t = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(t));
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        System.out.println(s.pop());



    }
    public static int maxArea(int[] height){
        int low = 0;
        int high = height.length - 1;
        int max = 0;
        int t;
        while (low < high){
            t = (high - low) * ((height[low] > height[high])?height[high]:height[low]);
            if(max < t){
                max = t;
            }
            if (height[low] <= height[high]){
                low++;
            }else {
                high--;
            }

        }
        return max;
    }




}
