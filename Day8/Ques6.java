import java.util.Scanner;

public class Ques6 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        sc.close();
        int total = 1;

        for(int i = 1;i<=num;i++){
            total = total *i;

        }
            System.out.println(total);
    }
    
}
