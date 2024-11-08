package org.example;

import java.util.*;

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
                    case 2:
                        challenge2();
                        break;
                    case 3:
                        challenge3();
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
    public static void challenge3(){
        System.out.println("Creating a new class SuperHero, adding fields for id, name, age and getters/setter");
        System.out.println("Implementing Comparable interface and overriding method in order to compare age");
        System.out.println("Creating arrayList of type SuperHero: ");
        ArrayList<SuperHero> arrayList = new ArrayList<>();
        System.out.println("Creating some heroes and adding them to arrList: ");
        SuperHero jari = new SuperHero();
        jari.setName("Jari");
        jari.setAge(20);
        jari.setId(1);
        arrayList.add(jari);
        SuperHero billy = new SuperHero();
        billy.setName("Billy Gate");
        billy.setAge(90);
        billy.setId(2);
        arrayList.add(billy);
        SuperHero michel = new SuperHero();
        michel.setName("Michel Jeckson");
        michel.setId(3);
        michel.setAge(60);
        arrayList.add(michel);
        SuperHero broccoli = new SuperHero();
        broccoli.setName("Broccoli");
        broccoli.setAge(5);
        broccoli.setId(4);
        arrayList.add(broccoli);
        System.out.println("arrayList as is: ");
        for(SuperHero element : arrayList){
            System.out.println(element.getId() + " " + element.getName() + " " + element.getAge());
        }
        System.out.println("Sorting arrayList regarding age: ");
        Collections.sort(arrayList);
        System.out.println("arrayList sorted: ");
        for(SuperHero element : arrayList){
            System.out.println(element.getId() + " " + element.getName() + " " + element.getAge());
        }
    }

    public static void challenge2(){
        System.out.println("Creating hashMap of type <String,String>");
        HashMap<String, String> hashMap = new HashMap<>();
        System.out.println("Populating hashMap with values containing email and name: ");
        hashMap.put("email@email", "Jari Testar");
        hashMap.put("Other@email", "Billy Gate");
        hashMap.put("Third@email", "Michel Jeckson");
        System.out.println("Creating a new Set set: ");
        Set<String> set = new HashSet<>();
        System.out.println("Populating set with keys from hashMap: ");
        set.addAll(hashMap.keySet());
        System.out.println("Keys in set: " + set);
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