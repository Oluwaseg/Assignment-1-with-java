package org.example;

import java.util.Scanner;

public class TerminalApp {
    public void promptUser(){
        System.out.println("Welcome To Npm Enter a command");
        Scanner scanner = new Scanner(System.in);
        String command = scanner.next();

        if(command.equals("create_cra")){
            System.out.println("Creating a Create React App project...");
            System.out.println("New React App created successfully!");
        } else {
            System.out.println("Command Not Recognized");
        }
    }
}
