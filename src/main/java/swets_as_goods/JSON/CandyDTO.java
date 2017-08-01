package swets_as_goods.JSON;

public class CandyDTO {
    String name="Зебра";
    String wrapper="Зебра дика і пухнаста";
    Double candyWeightGrammes=15.8;
    Double caramelPart=0.0;
    Double chocolateBlackPart=0.499;
    Double chocolateWhitePart=0.499;
    String contentDescription="цукор, жир рослинний, кондитерська глазур, борошно пшеничне вищого сорту, " +
            "какао-порошок, сухе знежирене молоко, крохмаль кукурудзяний, ароматизатор ваніль, " +
            "емульгатор лецитин соєвий, сіль кухонна, розпушувачі, яєчний порошок, регулятор кислотності " +
            "кислота молочна. Містять продукти переробки сої, молочні та яєчні продукти, пшеницю.";
    String producerRequisites="вул. Щорса, 67,\n м. Житомир,\n 10003, Україна";
    int storageTimeInDays=200;

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

    public Double getCandyWeightGrammes() {
        return candyWeightGrammes;
    }

    public void setCandyWeightGrammes(Double candyWeightGrammes) {
        this.candyWeightGrammes = candyWeightGrammes;
    }

    public Double getCaramelPart() {
        return caramelPart;
    }

    public void setCaramelPart(Double caramelPart) {
        this.caramelPart = caramelPart;
    }

    public Double getChocolateBlackPart() {
        return chocolateBlackPart;
    }

    public void setChocolateBlackPart(Double chocolateBlackPart) {
        this.chocolateBlackPart = chocolateBlackPart;
    }

    public Double getChocolateWhitePart() {
        return chocolateWhitePart;
    }

    public void setChocolateWhitePart(Double chocolateWhitePart) {
        this.chocolateWhitePart = chocolateWhitePart;
    }

    public String getContentDescription() {
        return contentDescription;
    }

    public void setContentDescription(String contentDescription) {
        this.contentDescription = contentDescription;
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
        if (!(o instanceof CandyDTO)) return false;

        CandyDTO candyDTO = (CandyDTO) o;

        if (getStorageTimeInDays() != candyDTO.getStorageTimeInDays()) return false;
        if (!getName().equals(candyDTO.getName())) return false;
        if (getWrapper() != null ? !getWrapper().equals(candyDTO.getWrapper()) : candyDTO.getWrapper() != null)
            return false;
        if (!getCandyWeightGrammes().equals(candyDTO.getCandyWeightGrammes())) return false;
        if (!getCaramelPart().equals(candyDTO.getCaramelPart())) return false;
        if (!getChocolateBlackPart().equals(candyDTO.getChocolateBlackPart())) return false;
        if (!getChocolateWhitePart().equals(candyDTO.getChocolateWhitePart())) return false;
        if (getContentDescription() != null ? !getContentDescription().equals(candyDTO.getContentDescription()) : candyDTO.getContentDescription() != null)
            return false;
        return getProducerRequisites().equals(candyDTO.getProducerRequisites());
    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + (getWrapper() != null ? getWrapper().hashCode() : 0);
        result = 31 * result + getCandyWeightGrammes().hashCode();
        result = 31 * result + getCaramelPart().hashCode();
        result = 31 * result + getChocolateBlackPart().hashCode();
        result = 31 * result + getChocolateWhitePart().hashCode();
        result = 31 * result + (getContentDescription() != null ? getContentDescription().hashCode() : 0);
        result = 31 * result + getProducerRequisites().hashCode();
        result = 31 * result + getStorageTimeInDays();
        return result;
    }
}
