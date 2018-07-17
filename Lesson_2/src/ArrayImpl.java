import java.util.Arrays;
import java.util.Random;

public class ArrayImpl implements Array {


    protected int currentsize;
    protected int[] data;



    public ArrayImpl(int size) {
        this.currentsize = 0;
        this.data = new int[size];
    }



    public ArrayImpl(int[] data, int currentsizesize) {
        this.currentsize= currentsizesize;
        this.data = Arrays.copyOf(data, data.length);
    }



    @Override
    public int[] getArray() {
        return data;
    }


    @Override
    public int getElement(int index) {
        return data[index];
    }

    @Override
    public void setElement(int value, int index) {
        data[index] = value;
    }

    @Override
    public void addElement(int value) {
        data[currentsize++] = value;
    }

    @Override
    public void display() {
        for (int i = 0; i < currentsize; i++) {
            System.out.println(data[i]);

        }
    }

    @Override
    public int getSize() {
        return currentsize;
    }

    @Override
    public int find(int value) {
        int targetindex = -100;
        for (targetindex = 0; targetindex < currentsize; targetindex++) {
            if (data[targetindex] == value)
                return targetindex;
        }
        return -1;
    }


    @Override
    public boolean deleteElement(int value) {
        int targetindex = find(value);
        if (targetindex == -1)
            return false;

        for (int i = targetindex; i < currentsize - 1; i++) {
            data[i] = data[i + 1];
        }
        currentsize--;
        return true;
    }

    @Override
    public int fillArr() {                     //генератор случ. чисел от 0 до 9(вкл.)
        Random rand = new Random();
        int r = rand.nextInt(10);
        return r;
    }

    @Override //O(N^2)
    public void bubbleSort() {
        for (int i = 0; i < currentsize - 1; i++) {
            for (int j = 0; j < currentsize - 1 - i; j++) {
                if (data[j] > data[j + 1]) {
                    exchange(j, j + 1);
                }

            }

        }

    }

    private void exchange(int index1, int index2) {
        int temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;
    }

    @Override
    public void selectSort() {
        int minValueUndex;

        for (int i = 0; i < currentsize - 1; i++) {
            minValueUndex = i;

            for (int j = i + 1; j < currentsize; j++) {
                if (data[j] < data[minValueUndex]) {
                    minValueUndex = j;
                }
            }
            if (minValueUndex != i) {
                exchange(i, minValueUndex);
            }

        }
    }

    @Override
    public void insertSprt() {
        for (int i = 1; i < currentsize ; i++) {
            int temp = data[i];
            int index = i;
            while (index > 0 && data[index - 1] >= temp){
                data[index] = data[index-1];
                index--;
            }
            data[index] = temp;
        }
    }
}
