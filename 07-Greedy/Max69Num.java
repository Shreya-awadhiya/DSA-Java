// import java.util.*;


public class Max69Num {


    public static int maximum69Number (int num) {
       char[] arr = String.valueOf(num).toCharArray();
       
       for(int i =0;i<arr.length;i++){
        if(arr[i] == '6'){
            arr[i] = '9';
            break;
        }
       }
       int nums = Integer.parseInt(new String(arr));
       return nums;
    }

    public static void main(String[] args) {
    int nums = 9669;
    int result = maximum69Number(nums);
    System.out.println(result);

    
    }
}