class Developer extends Employee{
    private String skills ;

    public Developer(String designation, int empID, String empName, long salary, String skills) {
        super("Developer", empID, empName, salary);
        this.skills = skills;
    }

    
    @Override
    public void displayEmpData() {
        super.toString();
        System.out.println(this);
    }
    public void addskills(String skills) {
        System.out.println(super.getEmpName()+" knows "+this.skills) ;
    }

    public void addskills(String skills , int exp) {
        System.out.println(super.getEmpName()+" has "+exp+" years of experience in "+this.skills) ;
    }

    public void addskills(String skills , String experty) {
        System.out.println(super.getEmpName()+" is "+experty+" in "+this.skills) ;
    }
}
