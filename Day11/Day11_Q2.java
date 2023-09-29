public class Day11_Q2 {


    public static void main(String[] args) {
        Employee emp=new Employee(351132,"Ajay",
                "Sid",30000);
        System.out.println(emp.getAnnualSalary());
//        emp.setSalary(40000);
        System.out.println(emp.getName());
        System.out.println("New Salary : " +emp.raiseSalary(10));
        System.out.println(emp.toString());




    }


}
class Employee{
    private int id;
    private String firstName;
    private String lastName;
    private int salary;


    Employee(int id, String firstName,String lastName,int salary){
        this.id=id;
        this.firstName=firstName;
        this.lastName = lastName;
        this.salary=salary;
    }


    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public String getName() {
        return firstName + " " +lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary){
        this.salary=salary;

    }
    public int getAnnualSalary(){
        return salary*12;
    }

    public double raiseSalary(int percent){
        double rSalary=salary*percent/100.0;
        return rSalary+salary;


    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }
}