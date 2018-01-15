package pattern.state;

/**
 * Created by My on 2018/1/15.
 */
public class StateMain {

    public static void main(String[] args) {
        Context context = new Context(new StopState());
        context.run();
        context.open();
        context.close();
    }
}
