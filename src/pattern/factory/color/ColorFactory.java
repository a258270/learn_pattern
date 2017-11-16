package pattern.factory.color;

public class ColorFactory {
    public static Object getColor(Class<? extends Color> clazz) {
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
