class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> tempsToHandle = new Stack<>();
        int[] dailyTemperatures = new int[temperatures.length];

        tempsToHandle.push(0);
        
        for(int i = 1 ; i < temperatures.length ; i++){
            while (!tempsToHandle.isEmpty() && temperatures[i] > temperatures[tempsToHandle.peek()]){
                Integer tempInferior = tempsToHandle.pop();
                dailyTemperatures[tempInferior] = i - tempInferior;
            }

            tempsToHandle.push(i);
        }

        return dailyTemperatures;
    }
}
