class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> allAccolades = new HashMap<>();
        allAccolades.put('(',')');
        allAccolades.put('{','}');
        allAccolades.put('[',']');

        ArrayList<Character> pile = new ArrayList<>();

        for(char c : s.toCharArray()){
            for(Map.Entry<Character, Character> entryAccolade : allAccolades.entrySet()){
                if(c == entryAccolade.getKey()){
                    pile.add(entryAccolade.getKey());
                } else if(c == entryAccolade.getValue()){
                    if(pile.size() <= 0){
                        return false;
                    } else if(pile.get(pile.size()-1) != entryAccolade.getKey()){
                        return false;
                    }else{
                        pile.remove(pile.size()-1);
                    }
                }
            }
        }

        if(pile.size() > 0) return false;

        return true;

    }
}
