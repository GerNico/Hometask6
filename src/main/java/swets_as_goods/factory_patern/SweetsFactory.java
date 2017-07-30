package swets_as_goods.factory_patern;

import swets_as_goods.ContentOfSweet;
import swets_as_goods.candy_implementations.CandyMooMoo;

import java.time.LocalDate;

public class SweetsFactory {
    public CandyMooMoo makeMooMoo(){
        CandyMooMoo candyMooMoo=new CandyMooMoo();
        candyMooMoo.setName("Корівка");
        candyMooMoo.setWrapper("Крута корівка + ше шото там");
        candyMooMoo.setCandyWeightGrammes(17.2);
        candyMooMoo.setContentDescription("цукор, молоко незбиране згущене з цукром, патока, жир рослинний, " +
                "кукурудзяні кульки глазуровані (крупа кукурудзяна, борошно пшеничне 1/ґ, цукор, патока, " +
                "сіль кухонна), сухе знежирене молоко, сіль кухонна, ароматизатор пряжене молоко. " +
                "Можуть містити незначну кількість ядер бобів арахісу. Містить: молочні продукти, пшеницю, " +
                "продукти переробки сої.");
        ContentOfSweet moomooContent=new ContentOfSweet();
        SweetComponentFactory componentFactory=new SweetComponentFactory();
        moomooContent.addComponent(componentFactory.makeCaramelSelia(),0.756);
        moomooContent.addComponent(componentFactory.makeChocolateWhiteSeria(),0.241);
        candyMooMoo.setContentOfSweet(moomooContent);
        candyMooMoo.setProductionDate(LocalDate.now());
        candyMooMoo.setStorageTimeInDays(200);
        candyMooMoo.setPricePerKilo(96.80);
        candyMooMoo.setProducerRequisites("вул. Щорса, 67,\n м. Житомир,\n 10003, Україна");
        return candyMooMoo;
    }

    public CandyMooMoo makeBibosha(){
        CandyMooMoo candyMooMoo=new CandyMooMoo();
        candyMooMoo.setName("Корівка");
        candyMooMoo.setWrapper("Крута корівка + ше шото там");
        candyMooMoo.setCandyWeightGrammes(17.2);
        candyMooMoo.setContentDescription("цукор, молоко незбиране згущене з цукром, патока, жир рослинний, " +
                "кукурудзяні кульки глазуровані (крупа кукурудзяна, борошно пшеничне 1/ґ, цукор, патока, " +
                "сіль кухонна), сухе знежирене молоко, сіль кухонна, ароматизатор пряжене молоко. " +
                "Можуть містити незначну кількість ядер бобів арахісу. Містить: молочні продукти, пшеницю, " +
                "продукти переробки сої.");
        ContentOfSweet moomooContent=new ContentOfSweet();
        SweetComponentFactory componentFactory=new SweetComponentFactory();
        moomooContent.addComponent(componentFactory.makeCaramelSelia(),0.756);
        moomooContent.addComponent(componentFactory.makeChocolateWhiteSeria(),0.241);
        candyMooMoo.setContentOfSweet(moomooContent);
        return candyMooMoo;
    }
}
