package iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by eder on 03/11/15.
 */
public class PancakeHouseMenuIterator implements Iterator {

    ArrayList menuItems;
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return !(position >= menuItems.size() || menuItems.get(position) == null);
    }

    @Override
    public Object next() {
        MenuItem menuItem = (MenuItem) menuItems.get(position);
        position++;
        return menuItem;
    }
}
