class CompanyEmployee{
    private String employeeid;
    private String name;
    private double salary;
    public CompanyEmployee(String employeeid,String name,double salary){
        this.employeeid = employeeid;
        this.name=name;
        setSalary(salary);
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        if(salary>0){
            this.salary = salary;
        }else{
            System.out.println("Salary cannot be less than 0");
        }
    }
    public String getEmployeeID(){
        return employeeid;
    }
}
public class Encaapsulation {
    public static void main(String[] args) {
        CompanyEmployee emp = new CompanyEmployee("DEV-101","Alice Smith",75000);
        emp.setSalary(80000);
        emp.setSalary(-10000);
        System.out.println("Employee Name: "+ emp.getName());
        System.out.println("Salary: "+emp.getSalary());

    }

}
