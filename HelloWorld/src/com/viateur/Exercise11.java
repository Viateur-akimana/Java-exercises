package com.viateur;
public class Exercise11 {
      public static void main(String[] args){
          int factor = 5;
          int product = 1;
          for(int i = 2; i <= factor;i++){
              boolean isPrime = true;
              for(int j = 2;j <= Math.sqrt(i); j++){
                  if(i  % j == 0) {
                      isPrime = false;
                  }
              }
              if(isPrime){
                  product *= i;
              }
          }
          System.out.println("The product of all prime numbers btn 1 and 100 is:-" + product);
      }
    }
    
