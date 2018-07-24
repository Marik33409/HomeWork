public class TwoWayLinkedListImpl
        extends LinkedListImpl
        implements TwoWayLinkedList {

    protected Item lastElement;

    public TwoWayLinkedListImpl() {
        super();
    }

    @Override
    public void insertFirst(int value) {
        Item newElement = new Item(value);

        if (isEmpty() ){
            lastElement  = newElement;
        }
        newElement.setNextItem(firstElement);
        firstElement = newElement;
        size++;
    }

    @Override
    public void insertLast(int value) {
        Item newItem = new  Item(value);
        if ( isEmpty() ){
            firstElement = newItem;
        }
        else  {
            lastElement.setNextItem(newItem);
        }
        lastElement = newItem;
        size++;
    }

    @Override
    public int removeFirst() {
        int value = super.removeFirst();
        if (isEmpty() ) {
            lastElement = null;
        }
        return  value;
    }

    @Override
    public Integer getLastElement() {
        return lastElement != null ? lastElement.getValue() : null;
    }
}
