package utils;

import java.util.Scanner;

public class CLIUtils {
    private static final Scanner sc = new Scanner(System.in);

    public static String input(String prompt) {
        System.out.print(prompt);
        return sc.nextLine();
    }

    public static int inputInt(String prompt) {
        System.out.println(prompt);
        return sc.nextInt();
    }

    public static double inputDouble(String prompt) {
        System.out.println(prompt);
        return sc.nextDouble();
    }
}
