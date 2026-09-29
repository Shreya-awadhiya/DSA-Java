 import java.util.*;

public class ContainsDupli {
    

        public static boolean containsNearbyDuplicate(int[] nums, int k) {
        if (k == 0) return false;

        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int integer = nums[i];
            if (hashMap.containsKey(integer) && i - hashMap.get(integer) <= k)
                return true;
            hashMap.put(integer, i);
        }
        return false;
    }
    public static void main(String[] args) {
       int nums[] = {1,2,3,1,2,3};
       int k = 2;

       System.out.println(containsNearbyDuplicate(nums, k));
    }
}
