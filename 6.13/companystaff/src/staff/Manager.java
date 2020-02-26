package staff;

import company.Company;

public class Manager implements Employee {
    private double fixSalary;
    private Company company;
    private static int managerCount = 0;

    public Manager(Company company, double fixSalary) {
        this.company = company;
        this.fixSalary = fixSalary;
        managerCount++;
    }

    @Override
    public double getMonthSalary() {
        return fixSalary + (company.getIncome() / managerCount * 0.05);
    }
}
