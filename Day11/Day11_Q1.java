public class Day11_Q1 {

    public static void main(String[] args) {
//for default constructor....
        Person p = new Person();
        System.out.println(p.getName());
        System.out.println(p.getAge());
//for parameterized constructor
        Person s = new Person("Ajay",10);
        System.out.println(s.getName());
        System.out.println(s.getAge());

    }


}
class Person{

    private String name;
    private int age;


    Person(){
        this.name="Default name";
        this.age= -1;
    }
    Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }







}