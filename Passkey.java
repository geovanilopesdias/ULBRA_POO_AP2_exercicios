import java.util.ArrayList;

public abstract class Passkey {

    public static void drawNumericPasskey(){
        System.out.println("Passkey generator");
        System.out.println("\tThe system (iteratively) requires for numeric passkeys from 5 to 10 digits!");
        int input = 0;
        do {
            input = GeneralUtilities.getIntegerInput("Insert the needed size of the password: ");
        } while (input < 5 || input > 10);

        ArrayList<String> values = new ArrayList<>();
        for (int i = 0; i < input; i++)
            values.add(String.valueOf(GeneralUtilities.randomInteger(0, 9)));

        StringBuilder sb = new StringBuilder();
        for (String s : values)
            sb.append(s);
        System.out.println(sb.toString());
    }

}
