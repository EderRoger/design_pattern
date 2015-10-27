package template_method;

import org.junit.Test;

/**
 * Created by eder on 27/10/15.
 */
public class TemplateMethodTest {

    @Test
    public void testCaffeineBeverage(){

        Tea tea = new Tea();
        Coffe coffe = new Coffe();

        System.out.println("Making tea\n");
        tea.prepareRecipe();

        System.out.println("Making coffe");
        coffe.prepareRecipe();

    }
}
