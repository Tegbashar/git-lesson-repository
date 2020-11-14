package com.greenfoxacademy;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Kérek egy számot!");
//        Scanner scanner = new Scanner(System.in);
//        String userInput1 = scanner.nextLine();
//        int lenght = Integer.parseInt(userInput1);
//        int half = (lenght / 2) + 1;
//        String line = "";
//        int dolog = 0;
//        for (int a = 0; a < half - 1; a++) {
//            for (int i = 0; i < half; i++) {
//                line = line + " ";
//                 dolog = half - 1;
//            }
//            for (int d = 0; d < dolog; d++) {
//                line = line + "*";
//                dolog = dolog - 1;
//            }
//            System.out.println(line);
//        }
        int[] numbers = {12,545,223232,-2,2132,765,7,8};

        for (int i=0;i<numbers.length-1;i++){
            for (int j=0;j<numbers.length-1;j++){
                int first = numbers[j];
                int second = numbers[j+1];
                if (first>second) {
                    numbers[j] = second;
                    numbers[j+1] = first;
                }
            }
        }

        System.out.println(Array.toString(numbers)) ;

    }
}

