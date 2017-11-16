package pattern.abstractfactory.color;

public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Green执行fill方法");
    }
}
