package template_method;

/**
 * Created by eder on 27/10/15.
 */
public abstract class CaffeineBeverage {
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();
    abstract void addCondiments();

    public void pourInCup() {
        System.out.println("Pouring in to cup");
    }

    public void boilWater() {
        System.out.println("Boiling water");
    }
}
