class Main {
    public static void main(String[] args) {
        int[] numbers = {40, 10, 25, 5, 30, 15};

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                secondSmallest = smallest;
                smallest = numbers[i];
            } else if (numbers[i] > smallest && numbers[i] < secondSmallest) {
                secondSmallest = numbers[i];
            }
        }

        System.out.println("smallest: " + smallest);
        System.out.println("second smallest: " + secondSmallest);
    }
}
