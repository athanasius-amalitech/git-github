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

}
