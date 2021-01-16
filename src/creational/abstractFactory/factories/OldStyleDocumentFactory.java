package creational.abstractFactory.factories;

import creational.abstractFactory.products.Document;
import creational.abstractFactory.products.Letter;
import creational.abstractFactory.products.Report;


// Old style family of docs
public class OldStyleDocumentFactory extends DocumentFactory{

    @Override
    public Document createLetter() {
        return new Letter("OldStyle");
    }

    @Override
    public Document createReport() {
        return new Report("OldStyle");
    }

    @Override
    public Document createResume() {
        return new Report("OldStyle");
    }
}
