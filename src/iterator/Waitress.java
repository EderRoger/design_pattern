package iterator;

import composite.MenuComponent;

/**
 * Created by eder on 03/11/15.
 */
public class Waitress {

    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu(){
        allMenus.print();
    }

    /*ArrayList menus;

    Menu pancakeHouseMenu;
    Menu dinerMenu;
    Menu caffeMenu;

    public Waitress(ArrayList menus) {
        this.menus = menus;
    }

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu caffeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.caffeMenu = caffeMenu;
    }

    public void printMenu(){
        Iterator menuIterator = menus.iterator();
        while(menuIterator.hasNext()){
            Menu menu = (Menu) menuIterator.next();
            printMenu(menu.createIterator());
        }
    }

    public void printMenuOldVersion(){
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
    }*/
}
