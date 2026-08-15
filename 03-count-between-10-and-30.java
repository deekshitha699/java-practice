class Main {
    public static void main(String[] args) {
        int count = 0;
        int[] numbers = {10, 25, 7, 40, 15, 30, 5};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= 10 && numbers[i] <= 30) {
                count++;
            }
        }

        System.out.println("count: " + count);
    }
}
