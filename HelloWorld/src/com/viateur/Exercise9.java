package com.viateur;

public class Exercise9 {
   public static void main(String[] args){
       int product = 1;
       for(int i=1;i <= 20; i++){
           if(i % 2 == 1)
               product *= i;
       }
       System.out.println("The product of all odd numbers btn 1 and 20 is:" + product);
   }
}

