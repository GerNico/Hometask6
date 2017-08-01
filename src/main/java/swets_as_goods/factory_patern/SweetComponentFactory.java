package swets_as_goods.factory_patern;

import com.google.gson.Gson;
import swets_as_goods.JSON.ComponentDTO;
import swets_as_goods.JSON.DescriptionNotFound;
import swets_as_goods.components.Caramel;
import swets_as_goods.components.ChocolateBlack;
import swets_as_goods.components.ChocolateWhite;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.math.BigDecimal;

class SweetComponentFactory {
    private Gson gson = new Gson();

    public Caramel makeCaramelSelia() {
        try {
            ComponentDTO parsed = gson.fromJson(new FileReader("src/main/resources/Caramel.json"), ComponentDTO.class);

            Caramel caramelSample = new Caramel();
            caramelSample.technologicalCardTodo();
            caramelSample.setComponentName(parsed.getName());
            caramelSample.setComponentProducer(parsed.getProducer());
            caramelSample.setKkaloryesPer100Grammes(parsed.getKkaloryesPer100Grammes());
            caramelSample.setPricePerKilo(parsed.getPricePerKilo());
            return caramelSample;

        } catch (FileNotFoundException e) {
            throw new DescriptionNotFound("There no caramel descriptions");
        }
    }

    public ChocolateBlack makeChocolateBlackSample() {
        try {
            ComponentDTO parsed = gson.fromJson(new FileReader("src/main/resources/BlackChoco.json"), ComponentDTO.class);

            ChocolateBlack chocolateBlackSample = new ChocolateBlack();
        chocolateBlackSample.technologicalCardTodo();
        chocolateBlackSample.setComponentName(parsed.getName());
        chocolateBlackSample.setComponentProducer(parsed.getProducer());
        chocolateBlackSample.setKkaloryesPer100Grammes(parsed.getKkaloryesPer100Grammes());
        chocolateBlackSample.setPricePerKilo(parsed.getPricePerKilo());
        return chocolateBlackSample;
        } catch (FileNotFoundException e) {
            throw new DescriptionNotFound("There no black chocolate descriptions");
        }
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
