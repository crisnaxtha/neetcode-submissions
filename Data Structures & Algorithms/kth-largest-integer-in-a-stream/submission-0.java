class KthLargest {

    private PriorityQueue<Integer> minHeap;
    private int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.minHeap = new PriorityQueue<>();
        this.minHeap.add(0);
        for(int n : nums) {
            this.minHeap.offer(n);
            if(minHeap.size() > k) {
                minHeap.poll();
            }
        }
    }
    
    public int add(int val) {
        minHeap.offer(val);
        if(minHeap.size() > k) {
            minHeap.poll();
        }
        return minHeap.peek();
    }
}
