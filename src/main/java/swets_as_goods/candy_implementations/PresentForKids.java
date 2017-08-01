package swets_as_goods.candy_implementations;

import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;

public class PresentForKids {
    String name;
    List<CookiesInAPack> cookies;
    List<CandyWithWrapper> candies;

    public String getName() {
        return name;
    }

    public List<CookiesInAPack> getCookies() {
        return cookies;
    }

    public List<CandyWithWrapper> getCandies() {
        return candies;
    }

    public String getAllWrappers() {
        StringJoiner stringJoiner = new StringJoiner("\n");
        int i = 1;
        if (this.candies != null) {
            for (CandyWithWrapper s : this.candies) {
                stringJoiner.add(i + "). " + s.getName());
                i++;
            }
        }
        if (this.cookies != null) {
            for (CookiesInAPack s : this.cookies) {
                stringJoiner.add(i + "). " + s.getName());
                i++;
            }
        }
        return stringJoiner.toString();
    }

    public String orderWrappersByEnergyValue() {
        StringJoiner stringJoiner = new StringJoiner("\n");
        int i = 1;
        if (this.candies != null) {
            Collections.sort(this.candies);
            for (CandyWithWrapper s : this.candies) {
                stringJoiner.add(i + "). " + s.getName() + " E=" + String.format("%.2f", s.getEnergeticValue().floatValue()) + " kal");
                i++;
            }
        }
        if (this.cookies != null) {
            Collections.sort(this.cookies);
            for (CookiesInAPack s : this.cookies) {
                stringJoiner.add(i + "). " + s.getName() + " E=" + String.format("%.2f", s.getEnergeticValue().floatValue()) + " kal");
                i++;
            }
        }
        return stringJoiner.toString();
    }

    public String wrappersOfDeictic(Double limit) {
        StringJoiner stringJoiner = new StringJoiner("\n");
        int i = 1;
        stringJoiner.add("candies fitting limit "+limit+" kkal:");
        if (this.candies != null) {
            Collections.sort(this.candies);
            for (CandyWithWrapper s : this.candies) {
                if (s.getEnergeticValue() < limit) {
                    stringJoiner.add(i + ". " + s.getName() +
                            " E=" + String.format("%.2f", s.getEnergeticValue().floatValue()) + " kal");
                }
                i++;
            }
        }
        return stringJoiner.toString();
    }

    public Double getTotalWeight() {
        Double weight = 0.0;
        if (this.candies != null) {
            for (CandyWithWrapper s : this.candies) {
                weight += s.getCandyWeightGrammes();
            }
        }
        if (this.cookies != null) {
            for (CookiesInAPack s : this.cookies) {
                weight += s.getPackageSizeGrammes();
            }
        }
        return weight;
    }

    public PresentForKids(String name, List<CookiesInAPack> cookies, List<CandyWithWrapper> candies) {
        this.name = name;
        this.cookies = cookies;
        this.candies = candies;
    }
}
