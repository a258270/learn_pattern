package pattern.state;

/**
 * Created by My on 2018/1/15.
 */
public class CloseState extends State {
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

    }

    @Override
    public void run() {
        System.out.println("正在运行");
        this.getContext().setState(new RunState());
        System.out.println("已运行");
    }
}
