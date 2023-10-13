package com.viateur;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Exercise5 {

   public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the length of the christmas:");
       int height = scanner.nextInt();
       for(int i = 1; i <= height; i++){

           //for creating spaces
         for(int space=1;space <= height-i; space++){
               System.out.print(" ");
           }
         //for crearing stars
          for(int star= 1; star <= i*2-1; star++){
              System.out.print("*");
          }
           System.out.println();
       }
   }
}