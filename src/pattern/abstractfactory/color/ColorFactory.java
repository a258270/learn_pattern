package pattern.abstractfactory.color;

import pattern.abstractfactory.AbstractFactory;
import pattern.abstractfactory.shape.Shape;

public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(Class<? extends Color> clazz) {
        try {
            return (Color) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public Shape getShape(Class<? extends Shape> clazz) {
        return null;
    }
}
