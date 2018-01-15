package pattern.strategy;

/**
 * Created by My on 2018/1/15.
 */
public class StrategyMain {

    public static void main(String[] args) {

        Person person = new Person(new TrainStrategy());
        person.travel();

        person.setStrategy(new CarStrategy());
        person.travel();
    }
}
