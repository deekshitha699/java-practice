class Main {
    public static void main(String[] args) {
        int sum = 0;
        int[] numbers = {10, 25, 7, 40, 15, 30, 5};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 20) {
                sum += numbers[i];
            }
        }

        System.out.println("sum: " + sum);
    }
}
