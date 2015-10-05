package decorator;

import org.junit.Test;

/**
 * Created by eder on 05/10/15.
 */
public class StarbuzzCoffe {

    @Test
    public void testCondimentDrink(){

        Beverage beverage = new Expresso();
        System.out.println(beverage.getDescription() + "$ " + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);

        System.out.println(beverage2.getDescription() + "$ " + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);

        System.out.println(beverage3.getDescription() + "$ " + beverage3.cost());


    }

}
