import java.util.Iterator;

public interface ListIterator extends Iterator<Integer> {

    void  reset();//Сброс

    void  insertBefore(int value);//Вставка до

    void insertAfter(int value);//Вставка после

}
