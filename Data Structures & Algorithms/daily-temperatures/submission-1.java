class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int[] res = new int[len];
        Stack<Integer> stack = new Stack<>();
        int maxTemp = temperatures[len - 1];
        int maxIndex = len-1;
        res[len-1] = 0;
        for(int i = len - 2; i >= 0; i--) {
             if(temperatures[i] > maxTemp) {
                maxTemp = temperatures[i];
                maxIndex = i;
            }
            if(temperatures[i] < temperatures[i+1]) {
                res[i] = 1;
            } else {
                res[i] = maxIndex - i;
            }
           
            
            // System.out.println(stack.peek());
        }
        return res;
    }
}
