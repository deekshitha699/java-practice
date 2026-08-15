class Main {
    public static void main(String[] args) {
        int[] numbers = {40, 25, 10, 7, 5};

        int largest = numbers[0];
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                secondLargest = largest;
                largest = numbers[i];
            } else if (numbers[i] > secondLargest && numbers[i] < largest) {
                secondLargest = numbers[i];
            }
        }

        System.out.println("largest: " + largest);
        System.out.println("second largest: " + secondLargest);
    }
}
