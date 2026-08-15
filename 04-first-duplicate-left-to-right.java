class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 20, 40, 10};

        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {

            // Check whether the current value appeared before.
            for (int k = 0; k < i; k++) {
                if (numbers[i] == numbers[k]) {
                    System.out.println("First duplicate: " + numbers[i]);
                    found = true;
                    break; // Stop the k loop.
                }
            }

            if (found) {
                break; // Stop the i loop too.
            }
        }
    }
}
