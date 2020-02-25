import clients.*;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Вова Пупкин");
        person1.deposit(1000);
        System.out.println("Положили на счет " + person1.getName() + " 1000 руб.");
        System.out.println("На счету " + person1.getAccount() + " принадлежащем " + person1.getName() + " " + person1.getBalance() + " руб.");
        person1.withdraw(500);
        System.out.println("Сняли со счета " + person1.getName() + " 500 руб.");
        System.out.println("На счету " + person1.getAccount() + " принадлежащем " + person1.getName() + " " + person1.getBalance() + " руб.");

        System.out.println("\n------------------------------------");
        Firm firm1 = new Firm("ООО Рога и копыта");
        firm1.deposit(1000);
        System.out.println("Положили на счет " + firm1.getName() + " 1000 руб.");
        System.out.println("На счету " + firm1.getAccount() + " принадлежащем " + firm1.getName() + " " + firm1.getBalance() + " руб. Накопленная комиссия: " + firm1.getSumComission() + " руб.");
        firm1.withdraw(500);
        System.out.println("Сняли со счета " + firm1.getName() + " 500 руб.");
        System.out.println("На счету " + firm1.getAccount() + " принадлежащем " + firm1.getName() + " " + firm1.getBalance() + " руб. Накопленная комиссия: " + firm1.getSumComission() + " руб.");

        System.out.println("\n------------------------------------");
        Entrepreneur entrepreneur1 = new Entrepreneur("ИП Калачиков В.Н.");
        entrepreneur1.deposit(1000);
        System.out.println("Положили на счет " + entrepreneur1.getName() + " 1000 руб.");
        System.out.println("На счету " + entrepreneur1.getAccount() + " принадлежащем " + entrepreneur1.getName() + " " + entrepreneur1.getBalance() + " руб. Накопленная комиссия: " + entrepreneur1.getSumComission() + " руб.");
        entrepreneur1.withdraw(500);
        System.out.println("Сняли со счета " + entrepreneur1.getName() + " 500 руб.");
        System.out.println("На счету " + entrepreneur1.getAccount() + " принадлежащем " + entrepreneur1.getName() + " " + entrepreneur1.getBalance() + " руб. Накопленная комиссия: " + entrepreneur1.getSumComission() + " руб.");

    }
}
