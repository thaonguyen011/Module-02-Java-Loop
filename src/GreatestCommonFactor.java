import java.util.Scanner;

public class GreatestCommonFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;

        System.out.println("Enter a:");
        int a = Math.abs(scanner.nextInt());
        System.out.println("Enter b:");
        int b = Math.abs(scanner.nextInt());

        if ( a == 0 && b == 0) {
            System.out.println("No greatest common factor");
        } else if (a == 0) {
            System.out.println("The greatest common factor is " + b);
        } else if (b == 0) {
            System.out.println("The greatest common factor is " + a);
        } else {
            while (a != b) {
                if ( a > b ) a = a - b;
                else  b = b - a ;
            }
        }



    }
}
