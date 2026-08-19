class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        s = s.toLowerCase();
        char[] stringInCharArray = s.toCharArray();

        while(right > left){
            while(right > left && !alphaNum(stringInCharArray[left])){
                left++;
            }

            while(right > left && !alphaNum(stringInCharArray[right])){
                right--;
            }

            if(stringInCharArray[left] != stringInCharArray[right]){
                return false;
            }
            right--;
            left++;
        }      

        return true;  
    }

    public boolean alphaNum(char c) {
        return (c >= 'A' && c <= 'Z' ||
                c >= 'a' && c <= 'z' ||
                c >= '0' && c <= '9');
    }
}
