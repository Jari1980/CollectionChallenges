package org.example;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        while(true){
            System.out.println("Which challenge do you want to see 1-4? (close program with non number) :");
            try{
                int num = scan.nextInt();
                switch(num){
                    case 1:
                        challenge1();
                        break;
                    default:
                        System.out.println("There is no such challenge.");
                        break;
                }
            }
            catch(Exception e){
                System.out.println("Closing");
                System.exit(0);
            }
        }
    }
    public static void challenge1(){
        System.out.println("Creating empty set days and populating it with all days of a week: ");
        Set<String> days = Set.of("MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY");
        System.out.println("Creating new set and populating ith with SATURDAY and SUNDAY");
        Set<String> weekendDays = Set.of("SATURDAY", "SUNDAY");
        System.out.println("Comparing both sets and retaining in the first set only days that are equal in both sets: ");
        System.out.println("Creating a temporary set: ");
        Set<String> temp = new HashSet<>();
        System.out.println("Comparing each day in both sets and adding to temp set if equal: ");
        for(String day : days){
            for(String weekendDay : weekendDays){
                if(day.equals(weekendDay)){
                    temp.add(day);
                }
            }
        }
        System.out.println("Setting days equal to temp set: ");
        days = temp;
        System.out.println("Days retained in Set days: " + days);
    }
}