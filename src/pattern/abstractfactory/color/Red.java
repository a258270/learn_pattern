package pattern.abstractfactory.color;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Red执行fill方法");
    }
}
