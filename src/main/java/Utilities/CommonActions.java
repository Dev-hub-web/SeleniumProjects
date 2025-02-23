package Utilities;

public class CommonActions {
    public static void logYellow(String message) {
        System.out.println("\u001B[33m" + message + "\u001B[0m");
    }
    public static void logSuccess(String message) {
        System.out.println("\u001B[32m" + message + "\u001B[0m");
    }
    public static void logRed(String message) {
        System.out.println("\u001B[31m" + message + "\u001B[0m");
    }
    public static void logBlue(String message) {
        System.out.println("\u001B[34m" + message + "\u001B[0m");
    }
}
