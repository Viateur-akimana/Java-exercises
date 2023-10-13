package com.viateur;
import java.util.Scanner;
public class Exercise3 {
        public static void main(String[] args){
            long factoorial = 1;
            Scanner number = new Scanner(System.in);
            System.out.println("Enter the number to find factorial:");
            int input = number.nextInt();
            if(input < 0)
                System.out.println("The factorial of negative numbers doesn't exist");
            for(int i=1;i <= input;i++){
                factoorial *= i;
            }
            System.out.println("The factorial of number is" + factoorial);
        }

    }


