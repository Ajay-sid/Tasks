import java.util.Scanner;

public class Ques4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First num ");
        int FNum = sc.nextInt();
        System.out.println("Second num");
        int Snum = sc.nextInt();

        int temp = FNum;
            FNum = Snum;
            Snum = temp;

            System.out.println("The Swapped value of First num is "+FNum+" and the seocnd num is "+Snum);
        sc.close();
    }
}
