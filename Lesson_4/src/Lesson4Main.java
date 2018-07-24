import java.util.Iterator;

public class Lesson4Main {

    public static void main(String[] args) {
//        LinkedList list = new LinkedListImpl();
//        list.insertFirst(1);
//        list.insertFirst(2);
//        list.insertFirst(3);
//        list.insertFirst(4);
//        list.display();

//        System.out.println("-----------------------");
//        list.removeFirst();
//        list.removeFirst();
//        list.removeFirst();
//        list.removeFirst();
////        list.removeFirst();
//        list.display();
//        System.out.println(list.isEmpty() );

//        System.out.println("Find 3 =" + list.find(3) );
//        System.out.println("Find 13 =" + list.find(13) );
//
//        System.out.println("Remove 5 =" + list.remove(5) );
//        list.display();


//        Stack st = new LinkedListStack();
//        st.push(1);
//        st.push(2);
//        st.push(3);
//        st.push(4);
//        st.push(5);
//        st.push(6);
//
//        System.out.println("Stack top = " + st.peek() );
//        System.out.println("isFull = " + st.isFull() );
//
//        while (!st.isEmpty() ) {
//            System.out.println(st.pop() );
//        }

//        st.pop();

//        TwoWayLinkedList twoWayLinkedList = new TwoWayLinkedListImpl();
//        twoWayLinkedList.insertFirst(1); //1
//        twoWayLinkedList.insertFirst(2); //2 1
//        twoWayLinkedList.insertLast(3); //2 1 3
//        twoWayLinkedList.insertFirst(4); //4 2 1 3
//        twoWayLinkedList.display();

//        Queue queue = new LinkedListQueue();

//        addToQueue(queue, 3);
//        addToQueue(queue, 1);
//        addToQueue(queue, 5);
//        addToQueue(queue, 4);
//        addToQueue(queue, 2);
//        addToQueue(queue, 6);

//        while (!queue.isEmpty() ) {
//            System.out.println(queue.remove() );
//        }
//
//        System.out.println("Finish");
        
        
//        LinkedList list = new LinkedListImpl();
//        list.insertFirst(1);
//        list.insertFirst(2);
//        list.insertFirst(3);
//        list.insertFirst(4);

//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext() ) {
//            Integer next = iterator.next();
//            System.out.println(next);
//        }

//        for (Integer value : list) {
//            System.out.println(value);
//        }

        LinkedList list = new LinkedListImpl();
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);

        displayItems(list);

        System.out.println("-----");

        ListIterator iterator = (ListIterator) list.iterator();
        iterator.reset(); //1! 2 3 4
        iterator.insertAfter(11); //1 11! 2 3 4
        iterator.next(); //1 11 2! 3 4
        iterator.remove(); //1 11 3! 4
        iterator.insertBefore(0); // 1 11 0! 3 4

        displayItems(list);

    }
    private static void displayItems(LinkedList list) {
        for (Integer value : list) {
            System.out.println(value);
        }
    }

//    private static void addToQueue(Queue queue, int value) {
//        if ( !queue.isFull() ) {
//            queue.insert(value);
//        }
//
//    }

}
