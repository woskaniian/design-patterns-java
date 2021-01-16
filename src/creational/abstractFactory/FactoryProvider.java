package creational.abstractFactory;

import creational.abstractFactory.factories.*;

public class FactoryProvider {
    public static DocumentFactory getDocumentFactory(String style) {
        switch (style) {
            case "Fancy":
                return new FancyDocumentFactory();
            case "Modern":
                return new ModernDocumentFactory();
            case "OldStyle":
                return new OldStyleDocumentFactory();
            default:
                return new DefaultDocumentFactory();
        }
    }
}
