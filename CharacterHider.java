public abstract class CharacterHider {
    public static void hideLastCharacter() {
        String input = GeneralUtilities.getNoBlankStringInput(
                "Insert a phrase to see it without the last character: ");
        System.out.println(input.substring(0, input.length()-1));

    }
}
