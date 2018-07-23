public class PriorityQueue implements Queue {

    private int[] data;
    private int currentSize;

    public PriorityQueue(int maxSize) {
        this.currentSize = 0;
        this.data = new int[maxSize];
    }

    @Override
    public int remove() {
        return data[--currentSize];
    }

    @Override
    public void insert(int value) {
        if (currentSize == 0) {
            data[currentSize++] = value;
        }
        else {
            int i;
            for (i = currentSize - 1; i >= 0; i--) {
                if (value > data[i]) {
                    data[i + 1] = data[i];
                }
                else {
                    break;
                }
            }
            data[i + 1] = value;
            currentSize++;
        }
    }


    @Override
    public int getSize() {
        return currentSize;
    }

    @Override
    public boolean isEmpty() {
        return currentSize == 0;
    }

    @Override
    public boolean isFull() {
        return currentSize == data.length;
    }
}
