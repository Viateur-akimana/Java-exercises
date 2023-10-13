package com.viateur;

public class EXercise12 {
    public static void main(String[] args){
        int count =  findPythogorasPairs();
        System.out.println("The number of pairs of pythogoras rule btn 1 and 100 is:" + count);

    }
    public static int findPythogorasPairs(){
        int count = 0;
        for(int i = 1;i <= 100;i++){
          for (int j=i; j <= 100; j++){
              int cSquared = i * i + j * j;
              int c = (int) Math.sqrt(cSquared);
              if( c * c == cSquared && c < 100){
                  System.out.println(" " + i + " " + j + " " + c);
                  count ++;
              }
          }

        }
        return count;
    }
}
