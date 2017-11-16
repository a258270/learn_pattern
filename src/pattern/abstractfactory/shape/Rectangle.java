package pattern.abstractfactory.shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle执行draw方法");
    }
}
