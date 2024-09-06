package org.example;

import java.util.Scanner;

public class MtnApp {

    public void promptUser(){
        //displaying choice
        System.out.println("Welcome to MTN. select a service to continue");
        System.out.println("1. Buy Data");
        System.out.println("2. Buy Call Credit");
        System.out.println("3. Exit");

        //accepting user for input
        Scanner serviceScanner = new Scanner(System.in);
        int serviceOption = serviceScanner.nextInt();

        //performing logic's on the user's input
        if(serviceOption == 3){ //user wants to exist
            System.out.println("Have a nice day");
        }else if(serviceOption == 2){
            System.out.println("How much Call Credit do you need?");

            Scanner scanner = new Scanner(System.in);
            int creditAmount = scanner.nextInt();
            System.out.println("Thanks for patronizing. You have received ₦"+ creditAmount);
        }else if(serviceOption == 1){

            System.out.println("How Much Data Do You want to buy");
            System.out.println("1. ₦200 for 1.5GB");
            System.out.println("2. ₦500 for 2GB");
            System.out.println("3. ₦1000 for 3GB");
            System.out.println("4. ₦1500 for 7GB");

            Scanner optionScanner = new Scanner(System.in);
            int dataOption = optionScanner.nextInt();

            System.out.println("Thanks for your patronage. You'll receive your data shortly");

        }else {

            System.out.println("You Entered And Invalid Option. Bye Bye");
        }
    }
}
