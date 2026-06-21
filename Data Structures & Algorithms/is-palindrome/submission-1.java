class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder word = new StringBuilder();

        for (char c : s.toCharArray()) {

            if (Character.isLetterOrDigit(c)) {
                word.append(Character.toLowerCase(c));
            }
        }

        return word.toString().equals(word.reverse().toString());
    }
}
