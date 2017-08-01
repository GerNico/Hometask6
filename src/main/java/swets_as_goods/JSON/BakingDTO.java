package swets_as_goods.JSON;

public class BakingDTO {
    String name;
    String wrapper;
    int containPieces;
    int bakingTemperature;
    Double energeticValue;
    String contentDescription;
     Double packageSizeGrammes;
     String producerRequisites;
     int storageTimeInDays;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWrapper() {
        return wrapper;
    }

    public void setWrapper(String wrapper) {
        this.wrapper = wrapper;
    }

    public int getContainPieces() {
        return containPieces;
    }

    public void setContainPieces(int containPieces) {
        this.containPieces = containPieces;
    }

    public int getBakingTemperature() {
        return bakingTemperature;
    }

    public void setBakingTemperature(int bakingTemperature) {
        this.bakingTemperature = bakingTemperature;
    }

    public Double getEnergeticValue() {
        return energeticValue;
    }

    public void setEnergeticValue(Double energeticValue) {
        this.energeticValue = energeticValue;
    }

    public String getContentDescription() {
        return contentDescription;
    }

    public void setContentDescription(String contentDescription) {
        this.contentDescription = contentDescription;
    }

    public Double getPackageSizeGrammes() {
        return packageSizeGrammes;
    }

    public void setPackageSizeGrammes(Double packageSizeGrammes) {
        this.packageSizeGrammes = packageSizeGrammes;
    }

    public String getProducerRequisites() {
        return producerRequisites;
    }

    public void setProducerRequisites(String producerRequisites) {
        this.producerRequisites = producerRequisites;
    }

    public int getStorageTimeInDays() {
        return storageTimeInDays;
    }

    public void setStorageTimeInDays(int storageTimeInDays) {
        this.storageTimeInDays = storageTimeInDays;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BakingDTO)) return false;

        BakingDTO bakingDTO = (BakingDTO) o;

        if (getContainPieces() != bakingDTO.getContainPieces()) return false;
        if (getBakingTemperature() != bakingDTO.getBakingTemperature()) return false;
        if (getStorageTimeInDays() != bakingDTO.getStorageTimeInDays()) return false;
        if (!getName().equals(bakingDTO.getName())) return false;
        if (getWrapper() != null ? !getWrapper().equals(bakingDTO.getWrapper()) : bakingDTO.getWrapper() != null)
            return false;
        if (!getEnergeticValue().equals(bakingDTO.getEnergeticValue())) return false;
        if (getContentDescription() != null ? !getContentDescription().equals(bakingDTO.getContentDescription()) : bakingDTO.getContentDescription() != null)
            return false;
        if (getPackageSizeGrammes() != null ? !getPackageSizeGrammes().equals(bakingDTO.getPackageSizeGrammes()) : bakingDTO.getPackageSizeGrammes() != null)
            return false;
        return getProducerRequisites().equals(bakingDTO.getProducerRequisites());
    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + (getWrapper() != null ? getWrapper().hashCode() : 0);
        result = 31 * result + getContainPieces();
        result = 31 * result + getBakingTemperature();
        result = 31 * result + getEnergeticValue().hashCode();
        result = 31 * result + (getContentDescription() != null ? getContentDescription().hashCode() : 0);
        result = 31 * result + (getPackageSizeGrammes() != null ? getPackageSizeGrammes().hashCode() : 0);
        result = 31 * result + getProducerRequisites().hashCode();
        result = 31 * result + getStorageTimeInDays();
        return result;
    }
}
