package swets_as_goods;

import swets_as_goods.components.InterfaceSweetComponent;

import java.util.ArrayList;
import java.util.List;

public class ContentOfSweet {
    private List<InterfaceSweetComponent> components;
    private List<Double> percentOfComponent;

    public ContentOfSweet() {
        components = new ArrayList<>();
        percentOfComponent = new ArrayList<>();
    }

    public List<InterfaceSweetComponent> getComponents() {
        return components;
    }

    public List<Double> getPercentOfComponent() {
        return percentOfComponent;
    }

    public void addComponent(InterfaceSweetComponent component, Double percent) {
        if (percent > 1 || percent <= 0) throw new CandyException("stupid data entered");
        int sumOfParts = 0;
        for (Double d : percentOfComponent) {
            sumOfParts += d;
        }
        if (sumOfParts > 1) throw new CandyException("Overloaded Candy");
        else {
            this.components.add(component);
            this.percentOfComponent.add(percent);
        }
    }

    Double getEnergeticValue() {
        Double value = 0D;
        for (int i = 0; i < this.percentOfComponent.size(); i++) {
            value += this.percentOfComponent.get(i) * this.components.get(i).getKKaloryesPer100Grammes();
        }
        return value;
    }


    Double getTotalComponentPrice() {
        Double value = 0D;
        for (int i = 0; i < this.percentOfComponent.size(); i++) {
            value += this.percentOfComponent.get(i) * this.components.get(i).getPricePerKilo()/1000;
        }
        return value;
    }


    boolean isNormallyRepresented() {
        Double value = 0D;
        for (int i = 0; i < this.percentOfComponent.size(); i++) {
            value += this.percentOfComponent.get(i);
        }
        if (value > 0.95) return true;
        else return false;
    }
}
