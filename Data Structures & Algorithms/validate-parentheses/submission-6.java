class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character,Character> characters = new HashMap<>();
        characters.put(')', '(');
        characters.put('}', '{');
        characters.put(']', '[');

        char[] chars = s.toCharArray();
        for(int i = 0; i < chars.length ; i++){
            if(characters.containsValue(chars[i])){
                stack.push(chars[i]);
            }else if(characters.containsKey(chars[i])){
                if (stack.isEmpty() || stack.pop() != characters.get(chars[i])) {
                    return false;
                }
            }
        }    

        return stack.size() == 0;    
    }
}
