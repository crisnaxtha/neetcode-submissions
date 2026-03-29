class KthLargest {

    private PriorityQueue<Integer> minHeap;
    private int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.minHeap = new PriorityQueue<>();
        for(int n : nums) {
            this.minHeap.offer(n);
            if(this.minHeap.size() > k) {
                this.minHeap.poll();
            }
        }
    }
    
    public int add(int val) {
        this.minHeap.offer(val);
        if(this.minHeap.size() > k) {
            this.minHeap.poll();
        }
        return this.minHeap.peek();
    }
}
