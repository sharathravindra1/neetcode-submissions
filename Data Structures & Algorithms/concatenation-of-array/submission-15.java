class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*nums.length];
        
        int numsSize = nums.length;
        int ansPointer = numsSize;
        for (int i = 0; i<nums.length; i++){
                ans[i] = nums[i];
                ans[ansPointer]= nums[i];
                ansPointer++;
        }
        return ans;

    }
}