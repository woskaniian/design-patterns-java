package creational.prototype;

public class PrototypeCapableProduct implements PrototypeCapable {
    private String field1;
    private String field2;
    private int field3;
    private int field4;

    public PrototypeCapableProduct(String field1, String field2, int field3, int field4) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
        this.field4 = field4;
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

    public int getField3() {
        return field3;
    }

    public void setField3(int field3) {
        this.field3 = field3;
    }

    public int getField4() {
        return field4;
    }

    public void setField4(int field4) {
        this.field4 = field4;
    }

    @Override
    public String toString() {
        return "PrototypeCapableProduct{" +
                "field1='" + field1 + '\'' +
                ", field2='" + field2 + '\'' +
                ", field3=" + field3 +
                ", field4=" + field4 +
                '}';
    }

    @Override
    public PrototypeCapable clone() throws CloneNotSupportedException {
        return (PrototypeCapableProduct) super.clone();
    }
}
