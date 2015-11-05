package iterator;

import org.junit.Test;

/**
 * Created by eder on 03/11/15.
 */
public class MenuTestIterator {
    @Test
    public void testWaitressPrintMenu(){
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        waitress.printMenu();
    }
}
