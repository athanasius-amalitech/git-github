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

    public void withdraw(double amount) {

        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        balance -= amount;

    }

}
