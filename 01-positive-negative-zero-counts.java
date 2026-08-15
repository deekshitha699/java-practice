class Main {
    public static void main(String[] args) {
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        int[] numbers = {12, -5, 0, 25, -10, 8, 0, -3};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                positiveCount++;
            } else if (numbers[i] < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.println("positive count: " + positiveCount);
        System.out.println("negative count: " + negativeCount);
        System.out.println("zero count: " + zeroCount);
    }
}
