class Employee {
    private String empName;
    private long salary;
    private int empID ;
    private String designation ;

    public Employee(String designation, int empID, String empName, long salary) {
        this.designation = designation;
        this.empID = empID;
        this.empName = empName;
        this.salary = salary;
    }

    public String getEmpName() {
        return empName;
    }
    @Override
    public String toString() {
        return "Employee [empName=" + empName + ", salary=" + salary + ", empID=" + empID + ", designation="
                + designation + "]";
    }

    public void displayEmpData() {
        System.out.println(this) ;
    }
}