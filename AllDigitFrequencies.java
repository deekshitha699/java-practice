import java.util.Scanner;

public class AllDigitFrequencies {
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

        for (int i = 0; i <= 9; i++) {
            System.out.println(i + " -> " + count[i]);
        }
    }
}
