import java.util.Scanner;

public class Ques6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Month between 1 - 12");
        int month = sc.nextInt();
        System.out.println("Enter room Rent per day");
        double rent = sc.nextDouble();
        System.out.println("enter No of days");
        int noOfDays = sc.nextInt();

        double total = noOfDays*rent;
        double peakHike = total*20/100.0;

        switch(month){
            case 4,5,6,11,12-> System.out.printf("%.2f",total+peakHike);
            case 1,2,3,7,8,9,10 -> System.out.printf("%.2f",total);
            default -> System.out.println("Please give valid inputs");

        }
        sc.close();

        
    }
    
}
