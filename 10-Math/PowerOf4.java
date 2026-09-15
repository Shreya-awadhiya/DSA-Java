import java.util.*;

public class PowerOf4 {
       public static boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }
        return Math.log(n) / Math.log(4) % 1 == 0;        
    }

    public static void main(String[] args) {
        int n = 5;
        boolean s = isPowerOfFour(n);
        System.out.println(s);
    }
}
