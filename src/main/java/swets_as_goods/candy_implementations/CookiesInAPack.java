package swets_as_goods.candy_implementations;

import swets_as_goods.AbstractSweet;
import swets_as_goods.Baking;

public class CookiesInAPack extends Baking{
    private String name;
    private int containPieces;
    private String wrapper;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getContainPieces() {
        return containPieces;
    }

    public void setContainPieces(int containPieces) {
        this.containPieces = containPieces;
    }

    public String getWrapper() {
        return wrapper;
    }

    public void setWrapper(String wrapper) {
        this.wrapper = wrapper;
    }
}
