package creational.abstractFactory.factories;


import creational.abstractFactory.products.Document;
import creational.abstractFactory.products.Letter;
import creational.abstractFactory.products.Report;
import creational.abstractFactory.products.Resume;

// Modern family of docs
public class ModernDocumentFactory extends DocumentFactory {
    @Override
    public Document createLetter() {
        return new Letter("Modern");
    }

    @Override
    public Document createReport() {
        return new Report("Modern");
    }

    @Override
    public Document createResume() {
        return new Resume("Modern");
    }
}
