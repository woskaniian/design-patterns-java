package structural.adapter;

public class CompositeServiceAdapter implements ServiceAdapter {
    private ServiceAdaptee serviceAdaptee;

    public CompositeServiceAdapter(ServiceAdaptee serviceAdaptee) {
        this.serviceAdaptee = serviceAdaptee;
    }

    public String getSomeInfo() {
        return String.valueOf(serviceAdaptee.getInfo());
    }

    @Override
    public Integer getSomeInfo2() {
        return Integer.valueOf(serviceAdaptee.getInfo2());
    }

}
