class Solution {
    public int evalRPN(String[] tokens) {
        Integer rpn = 0;
        Stack<Integer> toCompute = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+")) {
                if (toCompute.size() >= 2) {
                    Integer subTot = 0;
                    subTot = toCompute.pop() + toCompute.pop();
                    toCompute.add(subTot);
                }
            } else if (tokens[i].equals("*")) {
                if (toCompute.size() >= 2) {
                    Integer subTot = 0;
                    subTot = toCompute.pop() * toCompute.pop();
                    toCompute.add(subTot);
                }
            } else if (tokens[i].equals("-")) {
                if (toCompute.size() >= 2) {
                    Integer subTot = 0;
                    Integer second = toCompute.pop();
                    Integer first =  toCompute.pop();
                    subTot = first - second;
                    toCompute.add(subTot);
                }
            } else if (tokens[i].equals("/")) {
                if (toCompute.size() >= 2) {
                    Integer subTot = 0;
                    Integer second = toCompute.pop();
                    Integer first =  toCompute.pop();
                    subTot = first / second;
                    toCompute.add(subTot);
                }
            } else {
                toCompute.add(Integer.parseInt(tokens[i]));
            }
        }
        return toCompute.pop();
    }
}