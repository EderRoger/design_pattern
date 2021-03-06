package iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by eder on 29/10/15.
 */
public class PancakeHouseMenu implements Menu {
    ArrayList menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList();
        addItem("K&B's Pancake Breakfast", "Pancakes with scramble eggs, and toast", true, 2.99);
        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99);
        addItem("Blueberry Pancake's", "Pancakes made with fresh blueberries", true, 3.49);
        addItem("Waffles","Waffles with your choice of blueberries or strawberries", true, 3.59);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public Iterator createIterator(){
        //return  new PancakeHouseMenuIterator(menuItems);
        return menuItems.iterator();
    }
}
