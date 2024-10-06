package gui.factory;

public class UIElementFactoryProducer {
    public static IUIElementFactory getFactory(String type) {
        if (type.equalsIgnoreCase("DARK")) {
            return new DarkUIElementFactory();
        } else if (type.equalsIgnoreCase("LIGHT")) {
            return new LightUIElementFactory();
        }
        throw new IllegalArgumentException("Unknown factory type: " + type);
    }
}
