package company;

import staff.Employee;

import java.util.ArrayList;
import java.util.Collections;

public class Company {
    private String companyName;
    private ArrayList<Employee> staff = new ArrayList<>();
    private double income;

    public Company(String companyName) {
        this.companyName = companyName;
    }

    public void hire(Employee employee) {
        staff.add(employee);
    }

    public void hireAll(ArrayList<Employee> employees) {
        staff.addAll(employees);
    }

    public boolean fire(Employee employee) {
        if (!staff.contains(employee)) {
            return false;
        }
        else {
            staff.remove(employee);
            return true;
        }
    }

    public ArrayList<Employee> getTopSalaryStaff(int count) {
        ArrayList<Employee> listToSort = new ArrayList<>(staff);
        ArrayList<Employee> listToReturn = new ArrayList<>();
        Collections.sort(listToSort, (o1, o2) -> {
            if (o1.getMonthSalary() > o2.getMonthSalary()) return -1;
            if (o2.getMonthSalary() > o1.getMonthSalary()) return 1;
            return 0;
        });

        count = count < 0 ? 0 : count;
        count = staff.size() < count ? staff.size() : count;
        for (int i = 0; i < count; i++) {
            listToReturn.add(listToSort.get(i));
        }
        return listToReturn;
    }

    public ArrayList<Employee> getLowestSalaryStaff(int count) {
        ArrayList<Employee> listToSort = new ArrayList<>(staff);
        ArrayList<Employee> listToReturn = new ArrayList<>();
        Collections.sort(listToSort, (o1, o2) -> {
            if (o1.getMonthSalary() > o2.getMonthSalary()) return 1;
            if (o2.getMonthSalary() > o1.getMonthSalary()) return -1;
            return 0;
        });

        count = count < 0 ? 0 : count;
        count = staff.size() < count ? staff.size() : count;
        for (int i = 0; i < count; i++) {
            listToReturn.add(listToSort.get(i));
        }
        return listToReturn;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public ArrayList<Employee> getStaff() {
        return staff;
    }

    public String getCompanyName() {
        return companyName;
    }

    public Employee getRandomEmployee() {
        return staff.get((int)Math.floor(Math.random() * staff.size()));
    }
}
