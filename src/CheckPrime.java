import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        int count = 0;

        if (num > 2) {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0 ) {
                System.out.println(num + " is prime");
            } else {
                System.out.println(num + " not is prime");
            }
        } else {
            System.out.println(num + " not is prime");
        }
    }
}
