package utils;

import javax.swing.*;
import java.util.Scanner;

public class CLIUtils {
    private static final Scanner sc = new Scanner(System.in);

    public static String input(String prompt) {
        System.out.print(prompt);
        return sc.nextLine();
    }

    public static String input() {
        return sc.nextLine();
    }

    public static int inputInt(String prompt) {
        System.out.println(prompt);
        return sc.nextInt();
    }

    public static int inputInt() {
        return sc.nextInt();
    }

    public static double inputDouble(String prompt) {
        System.out.println(prompt);
        return sc.nextDouble();
    }

    //JOptionPane
    public static void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    public static String askForString(String message) {
        return JOptionPane.showInputDialog(null, message);

    }

    public static int askForInt(String message) {
        String input = askForString(message);
        if (input == null) {
            return 0;
        }
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            showMessage("Input tidak valid! Harap masukkan angka.");
            return 0;
        }
    }
}
