public abstract class Employee {
    private String name;
    private String jobtitel;

    public Employee() {}

//    public Employee(String name, String jobtitel) {
//        super();
//        this.name = name;
//        this.jobtitel = jobtitel;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null)
        this.name = name;
    }

    public String getJobtitel() {
        return jobtitel;
    }

    public void setJobtitel(String jobtitel) {
        if (jobtitel != null)
        this.jobtitel = jobtitel;
    }

//    @Override
//    public String toString() {
//        return "Name: " + name
//                + ", Jobtitel: " + jobtitel;
//    }

    public abstract double calculatePay();
}
