
/*
 4) Write a Java program that reads user input for two integers and performs division.
 Handle the exception that is thrown when the second number is zero,
 and display an error message to the user
 */

import java.util.Scanner;

public class Day13_Q4 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int fnum = sc.nextInt();
            int snum = sc.nextInt();

            try {
                int div = fnum/snum;
                System.out.println(div);
            }catch (Exception e){
                System.out.println("You can't divide a number by ZERO");
            }
            sc.close();

        }
    }

