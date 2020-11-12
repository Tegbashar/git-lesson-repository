package com.greenfoxacademy;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // Készít egy scanner-t
        Scanner scanner = new Scanner(System.in);

        // A program megáll és vár a felhasználói input-ra, illetve utána az enter megnyomására
        String userInput1 = scanner.nextLine();

        // Utána kiírja a felhasználó által beírt sor egészét
        System.out.println(userInput1);

        }
}
