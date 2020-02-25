package clients;

public class Entrepreneur extends Client {
    private double sumComission = 0;
    private double comissionPercent1 = 1;
    private double comissionPercent2 = 0.5;
    private double comissionThreshold = 1000;


    public Entrepreneur(String name) {
        super(name, ClientType.ENTREPRENEUR);
    }

    public void deposit(double amount) {
        double comission = amount < comissionThreshold ? amount * (comissionPercent1/100) : amount * (comissionPercent2/100);
        sumComission += comission;
        amount -= comission;
        super.deposit(amount);
    }

    public double getSumComission() {
        return sumComission;
    }
}
