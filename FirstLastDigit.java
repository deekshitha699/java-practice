import java.util.Scanner;

public class FirstLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        number = Math.abs(number);

        int lastDigit = number % 10;

        while (number >= 10) {
            number = number / 10;
        }

        int firstDigit = number;

        System.out.println("First digit: " + firstDigit);
        System.out.println("Last digit: " + lastDigit);
    }
}
