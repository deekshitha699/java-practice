class Main {
    public static void main(String[] args) {
        int units = 250;

        if (units <= 100) {
            System.out.println("Rate: 1 per unit");
        } else if (units <= 200) {
            System.out.println("Rate: 2 per unit");
        } else {
            System.out.println("Rate: 3 per unit");
        }
    }
}
