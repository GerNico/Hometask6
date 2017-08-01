package swets_as_goods.candy_implementations;

import org.junit.Test;
import swets_as_goods.factory_patern.SweetsFactory;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.*;

public class PresentForKidsTest {

    @Test
    public void testOfComparability() {
        ArrayList<CandyWithWrapper> initialCandiesList = new ArrayList<>();
        initialCandiesList.add(SweetsFactory.makeMooMoo());
        initialCandiesList.add(SweetsFactory.makeMooMoo());
        initialCandiesList.add(SweetsFactory.makeBibosha());
        initialCandiesList.add(SweetsFactory.makeMooMoo());
        initialCandiesList.add(SweetsFactory.makeZebra());
        initialCandiesList.add(SweetsFactory.makeBibosha());
        ArrayList<CandyWithWrapper> expected = new ArrayList<>();
        expected.add(initialCandiesList.get(0));
        expected.add(initialCandiesList.get(1));
        expected.add(initialCandiesList.get(3));
        expected.add(initialCandiesList.get(2));
        expected.add(initialCandiesList.get(5));
        expected.add(initialCandiesList.get(4));
        Collections.sort(initialCandiesList);
        for (int i = 0; i < initialCandiesList.size(); i++) {
            assertEquals(initialCandiesList.get(i), expected.get(i));
        }
    }
}