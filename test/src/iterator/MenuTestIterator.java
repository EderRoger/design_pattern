package iterator;

import composite.*;
import composite.Menu;
import org.junit.Test;

/**
 * Created by eder on 03/11/15.
 */
public class MenuTestIterator {
    @Test
    public void testWaitressPrintMenu() {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinnerMenu = new Menu("DINNER MENU", "Lunch");
        MenuComponent caffeMenu = new Menu("CAFFE MENU", "Caffe Menu");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Desert of course!");

        MenuComponent allMenus = new Menu("ALL MENUS", "All Menus combined");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinnerMenu);
        allMenus.add(caffeMenu);

        dinnerMenu.add(new MenuItem("Vegeratarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99));
        dinnerMenu.add(new MenuItem("BLT", "Bacon with lettuce & tomato on whole wheat", true, 2.99));
        dinnerMenu.add(new MenuItem("Soupe of the day","Soupe of the day, with a side of potato salad", false, 3.29));
        dinnerMenu.add(new MenuItem("HotDog", "a hot dog with saurkraut, relish, onions, topped with cheese", false, 3.05));

        caffeMenu.add(new MenuItem("Veggie Burger and Air  Fries", "Veggie burger on a whole wheat bun, lettuce, tomato, and fries", true, 3.99));
        caffeMenu.add(new MenuItem("Soup of the day", "A cup of soup of the day, with a side salad", false, 3.69));
        caffeMenu.add(new MenuItem("Burrito", "A large burrito, with a whole pinto beans, salsa, guacamole", true, 4.29));

        pancakeHouseMenu.add(new MenuItem("K&B's Pancake Breakfast", "Pancakes with scramble eggs, and toast", true, 2.99));
        pancakeHouseMenu.add(new MenuItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99));
        pancakeHouseMenu.add(new MenuItem("Blueberry Pancake's", "Pancakes made with fresh blueberries", true, 3.49));
        pancakeHouseMenu.add(new MenuItem("Waffles","Waffles with your choice of blueberries or strawberries", true, 3.59));

        dessertMenu.add(new MenuItem("Apple pie", "Apple pie with a flake", true, 1.59));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();

    }
}
