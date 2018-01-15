package pattern.strategy;

/**
 * Created by My on 2018/1/15.
 */
public class TrainStrategy implements Strategy {
    @Override
    public void travel() {
        System.out.println("乘坐火车旅行");
    }
}
