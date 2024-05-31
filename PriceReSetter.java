import static java.lang.Math.round;

public abstract class PriceReSetter {
    private static final double REPRICING = .12;

    public static void reSetPrice(){
        System.out.println("Price re-settler: input a price to be adjusted by " + REPRICING*100 + "%");
        System.out.println("\t\tBeware:");
        System.out.println("\t\t\t> to input 0 will shut the program down.");
        System.out.println("\t\t\t> the program iteratively asks for a value while letters or nothing is passed.");
        double input = GeneralUtilities.getDoubleInput("Insert the price to be re-set: ");

        if (input != 0)
            System.out.println("The new price is: " + round(input * (1 + REPRICING)));
        else
            System.out.println("A zero price was passed; the program was shut down.");
    }
}
