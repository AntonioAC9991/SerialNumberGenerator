package kata6;

import business.ToyBusiness;
import factories.ToyFactory;
import factories.regionalfactories.AmericanCarToyFactory;
import factories.regionalfactories.AmericanHelicopterToyFactory;
import factories.regionalfactories.AsianCarToyFactory;
import factories.regionalfactories.AsianHelicopterToyFactory;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        ToyFactory carToyFactory = new AmericanCarToyFactory();
        ToyFactory helicopterToyFactory = new AmericanHelicopterToyFactory();
        ToyBusiness toyBusiness = new ToyBusiness();
        toyBusiness.add("car", carToyFactory);
        toyBusiness.add("helicopter", helicopterToyFactory);
        while(true) {
            System.out.println("Write exit for exit");
            Scanner scanner = new Scanner(System.in);
            String nextLine = scanner.nextLine();
            if(nextLine.equals("exit")||nextLine.equals("Exit")||nextLine.equals("EXIT")) {
                break;
            } else if(nextLine.equals("car")) {
                toyBusiness.produceToy(nextLine);
            } else if(nextLine.equals("helicopter")) {
                toyBusiness.produceToy(nextLine);
            } else {
                System.out.println("COMMAND UNKNOWN");
            }
        }
    }
}
