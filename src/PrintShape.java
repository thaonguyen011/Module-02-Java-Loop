import java.util.Scanner;

public class PrintShape {
    public static void main(String[] args) {
        System.out.println("Menu");
        System.out.println("1. Print the square triangle");
        System.out.println("2. Print isosceles triangle");
        System.out.println("3. Print rectangle");
        System.out.println("4. Exit");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Your choice");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter star number: ");
                int num = scanner.nextInt();
                System.out.println("Bottom-left triangle");
                for (int i = 1; i <= num; i++ ) {
                    System.out.println("*".repeat(i));
                }
                System.out.println("Top-left triangle");
                for (int i = num; i >= 1; i--){
                    System.out.println("*".repeat(i));
                }
                break;
            case 2:
                System.out.println("Enter star number: ");
                int num2 = scanner.nextInt();
                System.out.println("Isosceles triangle");
                for (int i = 1; i <= (num2 + 1)/2; i++) {
                    System.out.println(" ".repeat((num2 - 2*i + 1)/2) + "*".repeat(2*i - 1) + " ".repeat((num2 - 2*i + 1)/2));
                }
                break;
            case 3:
                System.out.println("Enter star width");
                int width = scanner.nextInt();
                System.out.println("Enter star height");
                int height = scanner.nextInt();

                for (int i = 1; i <= height; i++) {
                    System.out.println("*".repeat(width));
                }
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice!");

        }
    }
}
