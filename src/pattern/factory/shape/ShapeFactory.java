package pattern.factory.shape;

public class ShapeFactory {

    public static Object getShape(Class<? extends Shape> clazz) {
        try {
            return Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }
}
