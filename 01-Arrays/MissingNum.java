public class MissingNum {

      public static int missingNumber(int[] nums) {
      int n = nums.length;
      int sum = 0;
      for (int i = 0; i< n; i++){
        sum = sum+nums[i];
      }
      int actual = n * (n+1)/2;
      int missing = actual - sum;
      
     return missing;
     }
    public static void main(String[] args) {
        int nums[] = {3,0,1};
        System.out.println(missingNumber(nums));
    }
    
}
