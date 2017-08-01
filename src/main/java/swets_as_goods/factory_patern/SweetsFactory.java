package swets_as_goods.factory_patern;

import com.google.gson.Gson;
import swets_as_goods.ContentOfSweet;
import swets_as_goods.JSON.CandyDTO;
import swets_as_goods.JSON.DescriptionNotFound;
import swets_as_goods.candy_implementations.CandyWithWrapper;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.LocalDate;

public abstract class SweetsFactory {
    private static Gson gson = new Gson();

    public static CandyWithWrapper makeMooMoo() {
        try {
            CandyDTO parsed = gson.fromJson(new FileReader("src/main/resources/MooMoo.json"), CandyDTO.class);

            CandyWithWrapper candyMooMoo = new CandyWithWrapper();
            candyMooMoo.setName(parsed.getName());
            candyMooMoo.setWrapper(parsed.getWrapper());
            candyMooMoo.setCandyWeightGrammes(parsed.getCandyWeightGrammes());
            candyMooMoo.setContentDescription(parsed.getContentDescription());
            ContentOfSweet moomooContent = new ContentOfSweet();
            if (parsed.getCaramelPart() > 0.001) {
                moomooContent.addComponent(SweetComponentFactory.makeCaramelSelia(), parsed.getCaramelPart());
            }
            if (parsed.getChocolateWhitePart() > 0.001) {
                moomooContent.addComponent(SweetComponentFactory.makeChocolateWhiteSeria(), parsed.getChocolateWhitePart());
            }
            if (parsed.getChocolateBlackPart() > 0.001) {
                moomooContent.addComponent(SweetComponentFactory.makeChocolateBlackSample(), parsed.getChocolateBlackPart());
            }
            candyMooMoo.setContentOfSweet(moomooContent);
            candyMooMoo.setProductionDate(LocalDate.now());
            candyMooMoo.setStorageTimeInDays(parsed.getStorageTimeInDays());
            candyMooMoo.setProducerRequisites(parsed.getProducerRequisites());
            return candyMooMoo;
        } catch (FileNotFoundException e) {
            throw new DescriptionNotFound("There no MooMoo descriptions");
        }
    }

    public static CandyWithWrapper makeBibosha() {
        try {
            CandyDTO parsed = gson.fromJson(new FileReader("src/main/resources/Bibosha.json"), CandyDTO.class);

            CandyWithWrapper candyBibosha = new CandyWithWrapper();
            candyBibosha.setName(parsed.getName());
            candyBibosha.setWrapper(parsed.getWrapper());
            candyBibosha.setCandyWeightGrammes(parsed.getCandyWeightGrammes());
            candyBibosha.setContentDescription(parsed.getContentDescription());
            ContentOfSweet biboshaContent = new ContentOfSweet();
            if (parsed.getCaramelPart() > 0.001) {
                biboshaContent.addComponent(SweetComponentFactory.makeCaramelSelia(), parsed.getCaramelPart());
            }
            if (parsed.getChocolateWhitePart() > 0.001) {
                biboshaContent.addComponent(SweetComponentFactory.makeChocolateWhiteSeria(), parsed.getChocolateWhitePart());
            }
            if (parsed.getChocolateBlackPart() > 0.001) {
                biboshaContent.addComponent(SweetComponentFactory.makeChocolateBlackSample(), parsed.getChocolateBlackPart());
            }
            candyBibosha.setContentOfSweet(biboshaContent);
            candyBibosha.setProductionDate(LocalDate.now());
            candyBibosha.setStorageTimeInDays(parsed.getStorageTimeInDays());
            candyBibosha.setProducerRequisites(parsed.getProducerRequisites());
            return candyBibosha;
        } catch (FileNotFoundException e) {
            throw new DescriptionNotFound("There no Bibosha descriptions");
        }
    }

    public static CandyWithWrapper makeZebra() {
        try {
            CandyDTO parsed = gson.fromJson(new FileReader("src/main/resources/Zebra.json"), CandyDTO.class);

            CandyWithWrapper candyZebra = new CandyWithWrapper();
            candyZebra.setName(parsed.getName());
            candyZebra.setWrapper(parsed.getWrapper());
            candyZebra.setCandyWeightGrammes(parsed.getCandyWeightGrammes());
            candyZebra.setContentDescription(parsed.getContentDescription());
            ContentOfSweet biboshaContent = new ContentOfSweet();
            if (parsed.getCaramelPart() > 0.001) {
                biboshaContent.addComponent(SweetComponentFactory.makeCaramelSelia(), parsed.getCaramelPart());
            }
            if (parsed.getChocolateWhitePart() > 0.001) {
                biboshaContent.addComponent(SweetComponentFactory.makeChocolateWhiteSeria(), parsed.getChocolateWhitePart());
            }
            if (parsed.getChocolateBlackPart() > 0.001) {
                biboshaContent.addComponent(SweetComponentFactory.makeChocolateBlackSample(), parsed.getChocolateBlackPart());
            }
            candyZebra.setContentOfSweet(biboshaContent);
            candyZebra.setProductionDate(LocalDate.now());
            candyZebra.setStorageTimeInDays(parsed.getStorageTimeInDays());
            candyZebra.setProducerRequisites(parsed.getProducerRequisites());
            return candyZebra;
        } catch (FileNotFoundException e) {
            throw new DescriptionNotFound("There no Zebra descriptions");
        }
    }
}
