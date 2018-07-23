public class DequeImpl implements Deques{

    public static final int DEFAULT_REAR = -1;
    public static final int DEFAULT_FRONT = 0;


    private int[] data;
    private int currentSize;

    private int front;
    private int rear;

    public DequeImpl(int maxSize) {
        this.currentSize = 0;
        this.front = DEFAULT_FRONT;
        this.rear = DEFAULT_REAR;
        this.data = new int[maxSize];
    }

    @Override
    public void InsertLeft(int value) {
        if (rear == data.length - 1) {
            rear = DEFAULT_REAR;
        }
        data[++rear] = value;
        currentSize++;
    }

    @Override
    public void InsertRight(int value) {
        if (front == 0) {
            front = data.length;
        }
    data[--front]=value;
    currentSize++;
    }

    @Override
    public int RemoveLeft() {
        int removedValue = data[++rear];
        if (rear == 0) {
            rear = DEFAULT_REAR;
        }
        currentSize--;
        return removedValue;
    }

    @Override
    public int RemoveRight() {
        int removedValue = data[front++];
        if (front == data.length) {
            front = DEFAULT_FRONT;
        }
        currentSize--;
        return removedValue;
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
