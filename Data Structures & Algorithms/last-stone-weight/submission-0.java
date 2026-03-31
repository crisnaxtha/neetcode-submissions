class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = 
        new PriorityQueue<>(Collections.reverseOrder());
        for(int stone : stones) {
            maxHeap.offer(stone);
        }

        while(maxHeap.size() > 1) {
            Integer max1 = maxHeap.poll();
            Integer max2 = maxHeap.poll();

            if(max1 > max2) {
                maxHeap.offer(max1 - max2);
            }

        }

        return maxHeap.peek();
    }
}
