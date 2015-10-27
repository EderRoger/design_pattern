package template_method;

/**
 * Created by eder on 26/10/15.
 */
public class Coffe extends CaffeineBeverage{

    @Override
    void brew() {
        System.out.println("Dripping coffe throught filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

}
