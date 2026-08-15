class Main {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 5, 20, 10, 5, 30};

        for (int i = 0; i < numbers.length; i++) {
            boolean alreadyProcessed = false;

            // Check whether this value was processed earlier.
            for (int k = 0; k < i; k++) {
                if (numbers[k] == numbers[i]) {
                    alreadyProcessed = true;
                    break;
                }
            }

            if (alreadyProcessed) {
                continue;
            }

            int count = 1;

            // Count matching values after i.
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                }
            }

            System.out.println(numbers[i] + " -> " + count + " times");
        }
    }
}
