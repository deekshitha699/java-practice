class Main {
    public static void main(String[] args) {
        int positiveCount = 0;
        int positiveSum = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        int[] numbers = {10, -5, 20, 0, 15, -10, 30, 5};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                positiveCount++;
                positiveSum += numbers[i];
            } else if (numbers[i] < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        double positiveAverage = (double) positiveSum / positiveCount;

        System.out.println("positive count: " + positiveCount);
        System.out.println("positive sum: " + positiveSum);
        System.out.println("positive average: " + positiveAverage);
        System.out.println("negative count: " + negativeCount);
        System.out.println("zero count: " + zeroCount);
    }
}
