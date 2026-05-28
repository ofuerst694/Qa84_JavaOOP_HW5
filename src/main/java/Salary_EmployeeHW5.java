public class Salary_EmployeeHW5 extends Employee {
    private double weeklySalary;

    public Salary_EmployeeHW5() {}

    @Override
    public double calculatePay() {
        return weeklySalary;
    }

//    public Salary_EmployeeHW5(String name,
//                              String jobtitel,
//                              double weeklySalary) {
//        super(name, jobtitel);
//        this.weeklySalary = weeklySalary;
//    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        if (weeklySalary >= 0)
        this.weeklySalary = weeklySalary;
    }

//    @Override
//    public String toString() {
//        return super.toString()
//                + "WeeklySalary: " + weeklySalary;
    }

//    @Override
//    public double calculatePay() {
//        double weeklySalary = super.getweeklySalary();
//        return weeklySalary;
//    }

