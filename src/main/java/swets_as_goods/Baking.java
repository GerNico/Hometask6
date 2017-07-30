package swets_as_goods;

public abstract class Baking extends AbstractSweet implements Comparable<Baking> {
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

    @Override
    public int compareTo(Baking other) {
        return Double.compare(this.energeticValue, other.energeticValue);
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
