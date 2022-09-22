public class Account {
    public int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
        if ( balance < 0 ){
            balance = 0;
        }
    }
}
