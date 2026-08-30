public class ValidSqr {
    
      public static boolean isPerfectSquare(int num) {

        if (num == 1) {
            return true;
        }

        long left = 1;
        long right = num / 2;

        while (left <= right) {
            long mid = left + (right - left) / 2;

            if (mid * mid == num) {
                return true;
            } else if (mid * mid > num) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int nums = 14;
        boolean s = isPerfectSquare(nums);
        System.out.println(s);
    }
}
