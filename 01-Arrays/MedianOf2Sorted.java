import java.util.*;

public class MedianOf2Sorted{

       public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int newSize = m+n;
        int F[] = new int[newSize];

        System.arraycopy(nums1,0,F,0,m);
          System.arraycopy(nums2,0,F,m,n);
         System.out.println( "" + Arrays.toString(F));
         Arrays.sort(F);

          int mid = F.length/2;

          if(F.length%2 != 0){   //odd
          return F[mid];
          }
          else{   //even
          double s = (F[mid]+F[mid-1])/2.0;
          return s;
          }

    }
    public static void main(String[] args) {
        int nums1[] = {1,2};
         int nums2[] = {3,4};
        
         System.out.println(findMedianSortedArrays(nums1, nums2));

    }
}