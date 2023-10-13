package com.viateur;

public class Exercise8 {
        public static void main(String[] args){
            int sum = 0;
            for(int i=1;i <= 100;i++){
                if(i % 2 == 0)
                    sum = sum + i;
            }
            System.out.println("The sum of even numbers less than 100 is:" + sum);

        }
    }


