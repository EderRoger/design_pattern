package iterator;

import java.util.Iterator;

/**
 * Created by eder on 03/11/15.
 */
public class Waitress {

    Menu pancakeHouseMenu;
    Menu dinerMenu;
    Menu caffeMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu caffeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.caffeMenu = caffeMenu;
    }

    public void printMenu(){
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();
        Iterator caffeIterator = caffeMenu.createIterator();
        System.out.println("Menu\n------\nBREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("\nLunch");
        printMenu(dinerIterator);
        System.out.println("\nDinner");
        printMenu(caffeIterator);
    }

    private void printMenu(Iterator iterator){
        while (iterator.hasNext()){
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + ",   ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.print(menuItem.getDescription());
        }
    }
}
