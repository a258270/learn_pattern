package pattern.abstractfactory;

public class FactoryBuilder {

    public static AbstractFactory getFactory(Class<? extends AbstractFactory> clazz) {
        try {
            return (AbstractFactory) Class.forName(clazz.getName()).newInstance();
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
