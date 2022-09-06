package com.bridgelabz;
import java.util.Scanner ;


public class FactorsOfNumber {
    public static void  main (String[] args){
        System.out.println("********************************************");
        System.out.println(" Welcome to Factors Of Number....");   //Printing Welcome Meassage
        System.out.println("********************************************");



        System.out.println("Please Enter A Number = "); // Taking Input From User
        Scanner sc = new Scanner(System.in);  // Created a Scanner Object
        int num = sc.nextInt();

        for (int i = 1; i <=num; i++) {
            if (num % i == 0)  // Checking If remainder is 0
            {
                System.out.print(i+ " | "); //Printing the outputs
            }
        }









    }


}
