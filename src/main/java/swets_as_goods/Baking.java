package swets_as_goods;

public abstract class Baking extends AbstractSweet {
    private Double packageSizeGrammes;
    private String typeOfPackage;
    private int bakingTemperature;
    private Double energeticValue;

    public int getBakingTemperature() {
        return bakingTemperature;
    }

    public void setBakingTemperature(int bakingTemperature) {
        this.bakingTemperature = bakingTemperature;
    }

    public String getTypeOfPackage() {
        return typeOfPackage;
    }

    public Double getEnergeticValue() {
        return energeticValue;
    }

    public void setEnergeticValue(Double energeticValue) {
        this.energeticValue = energeticValue;
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
}
