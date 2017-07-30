package swets_as_goods.components;

import java.math.BigDecimal;

public class ChocolateWhite extends AbstractComponentForSweet {

    //Imitation of some specific production method which is immanent for every white chocolate
    @Override
    public String technologicalCardTodo() {
        return "During the manufacturing process, the dark-colored solids of the cocoa bean are separated from its " +
                "fatty content, as with milk, semi-sweet, and dark chocolate. But, unlike those other chocolate types, " +
                "the cocoa solids are not recombined. As a result, this fat, cocoa butter, is the only cacao ingredient" +
                " in white chocolate. Because it contains no cocoa solids, white chocolate contains only trace amounts " +
                "of the stimulants theobromine and caffeine, while lacking the antioxidant properties or many " +
                "characterizing ingredients of chocolate, such as thiamine, riboflavin, and phenylethylamine. " +
                "Often, the cocoa butter is deodorized to remove its strong flavor. " +
                "If prime pressed cocoa butter is used, it has natural anti-oxidant (vitamin E), " +
                "but if deodorized it has none, as the deodorizing is a steam stripping step, often at 180 °C (356 °F).";
    }
}
