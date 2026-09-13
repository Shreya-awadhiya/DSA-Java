import java.util.*;

public class LengthOfLastWord {
    

        public static int lengthOfLastWord(String s) {
     int count = 0;

     for(int i=s.length()-1 ;i>=0;i--){
        if(s.charAt(i) == ' '){
            if(count > 0){
 return count;
            }
           
        }
        else{
            count++;
          
        }
     }     
     return count;
    }

    public static void main(String[] args) {
        String s = "Hello World";
        int a = lengthOfLastWord(s);
       System.out.println(a);

    }
}
