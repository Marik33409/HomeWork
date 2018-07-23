import java.util.Arrays;

public class OrderedArray extends ArrayImpl {

    public OrderedArray(int size) {
        super(size);
    }

    @Override
    public  void addElement(int value) {
        int index = 0;
        for (index = 0; index < currentsize; index++) {
            if (data[index] >= value)
                break;

        }
        for (int i = currentsize; i > index ; i--) {
            data[i]=data[i- 1];
        }
        data[index]=value;
        currentsize++;
    }

    @Override
    public  int find(int value){
        int low=0;
        int high = currentsize-1;

        int mid;

        while (low < high) {
            mid = (low + high) / 2;
            if (data[mid] == value){
                return  mid;
            }

            if (data[mid] < value){
                low = mid + 1;
            }
            else{
                high = mid;
            }
        }
        return  -1;
    }

    @Override
    public  void  setElement(int value, int index){
        throw new UnsupportedOperationException();
    }

}
