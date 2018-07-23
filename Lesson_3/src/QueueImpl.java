public class QueueImpl implements Queue {

    public static final int DEFAULT_REAR = -1;
    public static final int DEFAULT_FRONT = 0;


    private int[] data;
    private int currentSize;

    private int front;
    private int rear;

    public QueueImpl(int maxSize) {
        this.currentSize = 0;
        this.front = DEFAULT_FRONT;
        this.rear = DEFAULT_REAR;
        this.data = new int[maxSize];
    }


    @Override
    public int remove() {
        int removedValue = data[front++];
        if (front == data.length) {
            front = DEFAULT_FRONT;
        }
        currentSize--;
        return removedValue;
    }

    @Override
    public void insert(int value) {
        if (rear == data.length - 1) {
            rear = DEFAULT_REAR;
        }
        data[++rear] = value;
        currentSize++;
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