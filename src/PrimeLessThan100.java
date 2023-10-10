public class PrimeLessThan100 {
    public static void main(String[] args) {
        int i = 2;

        System.out.println("List of primes less than 100 is: ");
        while ( i < 100) {
            int count = 0;
            for (int j = 1; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    count++;
                if (count == 2) break;
                }
            }
            if (count == 1) {
                System.out.println(i);
            }
            i++;
        }
    }
}
