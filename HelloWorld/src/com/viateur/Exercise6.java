package com.viateur;
import java.util.Scanner;
public class Exercise6 {
       public static void main(String[] args){
           Scanner scanner = new Scanner(System.in);
           System.out.println("Please enter the number to check:-");
           int number = scanner.nextInt();
           if(number > 0){
               System.out.println("Positive");
           } else if (number < 0) {
               System.out.println("negative");
           }
           else{
               System.out.println("zero");
           }

       }
    }


