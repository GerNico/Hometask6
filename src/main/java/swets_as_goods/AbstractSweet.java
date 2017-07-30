package swets_as_goods;

import java.time.LocalDate;

public abstract class AbstractSweet {
    private String producerRequisites;
    private String contentDescription;

    private LocalDate productionDate;
    private int storageTimeInDays;

    private String technicalCard;

    public String getTechnicalCard() {
        return technicalCard;
    }

    public void setTechnicalCard(String technicalCard) {
        this.technicalCard = technicalCard;
    }

    public LocalDate getExpirationDate() {
        return this.productionDate.plusDays(this.storageTimeInDays);
    }

    public String getProducerRequisites() {
        return producerRequisites;
    }

    public void setProducerRequisites(String producerRequisites) {
        this.producerRequisites = producerRequisites;
    }

    public String getContentDescription() {
        return contentDescription;
    }

    public void setContentDescription(String contentDescription) {
        this.contentDescription = contentDescription;
    }

    public LocalDate getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(LocalDate productionDate) {
        this.productionDate = productionDate;
    }

    public int getStorageTimeInDays() {
        return storageTimeInDays;
    }

    public void setStorageTimeInDays(int storageTimeInDays) {
        this.storageTimeInDays = storageTimeInDays;
    }

    public boolean isTimeLimitSpent() {
        return LocalDate.now().isBefore(this.getExpirationDate());
    }

}
