public class SmallestIdxDigitSumE2Idx{

       public static int smallestIndex(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            int sum = 0;

            while (x > 0) {
                sum += x % 10;
                x /= 10;
            }

            if (sum == i)
                return i;
        }

        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {1,10,11};
        System.out.println(smallestIndex(nums));


    }
}