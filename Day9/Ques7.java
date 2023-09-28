import java.util.Scanner;

public class Ques7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int fnum = sc.nextInt();
        System.out.println("Enter Second Number");
        int snum = sc.nextInt();
        System.out.println("Enter Third Number");
        int tnum = sc.nextInt();

       

        int temp = (snum>tnum)?snum:tnum;
        int largest = (temp>fnum)?temp:fnum;
        System.out.println("The largest number is " + largest);
        sc.close();

        




    }
    
}
