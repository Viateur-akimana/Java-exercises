package com.viateur;
import java.util.Scanner;
public class Exercise7 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a weekday number (1-7): ");
            int weekdayNumber = scanner.nextInt();
            String weekdayName;
            switch (weekdayNumber) {
                case 1:
                    weekdayName = "Sunday";
                    break;
                case 2:
                    weekdayName = "Monday";
                    break;
                case 3:
                    weekdayName = "Tuesday";
                    break;
                case 4:
                    weekdayName = "Wednesday";
                    break;
                case 5:
                    weekdayName = "Thursday";
                    break;
                case 6:
                    weekdayName = "Friday";
                    break;
                case 7:
                    weekdayName = "Saturday";
                    break;
                default:
                    weekdayName = "Invalid weekday number";
            }
            System.out.println("Weekday: " + weekdayName);

            scanner.close();
        }
    }


