class MovingAverage {
    private int size;

    private Queue<Integer> avgArr;

    public MovingAverage(int size) {
        this.size = size;
        this.avgArr = new ArrayDeque<>(size);
    }
    
    public double next(int val) {
        int count = this.avgArr.size();
        int sum = 0;
        if(count < this.size) {
            this.avgArr.add(val);
            count++;
        }
        else if(count >= this.size) {
            this.avgArr.poll();
            this.avgArr.add(val);
        }
        for(int num : this.avgArr) {
            System.out.println(num);
            sum += num;
            System.out.println("sum" + sum);
        }
        return (double) sum/count;
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */
