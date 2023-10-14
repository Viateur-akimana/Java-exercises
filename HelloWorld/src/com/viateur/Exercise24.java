package com.viateur;

public class Exercise24 {
    public static int countSpaces(String statement){
        int count = 0;
        for (int i = 0; i < statement.length(); i++){
            if(statement.charAt(i) == ' '){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
       String statement = "THis world is not fair";
        int result = countSpaces(statement);
        System.out.println("The number of spaces in the above statement is" + result);
    }
}
