import java.util.concurrent.ThreadLocalRandom;

public abstract class Dice {
    private static final int HIGHER_SIDE = 6;

    private static int roll(int higherSide){
        return ThreadLocalRandom.current().nextInt(1, higherSide + 1);
    }

    public static void rollThriceSixSideDiceAndSum(){
        int sum = 0;
        System.out.println("A dice was thrown three times:");
        for (int i = 1, drawing = roll(HIGHER_SIDE); i <= 3; drawing = roll(HIGHER_SIDE), i++) {
            System.out.println("\t" + i + "º time: " + drawing);
            sum += drawing;
        }
        System.out.println("The sum of the drew values is: "+sum);
    }
}
