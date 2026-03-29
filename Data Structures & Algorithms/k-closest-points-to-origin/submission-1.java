class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> minHeap = 
        new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        for(int[] point: points) {
            int dist = point[0] * point[0] + point[1] * point[1];
            minHeap.offer(new int[]{dist, point[0], point[1]});
        }
        int[][] res = new int[k][2];
        while(k > 0){
            int[] point = minHeap.poll();
            res[k-1][0] = point[1];
            res[k-1][1] = point[2];
            k--;
        }
        return res;
    }
}
