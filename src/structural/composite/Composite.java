package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    private String field1;
    private String field2;
    private String field3;
    private List<Component> children;

    public Composite(String field1, String field2, String field3) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
        children = new ArrayList<>();
    }

    public void addChild(Component component) {
        this.children.add(component);
    }

    public void removeChild(Component component) {
        this.children.remove(component);
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

    public String getField3() {
        return field3;
    }

    public void setField3(String field3) {
        this.field3 = field3;
    }

    @Override
    public void doSomething() {
        System.out.println("Calling children for doing work in " + this.toString());
        for (Component component : this.children) {
            component.doSomething();
        }
    }

    @Override
    public String toString() {
        return "Composite{" +
                "field1='" + field1 + '\'' +
                ", field2='" + field2 + '\'' +
                ", field3='" + field3 + '\'' +
                ", children=" + children +
                '}';
    }
}
