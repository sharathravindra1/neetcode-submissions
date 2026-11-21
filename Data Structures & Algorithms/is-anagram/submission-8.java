class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> count1 = new HashMap<>();
        Map<Character, Integer> count2 = new HashMap<>();

        for(int i = 0; i< s.length(); i ++){
            char c1 = s.charAt(i);
            char c2 = t.charAt (i);
            count1.put(c1, count1.getOrDefault(c1,0)+1);
            count2.put(c2, count2.getOrDefault(c2,0)+1);
        }
       
        return count1.equals(count2);

    }
}
