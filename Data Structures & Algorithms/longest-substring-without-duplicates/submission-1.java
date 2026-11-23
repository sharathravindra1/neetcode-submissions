class Solution {
     public int lengthOfLongestSubstring(String s){
        int best=0,l = 0;
        Map<Character, Integer> seen = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(seen.containsKey(c) && seen.get(c) >=l){
                l = seen.get(c)+1;//sliding window;
            }

            seen.put(c, i);

            best = Math.max(best, i-l+1);

        }

        return best;
    }
}
