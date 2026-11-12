class MomoWallet {

    private String userName;
    private double balance;

    public MomoWallet(String userName) {

        this.userName = userName;
        this.balance = 0.00;

    }

    public String getUserName() {

        return userName;

    }

    public double getBalance() {

        return balance;

    }

    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }

    }

}
