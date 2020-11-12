package com.greenfoxacademy;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        System.out.println("Mennyi számot vizsgáljak?");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        int pieces=Integer.parseInt(userInput);
        int sum=0;
        Random rand = new Random();

//        int start=System.currentTimeMillis();
        for (int i=0;i<pieces;i++){

            int rand_int1 = rand.nextInt(100000);
            sum +=rand_int1;
        }
//        int stop=System.currentTimeMillis();
        System.out.println(pieces+  "darab random(1-100000) számot vizsgálva ");
        System.out.println("Összegük: "+sum);
        int atlag=sum/pieces;
//        int sumTime=start-stop;
        System.out.println("átlaguk: " + atlag);
//        System.out.println("kiszámítás időtertama: " + sumTime);


    }
}