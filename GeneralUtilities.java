import java.util.Scanner;

public class GeneralUtilities {
    /**
     * Checks if a string is a number; from Baeldung.com.
     * */
    public static boolean isNumeric(String sv) {
        if (sv == null) return false;
        try {float fv = Float.parseFloat(sv);}
        catch (NumberFormatException nfe) {return false;}
        return true;
    }

    /**
     * Asks for an integer value and returns it;
     * it iterates in the terminal until the input is valid
     * (not blank or alphabetical).
     * @param msg The message to ask for the value.
     * @return the input value.
     */
    public static int getIntegerInput(String msg){
        Scanner t = new Scanner(System.in);
        String input;
        do {
            System.out.print(msg);
            input = t.nextLine();
        } while (input.isBlank() || !GeneralUtilities.isNumeric(input));
        return Integer.parseInt(input);
    }

    /**
     * Asks for a real number and returns it;
     * it iterates in the terminal until the input is valid
     * (not blank or alphabetical).
     * @param msg The message to ask for the value.
     * @return the input value.
     */
    public static double getDoubleInput(String msg){
        Scanner t = new Scanner(System.in);
        String input;
        do {
            System.out.print(msg);
            input = t.nextLine();
        } while (input.isBlank() || !GeneralUtilities.isNumeric(input));
        return Double.parseDouble(input);
    }

    /**
     * Asks for any no-blank String and returns it;
     * it iterates in the terminal until the input is valid.
     * @param msg The message to ask for the value.
     * @return the input text.
     */
    public static String getNoBlankStringInput(String msg){
        Scanner t = new Scanner(System.in);
        String input;
        do {
            System.out.print(msg);
            input = t.nextLine();
        } while (input.isBlank());
        return input;
    }

    /**
     * Based on https://stackoverflow.com/a/363732.
     */
    public static int randomInteger(int min, int max){
        return min + (int)(Math.random() * ((max - min) + 1));
    }

    public static boolean isWordsInPhrase(String[] filter, String phrase){
        String[] phraseSplitted = phrase.split(" ");
        for(String term: filter)
            for (String word: phraseSplitted)
                if (term.equalsIgnoreCase(word))
                    return true;

        return false;
    }
}