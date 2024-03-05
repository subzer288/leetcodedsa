package Hashing.CheckingForExistence;
//Given an array nums containing n distinct numbers in the range [0, n],
//return the only number in the range that is missing from the array.
//
//Example 1:
//Input: nums = [3,0,1]
//Output: 2
//Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
//
//Example 2:
//Input: nums = [0,1]
//Output: 2
//Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
//
//Example 3:
//Input: nums = [9,6,4,2,3,5,7,0,1]
//Output: 8
//Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.

import java.util.HashSet;
import java.util.Set;

public class MissingNumber {
    public static void main(String[] args){
        int[] nums = new int[]{0,1,2,3,4,5,6,7,8,9};

        Set<Integer> numSet = new HashSet<Integer>();
        for (int num : nums) numSet.add(num);

        int expectedNumCount = nums.length + 1;
        for (int number = 0; number < expectedNumCount; number++) {
            if (!numSet.contains(number)) {
                System.out.println(number);
            }
        }
    }
}
