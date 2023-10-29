import java.util.Scanner;

public class Day13_Q6 {

    public static final String pass="p@ssword123";

    public static void checkPass(String password) throws Exception{
        if(!pass.equals(password)){
            throw new Exception();
        }
    }


    public static void main (String [] args) throws Exception{

        Scanner sc = new Scanner(System.in);

        try{
            checkPass(sc.nextLine());
            System.out.println("Login Sucessfull");
        }catch(Exception e){
            System.out.println("Invalid Password");
        }
        sc.close();

    }
    
}
