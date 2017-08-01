package swets_as_goods;

import swets_as_goods.candy_implementations.PresentForKids;
import swets_as_goods.factory_patern.PresentFactory;

import java.util.Scanner;

public class Launcher {
    static void launch() {
        System.out.println("Greetings this program helps to assemble present for child\n" +
                "there are two presents big one and small one, please select (big/small)");
        Scanner scanner = new Scanner(System.in);
        PresentForKids present = null;
        while (true) {
            String answer = scanner.nextLine();
            if (answer.equals("big")) {
                present = PresentFactory.makeBigPresent();
                break;
            }
            if (answer.equals("small")) {
                present = PresentFactory.makeBigPresent();
                break;
            }
        }
        if (present != null) {
            System.out.println("Content without ordering:");
            System.out.println(present.getAllWrappers());
            System.out.println("Content with ordering by energetic value:");
            System.out.println(present.orderWrappersByEnergyValue());
            System.out.print("The weight is: ");
            System.out.println(present.getTotalWeight());

        }
    }

    public static void main(String[] args) {
        launch();
    }
}
