class Main {
    public static void main(String[] args) {
        int age = 25;
        int price;

        if (age < 5) {
            price = 0;
        } else if (age <= 12) {
            price = 50;
        } else if (age < 60) {
            price = 100;
        } else {
            price = 60;
        }

        System.out.println("Ticket price: " + price);
    }
}
