import java.util.ArrayList;

public abstract class PhraseTrimmerInverter {

    public static void transformPhrase(){
        String phrase = GeneralUtilities.getNoBlankStringInput(
                "Insert a phrase to trim out its spaces and inverte it: ");

        ArrayList<Character> trimmedPhrase = new ArrayList<>();
        for (char digit: phrase.toCharArray())
            if (digit != ' ') trimmedPhrase.add(digit);

        StringBuilder invertedPhrase = new StringBuilder();
        for (int i = trimmedPhrase.size() - 1; i >= 0; i--)
            invertedPhrase.append(trimmedPhrase.get(i));
        System.out.println("Your phrase transformed: " + invertedPhrase.toString());
    }
}
