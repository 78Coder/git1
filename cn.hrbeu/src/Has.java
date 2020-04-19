import java.util.HashSet;

public class Has {
    public static void main(String[] args) {
        int[] nums = new int[10];
        HashSet hs = new HashSet();
        for (int num : nums) {
            if(!hs.add(num)){
                System.out.println(num);
            }
        }
    }
}
