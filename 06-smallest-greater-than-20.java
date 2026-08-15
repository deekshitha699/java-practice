class Main {
    public static void main(String[] args) {
        int smallest = Integer.MAX_VALUE;
        int[] numbers = {10, 25, 7, 40, 15, 30, 5};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 20 && numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        System.out.println("smallest: " + smallest);
    }
}
