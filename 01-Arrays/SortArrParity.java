public class SortArrParity {
       
    public static int[] sortArrayByParity(int[] nums) {
        int[] arr=new int[nums.length];
        int odd=nums.length-1;
        int even=0;
        for(int i=0;i<nums.length;i++){
            if((nums[i]&1)==0){
                arr[even]=nums[i];
                even++;
            }
            else{
                arr[odd]=nums[i];
                odd--;
            }
        }return arr;
    }

    public static void main(String[] args) {
        int nums[] = {3,1,2,4};
        int s[] = sortArrayByParity(nums);
        for (int i = 0; i<s.length;i++){
              System.out.print("["+s[i]+"]");
        }
    }
}
