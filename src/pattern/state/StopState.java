package pattern.state;

/**
 * Created by My on 2018/1/15.
 */
public class StopState extends State {
    @Override
    public void open() {

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
