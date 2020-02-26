import company.*;
import staff.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Company firstCompany = new Company("ООО Рога и копыта");
        firstCompany.setIncome(15000000);
        for (int i = 0; i < 180; i++ ) {
            firstCompany.hire(new Operator(firstCompany,10000 + 10000 * Math.random()));
        }
        for (int i = 0; i < 80; i++ ) {
            firstCompany.hire(new Manager(firstCompany,20000 + 10000 * Math.random()));
        }
        for (int i = 0; i < 10; i++ ) {
            firstCompany.hire(new TopManager(firstCompany,30000 + 10000 * Math.random()));
        }
        System.out.println("В компании " + firstCompany.getCompanyName() + " " + firstCompany.getStaff().size() + " сотрудников.");
        System.out.println("Самые высокие зарплаты");
        ArrayList<Employee> tempList = firstCompany.getTopSalaryStaff(10);
        for (int i = 0; i < tempList.size(); i++) {
            System.out.printf("%d. %,.0f руб.%n", i + 1 , tempList.get(i).getMonthSalary());
        }

        System.out.println("Самые низкие зарплаты");
        tempList = firstCompany.getLowestSalaryStaff(30);
        for (int i = 0; i < tempList.size(); i++) {
            System.out.printf("%d. %,.0f руб.%n", i + 1 , tempList.get(i).getMonthSalary());
        }

        for (int i = 0; i < firstCompany.getStaff().size()/2 ; i++) {
            firstCompany.fire(firstCompany.getRandomEmployee());
        }

        System.out.println("В компании " + firstCompany.getCompanyName() + " " + firstCompany.getStaff().size() + " сотрудников.");
        System.out.println("Самые высокие зарплаты после увольнения половины сотрудников");
        tempList = firstCompany.getTopSalaryStaff(10);
        for (int i = 0; i < tempList.size(); i++) {
            System.out.printf("%d. %,.0f руб.%n", i + 1 , tempList.get(i).getMonthSalary());
        }

        System.out.println("Самые низкие зарплаты после увольнения половины сотрудников");
        tempList = firstCompany.getLowestSalaryStaff(30);
        for (int i = 0; i < tempList.size(); i++) {
            System.out.printf("%d. %,.0f руб.%n", i + 1 , tempList.get(i).getMonthSalary());
        }
    }
}
