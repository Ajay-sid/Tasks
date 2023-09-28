import java.util.Scanner;

public class Ques9 {
    public static void main(String[] args) {
        
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter age ");
        int age = sc.nextInt();
        
        if(age >=60){
            System.out.println("Senior citizen");
        }
        else{
            System.out.println("not a Senior citizen");
        }
        sc.close();
       
    }

}
    

