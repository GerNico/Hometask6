package swets_as_goods;

public abstract class SugarBasedSweet extends AbstractSweet implements Comparable<SugarBasedSweet> {
    private ContentOfSweet contentOfSweet;
    private Double candyWeightGrammes;

    public Double getCandyWeightGrammes() {
        return candyWeightGrammes;
    }

    public void setCandyWeightGrammes(Double candyWeightGrammes) {
        this.candyWeightGrammes = candyWeightGrammes;
    }

    public void setContentOfSweet(ContentOfSweet contentOfSweet) {
        this.contentOfSweet = contentOfSweet;
    }
    public ContentOfSweet getContentOfSweet() {
        return contentOfSweet;
    }

    @Override
    public int compareTo(SugarBasedSweet other) {
        return Double.compare(this.getContentOfSweet().getEnergeticValue(), other.getContentOfSweet().getEnergeticValue());
    }
}