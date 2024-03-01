package ArraysAndStrings.TwoPointers;
import java.util.Arrays;
// Given an integer array nums sorted in non-decreasing order,
// return an array of the squares of each number sorted in non-decreasing order.
//Example 1:
//Input: nums = [-4,-1,0,3,10]
//Output: [0,1,9,16,100]
//Explanation: After squaring, the array becomes [16,1,0,9,100].
//        After sorting, it becomes [0,1,9,16,100].

//Example 2:
//Input: nums = [-7,-3,2,3,11]
//Output: [4,9,9,49,121]



public class SquaresofaSortedArray {
    public static void main (String arg[]){
        int[] nums = new int[]{-4,-1,0,3,10};
        int[] ans = new int[nums.length];
        int left = 0;
        int right = nums.length-1;

        for(int i = right; i >=0 ; i--){
            int square;
            if(Math.abs(nums[left]) < Math.abs(nums[right])){
                square = nums[right];
                right--;
            }else{
                square = nums[left];
                left++;
            }
            ans[i] = square * square;
        }
        System.out.println(Arrays.toString(ans));

    }
}
