public class CharStack {

    private char[] data;
    private int currentSize;

    public CharStack(int maxSize) {
        this.currentSize = 0;
        this.data = new char[maxSize];
    }



    public char pop() {
        try {
            return this.data[--currentSize];
        }
        catch (IndexOutOfBoundsException e)
        {
            throw new IllegalArgumentException("Нельзя вызывать pop() для пустого стека!", e);
        }
    }

    public void push(char value) {
        try {
            this.data[currentSize++] = value;
        }
        catch (IndexOutOfBoundsException e)
        {
            throw new IllegalArgumentException("Нельзя вызывать push() для заполненного стека!", e);
        }
    }

    public char peek() {
        return this.data[currentSize - 1];
    }

    public int getSize() {
        return currentSize;
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public boolean isFull() {
        return currentSize >= data.length;
    }
}
