package pattern.state;

/**
 * Created by My on 2018/1/15.
 */
public abstract class State {

    protected Context context;

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public abstract void open();

    public abstract void close();

    public abstract void stop();

    public abstract void run();
}
