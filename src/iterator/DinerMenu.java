package iterator;

/**
 * Created by eder on 29/10/15.
 */
public class DinerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItens = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Vegeratarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("BLT", "Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("Soupe of the day","Soupe of the day, with a side of potato salad", false, 3.29);
        addItem("HotDog", "a hot dog with saurkraut, relish, onions, topped with cheese", false, 3.05);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if(numberOfItens >= MAX_ITEMS){
            System.out.println("sorry, menu is full! Can't add item to menu");
        }else{
            menuItems[numberOfItens] = menuItem;
            numberOfItens++;
        }
    }

    public Iterator createIterator(){
        return  new DinerMenuIterator(menuItems);
    }

}