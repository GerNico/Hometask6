package swets_as_goods.components;

public class Caramel extends AbstractComponentForSweet {
    //Imitation of some specific production method which is immanent for every caramel
    @Override
    public String technologicalCardTodo() {
        return "The sugar and glucose are heated separately to reach 130 °C (270 °F), " +
                "the cream and butter are then added which cools the mixture. " +
                "The mixture is then stirred and reheated until it reaches 120 °C (250 °F). " +
                "Upon completion of cooking, vanilla or any additional flavorings and salt are added. " +
                "Adding the vanilla or flavorings earlier would result in their burning off at the high temperatures. " +
                "Adding salt earlier in the process would result in inverting the sugars as they cooked." + "\n";
    }
}

