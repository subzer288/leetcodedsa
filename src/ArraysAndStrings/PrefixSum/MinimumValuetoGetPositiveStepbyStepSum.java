package ArraysAndStrings.PrefixSum;

public class MinimumValuetoGetPositiveStepbyStepSum {
    public static void main(String[] args){
        int[] nums = new int[]{-3,2,-3,4,2};
        int minVal = 0;
        int total = 0;


        for (int num : nums) {

            total += num;
            minVal = Math.min(minVal, total);
        }

        System.out.println(-minVal + 1);
    }
}
