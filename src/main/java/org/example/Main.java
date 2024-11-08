package org.example;

import java.util.Scanner;

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

    }
}