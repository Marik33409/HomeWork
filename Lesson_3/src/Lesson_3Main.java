public class Lesson_3Main {

    public static void main(String[] args) {
//        Stack st = new StackImpl(5);
//        st.push(1);
//        st.push(2);
//        st.push(3);
//        st.push(4);
//        st.push(5);
//        st.push(6);

//        System.out.println("Stack top = " + st.peek());
//        System.out.println("isFull = " + st.isFull());
//
//        while (!st.isEmpty()) {
//            System.out.println(st.pop());
//        }

//        st.pop();


//        Brackets bracketsChecker = new Brackets("while ( !st.isEmpty[] ) {System.out.println(st.pop())};");
//        Brackets bracketsChecker = new Brackets("while;");
//        bracketsChecker.check();

//        Queue queue = new QueueImpl(5);
//        Queue queue = new PriorityQueue(5);
//
//        addToQueue(queue, 3);
//        addToQueue(queue, 1);
//        addToQueue(queue, 5);
//        addToQueue(queue, 4);
//        addToQueue(queue, 2);
//        addToQueue(queue, 6);
//
//        while ( !queue.isEmpty() ) {
//            System.out.println(queue.remove());
//        }
//
//        System.out.println("Finish");
//    }
//
//    private static void addToQueue(Queue queue, int value) {
//        if ( !queue.isFull() ) {
//            queue.insert(value);
//        }
//        Turn turnit = new Turn("Oleg");
//        turnit.expand();

        Deques deques = new DequeImpl(15);
//        addLeft(deques,1);
//        addLeft(deques,3);
//        addLeft(deques,2);
//        addLeft(deques,9);
//        addLeft(deques,8);
        addRight(deques,1);
        addRight(deques,2);
        addRight(deques,3);
        addRight(deques,4);

        while ( !deques.isEmpty() ) {
            System.out.println(deques.RemoveRight());
        }

//        while ( !deques.isEmpty() ) {
//            System.out.println(deques.RemoveLeft());
//        }


    }

    private static void addLeft(Deques deques, int value) {
        if (!deques.isFull()) {
            deques.InsertLeft(value);
        }
    }

    private static void addRight(Deques deques, int value) {
        if (!deques.isFull()) {
            deques.InsertRight(value);
        }
    }

}


