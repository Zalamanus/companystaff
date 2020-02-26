package staff;

import company.Company;

public class Operator implements Employee {
    private double fixSalary;
    private Company company;

    public Operator(Company company, double fixSalary) {
        this.company = company;
        this.fixSalary = fixSalary;
    }
    @Override
    public double getMonthSalary() {
        return fixSalary;
    }
}
