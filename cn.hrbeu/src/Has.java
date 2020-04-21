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
        boolean flag = true;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                for (int j = i; j < nums.length; j++) {
                    if (nums[j] != 0){
                        int t = 0;
                        t = nums[j];
                        nums[j] = nums[i];
                        nums[i] = t;
                    }
                    if (j == nums.length-1 && nums[j] ==0){
                        flag = false;
                        break;

                    }
                }
                if(flag == false){
                    break;
                }
            }
        }
    }
}
