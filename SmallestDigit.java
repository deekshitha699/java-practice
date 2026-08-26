import java.util.Scanner;

public class SmallestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        number = Math.abs(number);
        int smallest = Integer.MAX_VALUE;

        if (number == 0) {
            smallest = 0;
        } else {
            while (number != 0) {
                int digit = number % 10;

                if (digit < smallest) {
                    smallest = digit;
                }

                number = number / 10;
            }
        }

        System.out.println("Smallest digit: " + smallest);
    }
}
