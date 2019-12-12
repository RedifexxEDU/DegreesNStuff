import java.awt.*;
import java.util.Scanner;

public class Converter {
    public static void menu() {
        System.out.println("------- Conversions -------");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Fahrenheit to Kelvin");
        System.out.println("3. Celsius to Fahrenheit");
        System.out.println("4. Celsius to Kelvin");
        System.out.println("5. Kelvin to Fahrenheit");
        System.out.println("6. Kelvin to Celsius");
        System.out.println("");
        System.out.print("Conversion: #");
    }

    public static double fToC(double F)
    {
        return ((F - 32) * (5/9));
    }
    public static double fToK(double F)
    {
        return ((F - 32) * (5/9) + 273.15);
    }
    public static double cToF(double C)
    {
        return ((C * (9/5)) + 32);
    }
    public static double cToK(double C)
    {
        return (C + 273.15);
    }
    public static double kToF(double K)
    {
        return ((K - 273.15) * (9/5) + 32);
    }
    public static double kToC(double K)
    {
        return (K - 273.15);
    }

    public static void main(String args[])
    {
        Scanner scnr = new Scanner(System.in);
        int select = 0;
        double input;
        menu();
        select = scnr.nextInt();
        switch (select)
        {
            case 1:
                System.out.print("Fahrenheit: ");
                input = scnr.nextDouble();
                System.out.println("Celsius: " + fToC(input));
                break;
            case 2:
                System.out.print("Fahrenheit: ");
                input = scnr.nextDouble();
                System.out.println("Kelvin: " + fToK(input));
                break;
            case 3:
                System.out.print("Celsius: ");
                input = scnr.nextDouble();
                System.out.println("Fahrenheit: " + cToF(input));
                break;
            case 4:
                System.out.print("Celsius: ");
                input = scnr.nextDouble();
                System.out.println("Kelvin: " + cToK(input));
                break;
            case 5:
                System.out.print("Kelvin: ");
                input = scnr.nextDouble();
                System.out.println("Fahrenheit: " + kToF(input));
                break;
            case 6:
                System.out.print("Kelvin: ");
                input = scnr.nextDouble();
                System.out.println("Celsius: " + kToC(input));
                break;
            default:
                System.out.println("INVALID SELECTION... NOW SELF DESTRUCTING.");
        }



    }
}
