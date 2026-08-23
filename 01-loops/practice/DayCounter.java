package practice;

import java.sql.SQLOutput;

public class DayCounter {
    public static void main(String[] args){
        int day = 1;
        int j = 1;
        while(day<=7){
            System.out.println();
            System.out.println("today is day "+day);

            switch(day){
                case 1:
                    System.out.println("Day "+day+" monday");
                    while(j<=24){
                        System.out.println(j+" O clock");
                        j++;
                    }
                    j = 1;
                    day++;
                    break;

                case 2:
                    System.out.println("Day "+day+" tuesday");
                    while(j<=24){
                        System.out.println(j+" O clock");
                        j++;
                    }
                    j = 1;
                    day++;
                    break;
                case 3:
                    System.out.println("Day "+day+" wednesday");
                    while(j<=24){
                        System.out.println(j+" O clock");
                        j++;
                    }
                    j = 1;
                    day++;
                    break;
                case 4:
                    System.out.println("Day "+day+" thursday");
                    while(j<=24){
                        System.out.println(j+" O clock");
                        j++;
                    }
                    j = 1;
                    day++;
                    break;
                case 5:
                    System.out.println("Day "+day+" friday");
                    while(j<=24){
                        System.out.println(j+" O clock");
                        j++;
                    }
                    j = 1;
                    day++;
                    break;
                case 6:
                    System.out.println("Day "+day+" saturday");
                    while(j<=24){
                        System.out.println(j+" O clock");
                        j++;
                    }
                    j = 1;
                    day++;
                    break;
                case 7:
                    System.out.println("Day "+day+" sunday");
                    while(j<=24){
                        System.out.println(j+" O clock");
                        j++;
                    }
                    j = 1;
                    day++;
                    break;
                default:
                    System.out.println("invalid day");
            }

        }
    }
}
