class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> allAccolades = new HashMap<>();
        allAccolades.put(')','(');
        allAccolades.put('}','{');
        allAccolades.put(']','[');

        Deque<Character> stackedCharacters = new ArrayDeque<>();

        for(char c : s.toCharArray()){
            if(allAccolades.containsKey(c)){
                if(!stackedCharacters.isEmpty() && stackedCharacters.peek() == allAccolades.get(c)){
                    stackedCharacters.pop();
                }else{
                    return false;
                }
            }else{
                stackedCharacters.push(c);
            }
        }

        if(!stackedCharacters.isEmpty()) return false;

        return true;
    }
}
