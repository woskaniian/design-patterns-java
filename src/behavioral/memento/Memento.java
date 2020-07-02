package behavioral.memento;

// This can also be inner class in Originator
public final class Memento {
    private final String field1;
    private final int field2;
    private final boolean field3;

    public Memento(String field1, int field2, boolean field3) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }

    public String getField1() {
        return field1;
    }

    public int getField2() {
        return field2;
    }

    public boolean getField3() {
        return field3;
    }
}
