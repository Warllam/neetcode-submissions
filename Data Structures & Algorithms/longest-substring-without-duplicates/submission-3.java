class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> charactersWindow = new HashSet<>();
        int length = 0;
        int left = 0;
        
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            while(charactersWindow.contains(c)){
                charactersWindow.remove(s.charAt(left));
                left ++;
            }

            length = Math.max(length, right - left + 1);            
            charactersWindow.add(c);
        }

        return length;
    }
}
