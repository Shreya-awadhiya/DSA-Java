public class CountCommasRangeII {
    
    public static long countCommas(long n) {
        if(n<1000) return 0;
        long num=0;
        if (n>=1000) {
            num=num+n-1000+1;
        }
        if(n>=1000000){
            num=num+n-1000000+1;
        }
        if(n>=1000000000L){
            num=num+n-1000000000L+1;
        }
        if(n>=1000000000000L){
            num=num+n-1000000000000L+1;
        }
        if(n>=1000000000000000L){
            num=num+n-1000000000000000L+1;
        }    
        return num;
    
}
    public static void main(String[] args) {
        int n = 1002;
        long s = countCommas(n);
        System.out.println(s);
    }
}
