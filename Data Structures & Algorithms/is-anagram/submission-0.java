class Solution {
    public boolean isAnagram(String s, String t) {
         if (s.length() != t.length()) {
            return false;
         }

         Map<Character, Integer> countS = new HashMap<>();
        Map<Character, Integer> countT = new HashMap<>();

        for(char c : s.toCharArray()){
            countS.merge(c, 1, Integer::sum);
        }

        
        for(char c : t.toCharArray()){
            countT.merge(c, 1, Integer::sum);
        }

        return countS.equals(countT);
    }
}
