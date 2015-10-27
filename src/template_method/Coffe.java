package template_method;

/**
 * Created by eder on 26/10/15.
 */
public class Coffe {
    void prepareRecipe(){
        boilWater();
        brewCoffeGrinds();
        pourInCup();
        addSugarAndMilk();
    }

    public void addSugarAndMilk() {
        System.out.println("Adding sugar and milk");
    }

    public void pourInCup() {
        System.out.println("Pouring in to cup");
    }

    public void brewCoffeGrinds() {
        System.out.println("Drimpping coffe throught filter");
    }

    public void boilWater() {
        System.out.println("Boiling water");
    }

}
