public abstract class Calculator {
    public static void getPower() {
        double base = GeneralUtilities.getDoubleInput(
                "Insert a base value to get its power: ");
        double exponent = GeneralUtilities.getDoubleInput(
                "Insert its exponent: ");
        System.out.println(base + " to the power of " + exponent + " is " +
                Math.pow(base, exponent));
    }

    public static void convertRadToDeg(){
        double radAngle = GeneralUtilities.getDoubleInput(
                "Insert an angle in radians to convert it to degree (rounded): ");
        System.out.println(radAngle + " rad is approximately equal to " + Math.round(Math.toDegrees(radAngle)) + "°");
    }

}
