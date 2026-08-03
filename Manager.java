class Manager extends Employee {
    private long bonus ;

    public Manager(String designation , int empID , String empName , long salary , long bonus) {
        super("Manager", empID, empName, salary);
        this.bonus = bonus;
    }
    
    @Override
    public void displayEmpData() {
        super.toString();
        System.out.println(this.bonus);
    }
}
