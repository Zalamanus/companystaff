package accounts;

import clients.Client;

import java.math.BigInteger;

public class Account {
    private static BigInteger accountNumber = new BigInteger("21247000000000000");
    private double balance;
    private Client owner;

    public Account(Client owner) {
        balance = 0;
        accountNumber = accountNumber.add(BigInteger.ONE);
        this.owner = owner;
    }
    public Account(Client owner, double initBalance) {
        this(owner);
        balance = initBalance;
    }

    public String toString() {
        return accountNumber.toString();
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Client getOwner() {
        return owner;
    }
}
