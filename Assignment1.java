import java.util.Scanner;
class Assignment1 {

    public static void main(String args[]) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number from 1-3");
        int choice = sc.nextInt() ;

        switch(choice) { 
        case 1:
        Employee e = new Employee("Employee", 342, "Riddhi", 200000);
        e.displayEmpData() ;
        break ;

        case 2:
        Manager m = new Manager(null, 354, "Riddhi", 268332, 37259) ;
        m.displayEmpData();
        break ;
        
        case 3:
        Developer d = new Developer(null, 432, "Riddhi", 300000, "Java") ;
        d.addskills("Java") ;
        d.addskills("Python",10) ;
        d.addskills("React","Expert") ;
        d.displayEmpData() ;
        break ;
    }
    sc.close();
}
}
