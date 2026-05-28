public class HourlyEmployeeHW5 extends Employee {

    private double payRate;
    private double hourWorked;

    public HourlyEmployeeHW5() {}

    @Override
    public double calculatePay() {
        return payRate * hourWorked;//uslovie
    }

//    public HourlyEmployeeHW5(String name,
//                             String jobtitel, double payRate,
//                             double hourWorked) {
//        super(name, jobtitel);
//        this.payRate = payRate;
//        this.hourWorked = hourWorked;
//    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        if (payRate > 0)
        this.payRate = payRate;
    }

    public double getHourWorked() {
        return hourWorked;
    }

    public void setHourWorked(double hourWorked) {
        if (hourWorked >= 0)
        this.hourWorked = hourWorked;
    }

}
