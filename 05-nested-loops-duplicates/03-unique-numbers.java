class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 10, 30, 40, 20, 50};

        for (int i = 0; i < numbers.length; i++) {
            boolean alreadyProcessed = false;

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

            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println(numbers[i] + " -> 1 time");
            }
        }
    }
}
