
import java.util.Scanner;


public class Geometry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Draw the triangle");
        System.out.println("2. Draw the square");
        System.out.println("3. Draw the rectangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();



        switch (choice) {
            case 1:
                System.out.println("Enter star number: ");
                int num = scanner.nextInt();
                for (int i = num; i >= 1; i--) {
                    StringBuilder result;
                    result = new StringBuilder();
                    result.append("*".repeat(i));
                    System.out.println(result);
                    System.out.println();
                }
                break;
            case 2:
                System.out.println("Enter star number: ");
                int num1 = scanner.nextInt();
                for (int i = num1; i >= 1; i--) {
                    StringBuilder result;
                    result = new StringBuilder();
                    result.append("*".repeat(num1));
                    System.out.println(result);
                    System.out.println();
                }

                break;
            case 3:
                System.out.println("Enter star width: ");
                int width = scanner.nextInt();
                System.out.println("Enter star height: ");
                int height = scanner.nextInt();
                for ( int i = 0; i < height; i++) {
                    StringBuilder result;
                    result = new StringBuilder();
                    result.append("*".repeat(width));
                    System.out.println(result);
                    System.out.println();
                }
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("No choice!");
        }


    }
}
