import java.util.Scanner;

public class SecondMostFrequentDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int[] count = new int[10];
        boolean foundSecond = false;

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
        int secondMax = 0;
        int mostFrequent = 0;
        int secondMostFrequent = 0;

        for (int i = 0; i <= 9; i++) {
            if (count[i] > max) {
                secondMax = max;
                secondMostFrequent = mostFrequent;

                max = count[i];
                mostFrequent = i;
            } else if (count[i] > secondMax && count[i] < max) {
                secondMax = count[i];
                secondMostFrequent = i;
                foundSecond = true;
            }
        }

        System.out.println("Most frequent: " + mostFrequent);
        System.out.println("Frequency: " + max);

        if (foundSecond) {
            System.out.println("Second most frequent: " + secondMostFrequent);
            System.out.println("Frequency: " + secondMax);
        } else {
            System.out.println("No second most frequent digit");
        }
    }
}
