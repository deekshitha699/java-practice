class Main {
    public static void main(String[] args) {
        int positiveSum = 0;
        int negativeSum = 0;
        int zeroSum = 0;

        int[] numbers = {12, -5, 0, 25, -10, 8, 0, -3};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                positiveSum += numbers[i];
            } else if (numbers[i] < 0) {
                negativeSum += numbers[i];
            } else {
                zeroSum += numbers[i];
            }
        }

        int totalSum = positiveSum + negativeSum + zeroSum;

        System.out.println("positive sum: " + positiveSum);
        System.out.println("negative sum: " + negativeSum);
        System.out.println("zero sum: " + zeroSum);
        System.out.println("total sum: " + totalSum);
    }
}
