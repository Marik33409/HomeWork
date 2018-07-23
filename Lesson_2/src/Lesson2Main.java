import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Lesson2Main {

    public static void main(String[] args) {
        Array array = new OrderedArray(10);
        array.addElement(2);
        array.addElement(1);
        array.addElement(4);
        array.addElement(3);
        array.addElement(4);
        array.addElement(5);
        array.addElement(6);
        array.addElement(4);
        array.addElement(10);
        array.addElement(9);

        System.out.println("Size is " + array.getSize());
        array.display();

        System.out.println("Deleting 4");

        boolean needDelete= true;
        while (needDelete){
            needDelete = array.deleteElement(4);
        }
        System.out.println(array.deleteElement(4));
        array.display();

        System.out.println("Position of value 5 is " + array.find(5));
        System.out.println("_____________________________________________");


        Array array1 = new ArrayImpl(10000);
        for (int i = 0; i <  10000; i++) {
            Random rand = new Random();
            int r = rand.nextInt(10);
            array1.addElement(r);
        }
        Array array2 = new ArrayImpl(array1.getArray(), array1.getSize());
        Array array3 = new ArrayImpl(array1.getArray(), array1.getSize());


        System.out.println("Original random array for BUBLE SORT");
        //array1.display();

        long startTime = System.nanoTime();;
        array1.bubbleSort();
        long timeSpent = System.nanoTime() - startTime;
        System.out.println("_________________________________BUBLE SORT_________________________________");
        //array1.display();
        System.out.println("Time of completion " + TimeUnit.NANOSECONDS.toMillis(timeSpent) + " ms");

        System.out.println("Original random array for SELECT SORT ");
        System.out.println("____________");
        //array2.display();

        long startTime1 = System.nanoTime();
        array2.selectSort();
        long timeSpent1 = System.nanoTime() - startTime1;
        System.out.println("_________________________________SELECT SORT_________________________________");
        //array2.display();
        System.out.println("Time of completion " + TimeUnit.NANOSECONDS.toMillis(timeSpent1) + " ms");

        System.out.println("Original random array for INSERT SORT");
        System.out.println("____________");
        //array3.display();

        long startTime2 = System.nanoTime();
        array3.insertSprt();
        long timeSpent2 = System.nanoTime() - startTime2;
        System.out.println("_________________________________INSERT SORT_________________________________");
        //array3.display();
        System.out.println("Time of completion " + TimeUnit.NANOSECONDS.toMillis(timeSpent2) + " ms");

    }
}