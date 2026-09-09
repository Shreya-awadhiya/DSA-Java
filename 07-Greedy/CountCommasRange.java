public class CountCommasRange {
    
       public static int countCommas(int n) {
        long answer = 0;
        long threshold = 1000;

        while (threshold <= n) {
            answer += n - threshold + 1;

            threshold *= 1000;
        }

        return (int) answer;
    }
    
    public static void main(String[] args) {
        int  n = 1002;
        int s = countCommas(n);
        System.out.println(s);
    }
}
