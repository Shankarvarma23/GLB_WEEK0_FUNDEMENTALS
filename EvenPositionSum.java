
import java.util.Scanner;

class EvenPositionSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int pos = 1, sum = 0;

        while (n > 0) {
            int digit = n % 10;

            if (pos % 2 == 0) {
                sum = sum + digit;
            }

            pos++;
            n = n / 10;
        }

        System.out.println(sum);
    }
}
