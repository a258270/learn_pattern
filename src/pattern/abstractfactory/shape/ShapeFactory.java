package pattern.abstractfactory.shape;

import pattern.abstractfactory.AbstractFactory;
import pattern.abstractfactory.color.Color;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(Class<? extends Color> clazz) {
        return null;
    }

    @Override
    public Shape getShape(Class<? extends Shape> clazz) {
        try {
            return (Shape) Class.forName(clazz.getName()).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

        return null;
    }
}
