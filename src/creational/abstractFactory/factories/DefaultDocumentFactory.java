package creational.abstractFactory.factories;

import creational.abstractFactory.products.Document;
import creational.abstractFactory.products.Letter;
import creational.abstractFactory.products.Report;


public class DefaultDocumentFactory extends DocumentFactory {
    @Override
    public Document createLetter() {
        return new Letter("Default");
    }

    @Override
    public Document createReport() {
        return new Report("Default");
    }

    @Override
    public Document createResume() {
        return new Report("Default");
    }
}
