package template_method;

/**
 * Created by eder on 27/10/15.
 */
public class Tea {
    void prepareRecipe(){
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }

    public void addLemon() {
        System.out.println("Adding lemon");
    }

    public void pourInCup() {
        System.out.println("pouring in to cup");
    }

    public void steepTeaBag() {
        System.out.println("Steeping the tea");
    }

    public void boilWater() {
        System.out.println("Boiling water");
    }
}
