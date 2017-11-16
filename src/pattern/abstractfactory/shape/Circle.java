package pattern.abstractfactory.shape;

public class Circle implements Shape {


    @Override
    public void draw() {
        System.out.println("Circle执行draw方法");
    }
}
