class Solution {

    public String encode(List<String> strs) {
        String encodedStrs = "";
        for(String wordToEncode : strs){
            encodedStrs += wordToEncode.length() + "#" + wordToEncode;
            System.out.println( wordToEncode.length());
        }

        return encodedStrs;
    }

    public List<String> decode(String str) {
        List<String> decodedStrings = new ArrayList<>();
        int i = 0;
        while ( i < str.length()) {
            int posHash = str.indexOf('#', i);
            Integer lenghtWord = Integer.parseInt(str.substring(i,posHash));
            String word = str.substring(posHash+1,lenghtWord+posHash+1);
            decodedStrings.add(word);
            i = posHash+lenghtWord +1;
        }

        return decodedStrings;
    }
}
