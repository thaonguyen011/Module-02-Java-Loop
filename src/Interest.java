import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter money: ");
        double money = scanner.nextDouble();
        System.out.println("Enter month: ");
        int month = scanner.nextInt();
        System.out.println("Enter interest rate: ");
        double interestRate = scanner.nextDouble();

        double result = 0d;
        for ( int i = 0; i < month; i++) {
            result += money * month * interestRate/(100 * 12);
        }
        System.out.println("Total of interest: " + result);
    }
}
