import java.util.Scanner;

public class MostFrequentDigit {
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

        int max = 0;
        int mostFrequent = 0;

        for (int i = 0; i <= 9; i++) {
            if (count[i] > max) {
                max = count[i];
                mostFrequent = i;
            }
        }

        System.out.println("Most frequent: " + mostFrequent);
        System.out.println("Frequency: " + max);
    }
}
