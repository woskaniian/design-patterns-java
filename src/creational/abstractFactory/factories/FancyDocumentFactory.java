package creational.abstractFactory.factories;


import creational.abstractFactory.products.Document;
import creational.abstractFactory.products.Letter;
import creational.abstractFactory.products.Report;

// Fancy family of docs
public class FancyDocumentFactory extends DocumentFactory {

    @Override
    public Document createLetter() {
        return new Letter("Fancy");
    }

    @Override
    public Document createReport() {
        return new Report("Fancy");
    }

    @Override
    public Document createResume() {
        return new Report("Fancy");
    }
}
