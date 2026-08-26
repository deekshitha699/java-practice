import java.util.Scanner;

public class SecondLargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        number = Math.abs(number);

        int largest = -1;
        int secondLargest = -1;

        while (number != 0) {
            int digit = number % 10;

            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit < largest && digit > secondLargest) {
                secondLargest = digit;
            }

            number = number / 10;
        }

        System.out.println("Largest: " + largest);

        if (secondLargest == -1) {
            System.out.println("No second largest digit");
        } else {
            System.out.println("Second largest: " + secondLargest);
        }
    }
}
