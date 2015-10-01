package estudos.padroes;

/**
 * Created by eder on 30/09/15.
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<<Silence>>");
    }
}
