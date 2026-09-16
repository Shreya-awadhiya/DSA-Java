import java.util.*;


public class CheckDivBySumProd{

      public static boolean checkDivisibility(int n) {
        int original = n;
        int digitSum = 0;
        int digitProduct = 1;

        while (n > 0) {
            int digit = n % 10;
            digitSum += digit;
            digitProduct *= digit;
            n /= 10;
        }

        int divisor = digitSum + digitProduct;
        return original % divisor == 0;
    }

    
    public static void main(String[] args) {
        int n = 99;
        boolean s = checkDivisibility(n);
        System.out.println(s);

    }
}