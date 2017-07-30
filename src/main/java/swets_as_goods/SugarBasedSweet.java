package swets_as_goods;

public abstract class SugarBasedSweet extends AbstractSweet {
    private Double candyWeightGrammes;
    private Double pricePerKilo;

    public Double getCandyWeightGrammes() {
        return candyWeightGrammes;
    }

    public void setCandyWeightGrammes(Double candyWeightGrammes) {
        this.candyWeightGrammes = candyWeightGrammes;
    }

    public Double getPricePerKilo() {
        return pricePerKilo;
    }

    public void setPricePerKilo(Double pricePerKilo) {
        this.pricePerKilo = pricePerKilo;
    }

    @Override
    public int compareTo(AbstractSweet other) {
        return Double.compare(this.getContentOfSweet().getEnergeticValue(),other.getContentOfSweet().getEnergeticValue());
    }
}