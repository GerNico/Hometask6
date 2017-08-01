package swets_as_goods.factory_patern;

import com.google.gson.Gson;
import swets_as_goods.JSON.ComponentDTO;
import swets_as_goods.JSON.DescriptionNotFound;
import swets_as_goods.components.Caramel;
import swets_as_goods.components.ChocolateBlack;
import swets_as_goods.components.ChocolateWhite;

import java.io.FileNotFoundException;
import java.io.FileReader;

public abstract class SweetComponentFactory {
    private static Gson gson = new Gson();

    static Caramel makeCaramelSelia() {
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

    static ChocolateBlack makeChocolateBlackSample() {
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

    static ChocolateWhite makeChocolateWhiteSeria() {
        try {
            ComponentDTO parsed = gson.fromJson(new FileReader("src/main/resources/BlackChoco.json"), ComponentDTO.class);

            ChocolateWhite chocolateWhiteSample = new ChocolateWhite();
            chocolateWhiteSample.technologicalCardTodo();
            chocolateWhiteSample.setComponentName(parsed.getName());
            chocolateWhiteSample.setComponentProducer(parsed.getProducer());
            chocolateWhiteSample.setKkaloryesPer100Grammes(parsed.getKkaloryesPer100Grammes());
            chocolateWhiteSample.setPricePerKilo(parsed.getPricePerKilo());
            return chocolateWhiteSample;
        } catch (FileNotFoundException e) {
            throw new DescriptionNotFound("There no white chocolate descriptions");
        }
    }

}
