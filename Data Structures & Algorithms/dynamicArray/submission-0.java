class DynamicArray {
    int[] arr;
    int size;
    int capacity;

    public DynamicArray(int capacity) {
        this.arr = new int[capacity];
        this.size = 0;
        this.capacity = capacity;
    }

    public int get(int i) {
        return this.arr[i];
    }

    public void set(int i, int n) {
        this.arr[i] = n;
        this.size++;
    }

    public void pushback(int n) {
        if(this.size - 1 <= this.capacity) {
            this.arr[size - 1] = n;
            this.size++;
        } else {
            this.resize();
            this.arr[size - 1]= n;
            this.size++;
        }
        
    }

    public int popback() {
        int num =  this.arr[size - 1];
        this.size--;
        return num;
    }

    private void resize() {
        this.capacity = 2 * this.capacity;
        int[] newArr = new int[this.capacity];
        for(int i = 0; i < this.arr.length; i++) {
            newArr[i] = this.arr[i];
        }
        this.arr = newArr;
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
