import java.util.Scanner;

public class LargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        number = Math.abs(number);
        int largest = -1;

        if (number == 0) {
            largest = 0;
        } else {
            while (number != 0) {
                int digit = number % 10;

                if (digit > largest) {
                    largest = digit;
                }

                number = number / 10;
            }
        }

        System.out.println("Largest digit: " + largest);
    }
}
