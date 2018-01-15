package pattern.state;

/**
 * Created by My on 2018/1/15.
 */
public class Context {

    private State state;

    public Context(State state) {
        this.setState(state);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
        this.state.setContext(this);
    }

    public void open() {
        this.getState().open();
    }

    public void close(){
        this.getState().close();
    }

    public void stop(){
        this.getState().stop();
    }

    public void run(){
        this.getState().run();
    }
}
