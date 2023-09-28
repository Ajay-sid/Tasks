import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        System.out.println("Type String to reverse it ");
        Scanner sc = new Scanner(System.in);
        String str =sc.nextLine();
        String rstr = "";
        for(int i=str.length()-1;i>=0;i--){
            rstr = rstr+str.charAt(i);
        }
        System.out.println("The reversed given String is "+rstr);
        sc.close();
    }
    
}
