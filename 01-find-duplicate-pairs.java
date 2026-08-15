class Main {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 5, 20};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.println(numbers[i] + " is duplicate");
                }
            }
        }
    }
}
