public abstract class ContentDetector {
    private static final String[] UNSUITABLE_CASES = {"sexo", "sexual"};

    public static void detectUnsuitableContent(){
        String input = GeneralUtilities.getNoBlankStringInput(
                "Insert a phrase to search for unsuitable content in it: ");
        if (GeneralUtilities.isWordsInPhrase(UNSUITABLE_CASES, input))
            System.out.println("Some unsuitable content was detect!");
        else
            System.out.println("No unsuitable content was detect!");
    }
}
