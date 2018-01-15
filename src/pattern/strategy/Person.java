package pattern.strategy;

/**
 * Created by My on 2018/1/15.
 */
public class Person {

    private Strategy strategy;

    public Person(Strategy strategy) {
        this.strategy = strategy;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void travel() {
        this.getStrategy().travel();
    }
}
