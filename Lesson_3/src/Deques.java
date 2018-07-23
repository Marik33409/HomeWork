public interface Deques {

    void InsertLeft(int value);

    void InsertRight(int value);

    int RemoveLeft();

    int RemoveRight();

    int getSize();

    boolean isEmpty();

    boolean isFull();

}
