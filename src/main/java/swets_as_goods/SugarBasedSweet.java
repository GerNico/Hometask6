package swets_as_goods;

public abstract class SugarBasedSweet extends AbstractSweet  {
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

    public Double getEnergeticValue(){
        Double result=0.0;
        for (int i=0;i<this.contentOfSweet.getComponents().size();i++) {
            result+=this.contentOfSweet.getComponents().get(i).getKKaloryesPer100Grammes()
                    *this.contentOfSweet.getPercentOfComponent().get(i);
        }
        result=result*this.getCandyWeightGrammes()/100;
        return result;
    }

}