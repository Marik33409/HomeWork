import java.util.ArrayList;
import java.util.List;

public class Backpack {

    private  int maxWeight;
    private  int maxPrice;
    private  List<Item> bestItems = null;
    public  int count = 0;

    public  Backpack (int maxWeight) {
        this.maxWeight = maxWeight;
    }

    private int calculateWeight(List<Item> items) {
        int sumWeight = 0;
        for (Item item : items) {
            sumWeight += item.weight;
        }
        return  sumWeight;
    }

    private int calculatePrice(List<Item> items) {
        int sumPrice = 0;
        for (Item item : items) {
            sumPrice += item.price;
        }
        return sumPrice;
    }

    private void bestConfig(List<Item> items) {
        if (bestItems == null) {
            if (calculateWeight(items) <= maxWeight) {
                bestItems = items;
                maxPrice = calculatePrice(items);
            }
        }
        else {
            if (calculateWeight(items) <= maxWeight && calculatePrice(items) > maxPrice) {
                bestItems = items;
                maxPrice = calculatePrice(items);
            }
        }
    }

    public  void calculateBestСonfig(List<Item> items) {
        if (items.size() > 0) {
            bestConfig(items);
            count++;
        }
        for (int i = 0; i < items.size(); i++) {
         List<Item> list = new ArrayList<>(items);
         list.remove(i);
         calculateBestСonfig(list);
        }
    }

    public List<Item> getBestConfig() {
        return bestItems;
    }

    public int getMaxPrice() {
        return maxPrice;
    }
}
