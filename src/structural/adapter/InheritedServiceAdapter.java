package structural.adapter;

public class InheritedServiceAdapter extends ServiceAdaptee implements ServiceAdapter {
    public String getSomeInfo() {
        return String.valueOf(super.getInfo());
    }

    @Override
    public Integer getSomeInfo2() {
        return Integer.valueOf(super.getInfo2());
    }

}
