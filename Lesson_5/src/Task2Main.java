import java.util.ArrayList;
import java.util.List;

public class Task2Main {

    public static void main(String[] args) {
        List<Item> list = new ArrayList<>();//создаем коллекцию
        list.add(new Item("Книга", 1, 600) );//объявляем предметы
        list.add(new Item("Бинокль", 2, 5000) );
        list.add(new Item("Аптечка", 4, 1500) );
        list.add(new Item("Ноутбук", 2, 40000) );
        list.add(new Item("Котелок", 1, 500) );

        Backpack backpack = new Backpack(5);
        backpack.calculateBestСonfig(list);
        list = backpack.getBestConfig();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).name + " " + list.get(i).price);
        }
        System.out.println("Количество сравниваемых наборов: " + backpack.count);
    }
}
