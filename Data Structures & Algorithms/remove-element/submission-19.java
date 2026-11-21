class Solution {
    public int removeElement(int[] nums, int val) {
        // 3,2,2,3
        //3,
        int k = 0;
        int size = nums.length;
        
        for (int i =0; i<nums.length; i++){
                if(nums[i] != val){ 
                    nums[k] = nums[i];
                    k++;
                    

                }
        }
        
        
        return k;
    }
}