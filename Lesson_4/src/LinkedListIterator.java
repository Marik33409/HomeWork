import java.util.Iterator;

public class LinkedListIterator implements ListIterator {

    private LinkedList list;
    private boolean firtIterate = true;

    private Item current;
    private Item previous;

    public LinkedListIterator(LinkedList list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if (firtIterate) {
            firtIterate = false;
            return list.getFirstElement() != null;
        }
        else {
            return current.getNextItem() != null;
        }
    }

    @Override
    public Integer next() {
        if (current == null) {
            current = list.getFirstItem();
        }
        else {
            previous = current;
            current = current.getNextItem();
        }
        return current.getValue();
    }

    @Override
    public void remove() {
        if (previous == null) {
            list.setFirstItem(current.getNextItem() );
            reset();
        }
        else {
            previous.setNextItem(current.getNextItem() );
            if (!hasNext() ) {
                reset();
            }
            else {
                current = current.getNextItem();
            }
        }
    }

    @Override
    public void reset() {
        firtIterate = false;
        current = list.getFirstItem();
        previous = null;
    }

    @Override
    public void insertBefore(int value) {
        Item newItem = new Item(value);
        if (previous == null) {
            newItem.setNextItem(list.getFirstItem() );
            list.setFirstItem(newItem);
            reset();
        }
        else {
            newItem.setNextItem(previous.getNextItem() );
            previous.setNextItem(newItem);
            current = newItem;
        }
    }

    @Override
    public void insertAfter(int value) {
        Item newItem = new Item(value);
        if (list.isEmpty() ) {
            list.setFirstItem(newItem);
            current = newItem;
        }
        else {
            newItem.setNextItem(current.getNextItem() );
            current.setNextItem(newItem);
            next();
        }
    }
}
