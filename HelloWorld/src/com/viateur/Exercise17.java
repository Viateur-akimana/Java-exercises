package com.viateur;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercise17 {
    public static void main(String[] args){
        System.out.println("This is current time and date");
           displayingDateAndTime();
    }
    public static void displayingDateAndTime(){
        Date currentDate = new Date();
        SimpleDateFormat timeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = timeFormat.format(currentDate);
        System.out.println("This is formatted date and time" + formattedDate);
    }
}
