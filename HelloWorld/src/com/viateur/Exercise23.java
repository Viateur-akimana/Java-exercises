package com.viateur;

public class Exercise23 {
    public static void main(String[] args){
        final float old = 1000000000;
        float minutes = 60;
        float seconds = 60;
        float hours = 24;
        float days = 365;
        float year1 = minutes * hours * days * seconds;
        float age = old / year1;
        System.out.println("JOhn is: " + age + "years old");
     }
}
