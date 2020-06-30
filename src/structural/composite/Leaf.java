package structural.composite;

public class Leaf implements Component {
    private String field1;
    private String field2;

    public Leaf(String field1, String field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    @Override
    public void doSomething() {
        System.out.println("Doing some work in: " + this.toString());
    }

    @Override
    public String toString() {
        return "Leaf{" +
                "field1='" + field1 + '\'' +
                ", field2='" + field2 + '\'' +
                '}';
    }
}
