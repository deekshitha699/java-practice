import java.util.Scanner;

public class EvenOddDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        number = Math.abs(number);

        int evenDigitsSum = 0;
        int oddDigitsSum = 0;

        while (number != 0) {
            int digit = number % 10;

            if (digit % 2 == 0) {
                evenDigitsSum += digit;
            } else {
                oddDigitsSum += digit;
            }

            number = number / 10;
        }

        System.out.println("Even digit sum: " + evenDigitsSum);
        System.out.println("Odd digit sum: " + oddDigitsSum);
    }
}
