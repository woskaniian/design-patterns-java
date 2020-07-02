package behavioral.memento;

public class Originator {
    private String field1;
    private int field2;
    private boolean field3;

    public Originator(String field1, int field2, boolean field3) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }

    // This can be done by serialization also
    public Memento createMemento() {
        return new Memento(field1, field2, field3);
    }

    // This can be done by deserialization also
    public void restoreMemento(Memento memento) {
        this.field1 = memento.getField1();
        this.field2 = memento.getField2();
        this.field3 = memento.getField3();
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public int getField2() {
        return field2;
    }

    public void setField2(int field2) {
        this.field2 = field2;
    }

    public boolean isField3() {
        return field3;
    }

    public void setField3(boolean field3) {
        this.field3 = field3;
    }

    @Override
    public String toString() {
        return "Originator{" +
                "field1='" + field1 + '\'' +
                ", field2=" + field2 +
                ", field3=" + field3 +
                '}';
    }
}
