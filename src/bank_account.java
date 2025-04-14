public class bank_acount {
    public String number;
    public double balance = 0;

    public bank_acount(String number, double balance) {
        this.number = number;
        this.balance = balance;
    }

    public String getNumbere() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double value){
        this.balance += value;
    }

    public void draw(double value) {
        if (value > this.balance) {
            System.out.println("In fact, this value is bigger than the balance");
        } else {
            this.balance -= value;
        }
    }
}
