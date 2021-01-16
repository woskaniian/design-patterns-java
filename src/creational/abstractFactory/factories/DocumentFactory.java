package creational.abstractFactory.factories;

import creational.abstractFactory.products.Document;

// Abstract factory
public abstract class DocumentFactory {
    public abstract Document createLetter();
    public abstract Document createReport();
    public abstract Document createResume();
}
