package pattern.factory.shape;

import pattern.factory.shape.Shape;

public class Circle implements Shape {


    @Override
    public void draw() {
        System.out.println("Circle执行draw方法");
    }
}
