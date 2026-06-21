class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Double> stack = new Stack<>();
        int[][] cars = new int[position.length][2];
        
        for (int i = 0; i < position.length; i++) {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }

         Arrays.sort(cars, (a, b) -> Integer.compare(b[0], a[0]));

        for(int[] c : cars){
            double timeBeforeTarget = (double) (target-c[0]) / c[1];
            if(stack.size() > 0 ){
                if(timeBeforeTarget <= stack.peek()){
                    
                }else{
                   stack.add(timeBeforeTarget); 
                }
            }else{
                stack.add(timeBeforeTarget);
            }
            
        }

        return stack.size();
        
    }
}
