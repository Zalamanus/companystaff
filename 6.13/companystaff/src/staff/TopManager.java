package staff;

import company.Company;

public class TopManager implements Employee {
    private double fixSalary;
    private Company company;

    public TopManager(Company company, double fixSalary) {
        this.company = company;
        this.fixSalary = fixSalary;
    }
    @Override
    public double getMonthSalary() {
        if (company.getIncome() > 10000000 ) return fixSalary * 2.5;
        return fixSalary;
    }
}
