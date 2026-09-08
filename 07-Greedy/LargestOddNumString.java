public class LargestOddNumString {
    

   
      public static String largestOddNumber(String num) {
        if((int)num.charAt(num.length()-1)%2==1) ;
        int i=num.length()-1;
        while(i>=0){
            int n=num.charAt(i);
            if(n%2==1) return num.substring(0,i+1);
            i--;
        }
        return "";
    }
    public static void main(String[] args) {
        String nums = "52";
        String result = largestOddNumber(nums);
        System.out.println(result);
    }
}
