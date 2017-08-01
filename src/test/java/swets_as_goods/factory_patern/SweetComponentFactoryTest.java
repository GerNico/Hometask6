package swets_as_goods.factory_patern;

import com.google.gson.Gson;
import org.junit.Test;
import swets_as_goods.JSON.CandyDTO;

import java.io.FileNotFoundException;
import java.io.FileReader;

import static org.junit.Assert.*;

public class SweetComponentFactoryTest {
    @Test
    public void testFactory() throws FileNotFoundException {
        Gson gson = new Gson();
        CandyDTO parsed = gson.fromJson(new FileReader("src/main/resources/MooMoo.json"), CandyDTO.class);
        CandyDTO expected = new CandyDTO();
        expected.setName("Корівка");
        expected.setWrapper("Крута корівка + ше шото там");
        expected.setCandyWeightGrammes(17.2);
        expected.setCaramelPart(0.756);
        expected.setChocolateBlackPart(0.0);
        expected.setChocolateWhitePart(0.241);
        expected.setContentDescription("цукор, молоко незбиране згущене з цукром, патока, жир рослинний, кукурудзяні" +
                        " кульки глазуровані (крупа кукурудзяна, борошно пшеничне 1/ґ, цукор, патока, сіль кухонна)," +
                        " сухе знежирене молоко, сіль кухонна, ароматизатор пряжене молоко.");
        expected.setProducerRequisites("вул. Щорса, 67,\n м. Житомир,\n 10003, Україна");
        expected.setStorageTimeInDays(200);
        assertEquals(parsed,expected);
    }
}