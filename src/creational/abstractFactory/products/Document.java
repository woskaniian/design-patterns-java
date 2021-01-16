package creational.abstractFactory.products;


// Abstract Product
public abstract class Document {
    String style;

    public Document(String style) {
        this.style = style;
    }

    @Override
    public String toString() {
        return "Document{" +
                "style='" + style + "', " +
                "type='" + this.getClass().getSimpleName() + '\'' +
                '}';
    }
}
