package pattern.state;

/**
 * Created by My on 2018/1/15.
 */
public class OpenState extends State {
    @Override
    public void open() {

    }

    @Override
    public void close() {
        System.out.printf("正在关门");
        this.getContext().setState(new CloseState());
        System.out.printf("已关门");
    }

    @Override
    public void stop() {

    }

    @Override
    public void run() {

    }
}
