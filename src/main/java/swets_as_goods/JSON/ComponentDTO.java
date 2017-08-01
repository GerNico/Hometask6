package swets_as_goods.JSON;

public class ComponentDTO {
        String name;
        String producer;
        Double kkaloryesPer100Grammes;
        Double pricePerKilo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public Double getKkaloryesPer100Grammes() {
        return kkaloryesPer100Grammes;
    }

    public void setKkaloryesPer100Grammes(Double kkaloryesPer100Grammes) {
        this.kkaloryesPer100Grammes = kkaloryesPer100Grammes;
    }

    public Double getPricePerKilo() {
        return pricePerKilo;
    }

    public void setPricePerKilo(Double pricePerKilo) {
        this.pricePerKilo = pricePerKilo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ComponentDTO)) return false;

        ComponentDTO that = (ComponentDTO) o;

        if (!getName().equals(that.getName())) return false;
        if (!getProducer().equals(that.getProducer())) return false;
        if (getKkaloryesPer100Grammes() != null ? !getKkaloryesPer100Grammes().equals(that.getKkaloryesPer100Grammes()) : that.getKkaloryesPer100Grammes() != null)
            return false;
        return getPricePerKilo().equals(that.getPricePerKilo());
    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getProducer().hashCode();
        result = 31 * result + (getKkaloryesPer100Grammes() != null ? getKkaloryesPer100Grammes().hashCode() : 0);
        result = 31 * result + getPricePerKilo().hashCode();
        return result;
    }
}
