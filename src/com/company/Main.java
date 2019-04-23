package com.company;

import java.util.Collections;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Creates an ArrayList that can hold Integers, and fills each slot with a different random value from 1-50. Display
 * those values on the screen, and then prompt the user for an integer. Search through the ArrayList, and if the item
 * is present, say so. It is not necessary to display anything if the value was not found. If the item is in the
 * ArrayList multiple times, it's okay if the program prints the message more than once.
 */
public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int input = 0;
        Random random = new Random();
        ArrayList<Integer> intList = new ArrayList<Integer>();

        for(int i = 0; i < 50; i++) {
            //generate random number between 1-50
            intList.add(random.ints(1,50).findFirst().getAsInt());
        }
        //print the integer arraylist
        System.out.println("" +intList.toString());

        System.out.print("Value to find: ");

        input = keyboard.nextInt();
        //Search for this number in intList
        try {
            if(intList.contains(input)) {
                System.out.println(+input +" is in Arraylist");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        //Return random element from arraylist
        Collections.shuffle(intList);
        System.out.println("This is a random number from list: " +
        ((intList.size() != 0 ? +intList.get(1): "List is empty")));
    }
}
