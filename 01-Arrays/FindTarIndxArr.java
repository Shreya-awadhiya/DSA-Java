import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTarIndxArr{

      public static List<Integer> targetIndices(int[] nums, int target) {
    List<Integer> list = new ArrayList<>();
     Arrays.sort(nums);
     for(int  i = 0 ;i < nums.length ; i++){
        if(nums[i] == target) {
            list.add(i);
        }
     }
return list;
    }
  public static void main(String[] args) {
    
    int arr[] = {1,2,3,4,5,6,7,8};
    int target = 5;
    List<Integer> indices = targetIndices(arr, target);
    System.out.println("Indices of target " + target + " are: " + indices);
  }
}