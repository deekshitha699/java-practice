class Main {
    public static void main(String[] args) {
        int amount = 500;

        if (amount >= 1000) {
            System.out.println("Offer: 20% bonus");
        } else if (amount >= 500) {
            System.out.println("Offer: 10% bonus");
        } else if (amount >= 200) {
            System.out.println("Offer: 5% bonus");
        } else {
            System.out.println("No bonus");
        }
    }
}
