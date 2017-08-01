package swets_as_goods.factory_patern;

import swets_as_goods.Baking;
import swets_as_goods.SugarBasedSweet;
import swets_as_goods.candy_implementations.CandyWithWrapper;
import swets_as_goods.candy_implementations.CookiesInAPack;
import swets_as_goods.candy_implementations.PresentForKids;

import java.util.ArrayList;

public abstract class PresentFactory {
    public static PresentForKids makeBigPresent(){
        PresentForKids bigPresent;
        ArrayList<CookiesInAPack> cookies=new ArrayList<>();
        cookies.add(BakingFactory.makeMariaCookies());
        cookies.add(BakingFactory.makeMariaCookies());
        ArrayList<CandyWithWrapper> candies=new ArrayList<>();
        candies.add(SweetsFactory.makeMooMoo());
        candies.add(SweetsFactory.makeMooMoo());
        candies.add(SweetsFactory.makeBibosha());
        candies.add(SweetsFactory.makeMooMoo());
        candies.add(SweetsFactory.makeZebra());
        candies.add(SweetsFactory.makeBibosha());
        bigPresent=new PresentForKids("Big present",cookies,candies);
        return bigPresent;
    }

    public static PresentForKids makeSmallPresent(){
        PresentForKids smallPresent;
        ArrayList<CandyWithWrapper> candies=new ArrayList<>();
        candies.add(SweetsFactory.makeMooMoo());
        candies.add(SweetsFactory.makeZebra());
        candies.add(SweetsFactory.makeBibosha());
        smallPresent=new PresentForKids("Big present",null,candies);
        return smallPresent;
    }
}
