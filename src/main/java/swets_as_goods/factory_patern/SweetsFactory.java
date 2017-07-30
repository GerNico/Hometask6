package swets_as_goods.factory_patern;

import swets_as_goods.ContentOfSweet;
import swets_as_goods.candy_implementations.CandyWithWrapper;

import java.time.LocalDate;

public class SweetsFactory {
    public CandyWithWrapper makeMooMoo(){
        CandyWithWrapper candyMooMoo=new CandyWithWrapper();
        candyMooMoo.setName("Корівка");
        candyMooMoo.setWrapper("Крута корівка + ше шото там");
        candyMooMoo.setCandyWeightGrammes(17.2);
        candyMooMoo.setContentDescription("цукор, молоко незбиране згущене з цукром, патока, жир рослинний, " +
                "кукурудзяні кульки глазуровані (крупа кукурудзяна, борошно пшеничне 1/ґ, цукор, патока, " +
                "сіль кухонна), сухе знежирене молоко, сіль кухонна, ароматизатор пряжене молоко. ");
        ContentOfSweet moomooContent=new ContentOfSweet();
        SweetComponentFactory componentFactory=new SweetComponentFactory();
        moomooContent.addComponent(componentFactory.makeCaramelSelia(),0.756);
        moomooContent.addComponent(componentFactory.makeChocolateWhiteSeria(),0.241);
        candyMooMoo.setContentOfSweet(moomooContent);
        candyMooMoo.setProductionDate(LocalDate.now());
        candyMooMoo.setStorageTimeInDays(200);
        candyMooMoo.setProducerRequisites("вул. Щорса, 67,\n м. Житомир,\n 10003, Україна");
        return candyMooMoo;
    }

    public CandyWithWrapper makeBibosha(){
        CandyWithWrapper candyBibosha=new CandyWithWrapper();
        candyBibosha.setName("Бібоша");
        candyBibosha.setWrapper("Буба бібо Бібоша!");
        candyBibosha.setCandyWeightGrammes(14.5);
        candyBibosha.setContentDescription("цукор, жир рослинний, кондитерська глазур, борошно пшеничне вищого сорту, " +
                "какао-порошок, сухе знежирене молоко, крохмаль кукурудзяний, ароматизатор ваніль, " +
                "емульгатор лецитин соєвий, сіль кухонна, розпушувачі, яєчний порошок, регулятор кислотності " +
                "кислота молочна. Містять продукти переробки сої, молочні та яєчні продукти, пшеницю.");
        ContentOfSweet biboshaContent=new ContentOfSweet();
        SweetComponentFactory componentFactory=new SweetComponentFactory();
        biboshaContent.addComponent(componentFactory.makeCaramelSelia(),0.756);
        biboshaContent.addComponent(componentFactory.makeChocolateBlackSample(),0.241);
        candyBibosha.setContentOfSweet(biboshaContent);
        return candyBibosha;
    }
}
