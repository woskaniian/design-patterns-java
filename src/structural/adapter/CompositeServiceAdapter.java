package structural.adapter;

public class CompositeServiceAdapter implements ServiceAdapter {
    private ServiceAdaptee serviceAdaptee = new ServiceAdaptee();

    public CompositeServiceAdapter() {
    }

    @Override
    public String getSomeInfo() {
        return String.valueOf(serviceAdaptee.getInfo());
    }

    @Override
    public Integer getSomeInfo2() {
        return Integer.valueOf(serviceAdaptee.getInfo2());
    }

}
