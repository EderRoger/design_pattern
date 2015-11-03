package iterator;

import java.util.ArrayList;

/**
 * Created by eder on 29/10/15.
 */
public class PancakeHouseMenu {
    ArrayList menuItens;

    public PancakeHouseMenu() {
        menuItens  = new ArrayList();
        addItem("K&B's Pancake Breakfast", "Pancakes with scramble eggs, and toast", true, 2.99);
        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99);
        addItem("Blueberry Pancake's", "Pancakes made with fresh blueberries", true, 3.49);
        addItem("Waffles","Waffles with your choice of blueberries or strawberries", true, 3.59);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItens.add(menuItem);
    }

    public ArrayList getMenuItens() {
        return menuItens;
    }
}