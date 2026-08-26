import java.util.Scanner;

public class FirstLastSame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        number = Math.abs(number);

        int lastDigit = number % 10;

        while (number >= 10) {
            number = number / 10;
        }

        int firstDigit = number;

        if (firstDigit == lastDigit) {
            System.out.println("Same");
        } else {
            System.out.println("Not same");
        }
    }
}
