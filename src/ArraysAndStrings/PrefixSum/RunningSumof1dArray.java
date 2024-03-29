package ArraysAndStrings.PrefixSum;
import java.util.Arrays;
//Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
//
//Return the running sum of nums.
//
//Example 1:
//Input: nums = [1,2,3,4]
//Output: [1,3,6,10]
//Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

public class RunningSumof1dArray {
    public static void main(String[] args){
        int[] nums = new int[]{1,2,3,4};
        for(int i=1; i<nums.length; i++){
            nums[i] = nums[i] + nums[i-1];
        }
        System.out.println(Arrays.toString(nums));
    }
}
