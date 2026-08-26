import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int searchDigit = sc.nextInt();

        number = Math.abs(number);
        int count = 0;

        if (number == 0) {
            if (searchDigit == 0) {
                count = 1;
            }
        } else {
            while (number != 0) {
                int digit = number % 10;

                if (digit == searchDigit) {
                    count++;
                }

                number = number / 10;
            }
        }

        System.out.println(searchDigit + " appears " + count + " times");
    }
}
