class Main {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 7, 89, 23, 56, 3, 78};

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        int sum = 0;
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            count++;

            // Largest / second largest
            if (numbers[i] > largest) {
                secondLargest = largest;
                largest = numbers[i];
            } else if (numbers[i] < largest && numbers[i] > secondLargest) {
                secondLargest = numbers[i];
            }

            // Smallest / second smallest
            if (numbers[i] < smallest) {
                secondSmallest = smallest;
                smallest = numbers[i];
            } else if (numbers[i] > smallest && numbers[i] < secondSmallest) {
                secondSmallest = numbers[i];
            }
        }

        double average = (double) sum / count;

        System.out.println("largest: " + largest);
        System.out.println("smallest: " + smallest);
        System.out.println("second largest: " + secondLargest);
        System.out.println("second smallest: " + secondSmallest);
        System.out.println("average: " + average);
    }
}
