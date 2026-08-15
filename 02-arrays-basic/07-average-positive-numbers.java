class Main {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        double average;

        int[] numbers = {-10, 20, 30, -5, 40, 10, -2};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                sum += numbers[i];
                count++;
            }
        }

        average = (double) sum / count;
        System.out.println("average: " + average);
    }
}
