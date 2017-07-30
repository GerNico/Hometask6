package swets_as_goods.components;

public abstract class AbstractComponentForSweet implements InterfaceSweetComponent {
    private String componentName;
    private String componentProducer;
    private Double pricePerKilo;
    private Double kkaloryesPer100Grammes;

    @Override
    public String getComponentName() {
        return componentName;
    }

    @Override
    public String getComponentProducer() {
        return componentProducer;
    }

    @Override
    public Double getPricePerKilo() {
        return pricePerKilo;
    }

    public Double getKkaloryesPer100Grammes() {
        return kkaloryesPer100Grammes;
    }

    @Override
    public Double getKKaloryesPer100Grammes() {
        return this.kkaloryesPer100Grammes;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    public void setComponentProducer(String componentProducer) {
        this.componentProducer = componentProducer;
    }

    public void setPricePerKilo(Double pricePerKilo) {
        this.pricePerKilo = pricePerKilo;
    }

    public void setKkaloryesPer100Grammes(Double kkaloryesPer100Grammes) {
        this.kkaloryesPer100Grammes = kkaloryesPer100Grammes;
    }

}
