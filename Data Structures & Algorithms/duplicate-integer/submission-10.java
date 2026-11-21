class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i <nums.length; i++){
            Integer num = new Integer (nums[i]);
                if(map.containsKey(num)){
                    System.out.println("Found map containing" +num);
                    return true;
                }
                map.put(num,num );

        }
        return false;
    }
}