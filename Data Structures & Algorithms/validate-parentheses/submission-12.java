class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> allAccolades = new HashMap<>();
        allAccolades.put('(',')');
        allAccolades.put('{','}');
        allAccolades.put('[',']');

        Deque<Character> pile = new ArrayDeque<>();

        for(char c : s.toCharArray()){
            for(Map.Entry<Character, Character> entryAccolade : allAccolades.entrySet()){
                if(entryAccolade.getKey() == c){
                    pile.push(c);                    
                }else if(entryAccolade.getValue() == c){
                    if(pile.isEmpty()){
                     return false;
                    }
                    if(!pile.isEmpty() && allAccolades.get(pile.pop()) != c){
                        return false;
                    };
                }
            }
        }
        
        return (pile.isEmpty()) ?   true :  false;
    }
}
