package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner login = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String inputFromUser = login.nextLine();

        if (inputFromUser.equals("Manny")) ;
        {
            System.out.println("Hello " + inputFromUser);
        }


        //Math

        int mannysNumber = 100;
        mannysNumber = mannysNumber + 100;
        mannysNumber += 100; //Lines 23 and 22 do the same thing

        int addNumber = 100;
        addNumber = addNumber + 100;
        addNumber += 100; //Lines 27 and 26 do the same thing

        int minusNumber = 500;
        minusNumber = minusNumber - 100;
        minusNumber -= 100; //Lines 31 and 30 do the same thing

        int multiNumber = 100;
        multiNumber = multiNumber * 100;
        multiNumber *= 100; //Lines 35 and 34 do the same thing

        int divNumber = 10000
        divNumber = divNumber / 100;
        divNumber /= 100; // Lines 39 and 38 do the same thing

        System.out.println("Add:" + addNumber);
        System.out.println("Sub:" + minusNumber);
        System.out.println("Multiply: " + minusNumber);
        System.out.println("Division: " + minusNumber);

        int iteration = 1;
        iteration++; //Takes the iteration and adds 1
        iteration--; //Takes the iteration and subtracts 1

        int mod = 10;
        mod = mod % 3;
        System.out.println("Mod: " + mod);


    }
    }

