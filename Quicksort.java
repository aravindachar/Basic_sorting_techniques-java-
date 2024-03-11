import java.util.Arrays;

public class Quicksort{
    public static void main(String[] args) {
        int[] arr = {4,7,2,3,1,5,6};
        sort(arr , 0 , arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }
    public static void sort(int[] nums , int low , int high){
        int s = low ;
        int e = nums.length -1 ;
        int m = s + (e-s)/2;
        int pivot = nums[m];
     if(low > high){
         return;

     }
     while(s<=e){
         while(nums[s]<=pivot){
             s++;
         }
         while(nums[e]>pivot){
             e--;
         }
         while(s<=e){
             int temp = nums[s];
             nums[s] = nums[e];
             nums[e] = temp ;
             s++;
             e--;

         }
            // so my pivot is at the position so lets call recursion
     }
     sort(nums , low , e);
     sort(nums , s , high);
    }

}