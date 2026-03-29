class Solution {
    public int leastInterval(char[] tasks, int n) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c : tasks) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            maxHeap.offer(entry.getValue());
        }

        Queue<int[]> q = new ArrayDeque<>();
        int time = 0;
        while(!maxHeap.isEmpty() || !q.isEmpty()) {
            time += 1;
            if(!maxHeap.isEmpty()) {
                int val = maxHeap.poll() - 1 ;
                if(val > 0) {
                    q.offer(new int[]{val, time + n});
                }
            }

            if(!q.isEmpty() && q.peek()[1] == time) {
                maxHeap.offer(q.poll()[0]);
            }
        }

        return time;
    }
}
