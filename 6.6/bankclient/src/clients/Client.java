package clients;

import accounts.Account;

public abstract class Client {
    private ClientType clientType;
    private Account account;
    private String name;

    public Client(String name, ClientType clientType) {
        this.name = name;
        this.clientType = clientType;
        account = new Account(this);
    }

    public double withdraw(double amount) {
        if (amount > account.getBalance()) return -1;
        account.setBalance(account.getBalance() - amount);
        return account.getBalance();
    }

    public void deposit(double amount) {
        getAccount().setBalance(getAccount().getBalance() + amount);
    }

    public double getBalance() {
        return account.getBalance();
    };

    public ClientType getClientType() {
        return clientType;
    }

    public Account getAccount() {
        return account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
