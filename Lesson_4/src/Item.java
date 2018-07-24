import java.util.Objects;

public class Item {

    private  final int value;
    private  Item nextItem;

    public  Item(int value) {
         this.value = value;
     }

    public int getValue() {
        return value;
    }

    public Item getNextItem() {
        return nextItem;
    }

    public void setNextItem(Item nextItem) {
        this.nextItem = nextItem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return value == item.value &&
                Objects.equals(nextItem, item.nextItem);
    }

    @Override
    public String toString() {
        return "Item{" +
                "value=" + value +
                '}';
    }
}
