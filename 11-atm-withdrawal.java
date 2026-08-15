class Main {
    public static void main(String[] args) {
        int balance = 5000;
        int withdrawal = 2000;

        if (withdrawal <= 0) {
            System.out.println("Invalid amount");
        } else if (withdrawal > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= withdrawal;
            System.out.println("Withdrawal successful");
            System.out.println("Remaining balance: " + balance);
        }
    }
}
