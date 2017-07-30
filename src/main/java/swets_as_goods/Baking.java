package swets_as_goods;

import java.math.BigDecimal;

public abstract class Baking extends AbstractSweet {
    private Double packageSizeGrammes;
    private Double pricePerPackage;
    private String typeOfPackage;

    public String getTypeOfPackage() {
        return typeOfPackage;
    }

    public void setTypeOfPackage(String typeOfPackage) {
        this.typeOfPackage = typeOfPackage;
    }

    public Double getPackageSizeGrammes() {
        return packageSizeGrammes;
    }

    public void setPackageSizeGrammes(Double packageSizeGrammes) {
        this.packageSizeGrammes = packageSizeGrammes;
    }

    public Double getPricePerPackage() {
        return pricePerPackage;
    }

    public void setPricePerPackage(Double pricePerPackage) {
        this.pricePerPackage = pricePerPackage;
    }

}
