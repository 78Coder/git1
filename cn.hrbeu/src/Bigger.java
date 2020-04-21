import java.util.Arrays;
import java.util.HashMap;

public class Bigger {
    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};

        HashMap<Integer,Integer> m = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            for (int j = i; j < nums2.length; j++) {
                if (nums2[j] > nums2[i]){
                    m.put(nums2[i],nums2[j]);
                    break;
                }
            }
        }

        int[] a = new int[nums1.length];
        for (int i = 0; i < a.length; i++) {
            if (m.containsKey(nums1[i])){
                a[i] = m.get(nums1[i]);
            }else {
                a[i] = -1;
            }

        }

        System.out.println(Arrays.toString(a));
    }
}
