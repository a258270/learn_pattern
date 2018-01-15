package pattern.state;

/**
 * Created by My on 2018/1/15.
 */
public class RunState extends State {
    @Override
    public void open() {
        System.out.println("正在开门");
        this.getContext().setState(new OpenState());
        System.out.println("已开门");
    }

    @Override
    public void close() {

    }

    @Override
    public void stop() {
        System.out.println("正在停止");
        this.getContext().setState(new StopState());
        System.out.println("已停止");
    }

    @Override
    public void run() {

    }
}
