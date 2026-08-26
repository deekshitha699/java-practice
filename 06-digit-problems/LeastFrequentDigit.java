import java.util.Scanner;

public class LeastFrequentDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int[] count = new int[10];

        if (number == 0) {
            count[0] = 1;
        } else {
            number = Math.abs(number);

            while (number != 0) {
                int digit = number % 10;
                count[digit]++;
                number = number / 10;
            }
        }

        int min = Integer.MAX_VALUE;
        int leastFrequent = 0;

        for (int i = 0; i <= 9; i++) {
            if (count[i] > 0 && count[i] < min) {
                min = count[i];
                leastFrequent = i;
            }
        }

        System.out.println("Least frequent: " + leastFrequent);
        System.out.println("Frequency: " + min);
    }
}
