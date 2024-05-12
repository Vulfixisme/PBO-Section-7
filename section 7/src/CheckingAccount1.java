public class CheckingAccount1 {
    public String accountNumber;
    public double balance;
    public String name;

    public CheckingAccount(String accountNumber, double intialbalance){
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    public String getAccountNumber(){
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
balance += amount;
        System.out.println("Deposit $" + amount + " successful. Saldo anda: $" + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Mararik sebesar $" + amount + " successful. Saldo anda: $" + balance);
        } else {
            System.out.println("program gagal");
        }
    }

}
