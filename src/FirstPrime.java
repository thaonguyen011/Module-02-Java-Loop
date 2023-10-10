import java.util.Scanner;

public class FirstPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount of prime");
        int num = scanner.nextInt();

        System.out.println(num + " first primes is:");
        int i = 3;
        int count = 0;

        while (count < num) {
            int uoc = 0;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    uoc++;
                    break;
                }
            }
            if (uoc == 0) {
                count++;
                System.out.println(i);
            }
            i++;
        }
    }
}
