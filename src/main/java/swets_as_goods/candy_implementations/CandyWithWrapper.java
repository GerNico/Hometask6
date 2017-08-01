package swets_as_goods.candy_implementations;

import swets_as_goods.SugarBasedSweet;

public class CandyWithWrapper extends SugarBasedSweet implements Comparable<CandyWithWrapper> {
String name;
String wrapper;

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


    @Override
    public int compareTo(CandyWithWrapper other) {
return Double.compare(this.getEnergeticValue(),other.getEnergeticValue());
    }
}
