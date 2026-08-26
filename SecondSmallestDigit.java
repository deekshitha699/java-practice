import java.util.Scanner;

public class SecondSmallestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        number = Math.abs(number);

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        while (number != 0) {
            int digit = number % 10;

            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit > smallest && digit < secondSmallest) {
                secondSmallest = digit;
            }

            number = number / 10;
        }

        System.out.println("Smallest: " + smallest);

        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("No second smallest digit");
        } else {
            System.out.println("Second smallest: " + secondSmallest);
        }
    }
}
