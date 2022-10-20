package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );

        System.out.println( "what is your question" );
        scanner.next();

        Random rd = new Random();
        boolean booleanAnswer = rd.nextBoolean();
        if (booleanAnswer) {
            System.out.println( "yes!" );
        } else {
            System.out.println( "no" );
        }
    }
}
