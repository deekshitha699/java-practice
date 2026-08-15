class Main {
    public static void main(String[] args) {
        int a = 20;
        int b = 5;
        char operator = '/';

        if (operator == '+') {
            System.out.println(a + b);
        } else if (operator == '-') {
            System.out.println(a - b);
        } else if (operator == '*') {
            System.out.println(a * b);
        } else if (operator == '/') {
            if (b != 0) {
                System.out.println((double) a / b);
            } else {
                System.out.println("Cannot divide by zero");
            }
        } else {
            System.out.println("Invalid operator");
        }
    }
}
