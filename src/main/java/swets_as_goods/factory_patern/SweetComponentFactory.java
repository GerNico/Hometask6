package swets_as_goods.factory_patern;

import swets_as_goods.components.Caramel;
import swets_as_goods.components.ChocolateBlack;
import swets_as_goods.components.ChocolateWhite;

import java.math.BigDecimal;

class SweetComponentFactory {

    public Caramel makeCaramelSelia() {
        Caramel caramelSample = new Caramel();
        caramelSample.technologicalCardTodo();
        caramelSample.setComponentName("Карамель Житомирська");
        caramelSample.setComponentProducer("Житомирська кондитерська фабрика \n " +
                "вул. Щорса, 67,м. Житомир, 10003, Україна");
        caramelSample.setKkaloryesPer100Grammes(103.6);
        caramelSample.setPricePerKilo(28.52);
        return caramelSample;
    }

    public ChocolateBlack makeChocolateBlackSample() {
        ChocolateBlack chocolateBlackSample = new ChocolateBlack();
        chocolateBlackSample.technologicalCardTodo();
        chocolateBlackSample.setComponentName("Чорний шоколад Roshen");
        chocolateBlackSample.setComponentProducer("Кондитерська фабрика Карла Маркса \n " +
                "проспект Науки, 1, Київ, Україна");
        chocolateBlackSample.setKkaloryesPer100Grammes(129.24);
        chocolateBlackSample.setPricePerKilo(68.47);
        return chocolateBlackSample;
    }

    public ChocolateWhite makeChocolateWhiteSeria() {
        ChocolateWhite chocolateWhiteSample = new ChocolateWhite();
        chocolateWhiteSample.technologicalCardTodo();
        chocolateWhiteSample.setComponentName("Білий шоколад Roshen");
        chocolateWhiteSample.setComponentProducer("Кондитерська фабрика Карла Маркса \n " +
                "проспект Науки, 1, Київ, Україна");
        chocolateWhiteSample.setKkaloryesPer100Grammes(162.32);
        chocolateWhiteSample.setPricePerKilo(48.3);
        return chocolateWhiteSample;
    }

}
