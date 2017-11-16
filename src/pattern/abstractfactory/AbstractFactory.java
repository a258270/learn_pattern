package pattern.abstractfactory;

import pattern.abstractfactory.color.Color;
import pattern.abstractfactory.shape.Shape;

public abstract class AbstractFactory {
    public abstract Color getColor(Class<? extends Color> clazz);
    public abstract Shape getShape(Class<? extends Shape> clazz);
}
