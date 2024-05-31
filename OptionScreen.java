import java.util.Scanner;

public abstract class OptionScreen {
    public static void showMenu(){
        Scanner t = new Scanner(System.in);
        int option;
        System.out.println("Geovani\'s AP2.");
        System.out.println("Select the exercise you want to check:");
        System.out.println("\t1: Dice drawing simulator");
        System.out.println("\t2: Item Price Re-setter");
        System.out.println("\t3: Random Passkey Generator");
        System.out.println("\t4: Phrase inverter");
        System.out.println("\t5: Unsuitable Content Detector");
        System.out.println("\t6: Last character hider");
        System.out.println("\t7: Power calculator");
        System.out.println("\t8: Angle unity converter");
        System.out.println("----------------------------------------------------");
        System.out.println("Warning: any other number will shut the script down!");
        System.out.println("----------------------------------------------------");
        System.out.print("\t\tYour option: ");

        try{option = t.nextInt();}
        catch (NumberFormatException nfe) {option = 0;}
        switch(option) {
            case 1:
                Dice.rollThriceSixSideDiceAndSum();
                break;
            case 2:
                PriceReSetter.reSetPrice();
                break;
            case 3:
                Passkey.drawNumericPasskey();
                break;
            case 4:
                PhraseTrimmerInverter.transformPhrase();
                break;
            case 5:
                ContentDetector.detectUnsuitableContent();
                break;
            case 6:
                CharacterHider.hideLastCharacter();
                break;
            case 7:
                Calculator.getPower();
                break;
            case 8:
                Calculator.convertRadToDeg();
                break;
            default:
                ;
        }

    }
}
