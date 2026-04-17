class DynamicArray {

    private int capacity;
    private int size;

    private int[] arr;

    public DynamicArray(int capacity) {
        this.arr = new int[capacity];
        this.capacity = capacity;
        this.size = 0;
    }

    public int get(int i) {
        return this.arr[i];
    }

    public void set(int i, int n) {
        this.arr[i] = n;
    }

    public void pushback(int n) {
        if(this.capacity == this.size) {
             this.resize();
        } 
        arr[this.size] = n;
        this.size += 1;
    }

    public int popback() {
        this.size -= 1;
        return this.arr[this.size];
    }

    private void resize() {
        this.capacity = this.capacity * 2;
        int[] newArr = new int[this.capacity];
        for(int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
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
