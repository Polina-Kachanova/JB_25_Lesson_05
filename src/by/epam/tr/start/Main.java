package by.epam.tr.start;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    private static int k = 0;
    private static Fraction[] array;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        k = scanK();
        initializeArray(k);
        enterArray(array);
        printArray(array);
    }

    private static int scanK() {
        System.out.print("Enter array size: ");
        while(!sc.hasNextInt()) {
            sc.next();
            System.out.print("Enter array size: ");
        }
        k = sc.nextInt();
        System.out.println();
        return k;
    }

    private static void initializeArray(int length) {
        array = new Fraction[length];
        for (int i = 0; i < array.length; i++) {
            Fraction element = new Fraction();
            array[i] = element;
        }
    }

    private static void enterDividend(Fraction element) {
        System.out.print("Enter dividend: ");
        while(!sc.hasNextDouble()) {
            sc.next();
            System.out.print("Enter dividend: ");
        }
        element.setDividend(sc.nextDouble());
    }

    private static void enterDivider(Fraction element) {
        System.out.print("Enter divider: ");
        while(!sc.hasNextDouble()) {
            sc.next();
            System.out.print("Enter divider: ");
        }
        double temp = sc.nextDouble();
        if(temp != 0) {
            element.setDivider(temp);
        } else {
            System.out.println("0 is not a valid value!");
            enterDivider(element);
        }
    }

    private static void enterArray(Fraction[] array) {
        for (Fraction element: array) {
            enterDividend(element);
            enterDivider(element);
        }
    }

    private static void printArrayElement(Fraction element) {
        double temp = element.getDividend()/element.getDivider();
        String formattedDouble = new DecimalFormat("#0.00").format(temp);
        System.out.print(formattedDouble + " ");
    }

    public static void printArray(Fraction[] array) {
        System.out.println();
        for (Fraction element: array) {
            printArrayElement(element);
        }
    }
}
