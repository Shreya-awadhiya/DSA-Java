import java.util.*;

public class firstmissingpos {
    
        public int firstMissingPositive(int[] nums) {
        int max = Integer.MIN_VALUE; //-1

        Arrays.sort(nums); // 0,1,3
        for(int i =0; i<nums.length ;i++){
            if(nums[i] < max){
                max = nums[i];
            }
        }
        return max + 1;
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, -1, 1};
        firstmissingpos solution = new firstmissingpos();
        System.out.println(solution.firstMissingPositive(nums)); // Output: 2
    }

}