class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> charactersSubstring = new HashSet<>();
        int left = 0;
        int longest = 0;
        
        for(int right = 0 ; right < s.length() ; right ++){
            while(!charactersSubstring.add(s.charAt(right))){
                charactersSubstring.remove(s.charAt(left));
                left++;
            }
            longest = Math.max(longest, charactersSubstring.size());
        }

        return longest;
    }
}
