class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] output = new int[temperatures.length];
        Stack<Integer> temperaturesStack = new Stack<>();
        for (int i = 0; i < temperatures.length; i++) {
            if (temperaturesStack.size() > 0 && temperatures[i] > temperatures[temperaturesStack.peek()]) {
                while (temperaturesStack.size() > 0 && temperatures[i] > temperatures[temperaturesStack.peek()]) {
                    Integer positionInf = temperaturesStack.pop();
                    output[positionInf] = i - positionInf;
                }
            }
            temperaturesStack.add(i);
            
        }

        return output;
    }
}
