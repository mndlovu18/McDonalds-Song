package com.company;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class Main {


        public static void main(String[] args) {
            Scanner input = new Scanner(System.in); //Create a a new Scanner instance
            System.out.println("How many animals are at McDonald's Farm?");
            int animalNumber = input.nextInt(); //read the users' input from the console on the number of animals
            input.nextLine();
            String[] animal = new String[animalNumber];
            String[] animalSound = new String[animalNumber];

            //loop to prompt the user for the animal and its corresponding sound
            for(int i = 0; i < animalNumber; i++){
                System.out.println("Enter an animal:");
                animal[i] = input.nextLine();
                System.out.println("What sound does the " + animal[i] + "");
                animalSound[i] = input.nextLine();
            }

            System.out.println(" ");
            int count = 0;
            for (int i =0; i < animalNumber; i++){
                if(count < 1) {
                    showSong(animal[i], animalSound[i]);
                } else {
                    oldMcLine();
                    animalLine(animal[i]);
                    for(int j = 0; j <= count ; j++){
                        soundLines(animalSound[i - j]);
                    }
                    oldMcLine();
                }

                count ++;
            }

            System.out.println(" ");
            eio();
        }

        public static void showSong(String animal, String animalSound){

            oldMcLine(); // prints the initial line of the verse, and calls eio()
            animalLine(animal); // prints the "And on that farm he had a ... " line, and calls eio()
            soundLines(animalSound); // prints the "With a..." and the "Here a..." lines
            oldMcLine();
            System.out.println(" ");
        }
        public static void eio(){
            System.out.println("E-I-E-I-O!");
        }
        public static void oldMcLine(){
            System.out.println( "Old MacDonald had a farm,");
            eio();
        }

        public static void animalLine(String name){
            System.out.println( "And on that farm he had a " + name + ",");
            eio();
        }
        public static void soundLines(String sound){
            System.out.println(  "With a " + sound + "-" + sound +  " here, and a " + sound + "-" + sound + " there," + "\n" +
                    "Here a " + sound + ", there a " + sound + ", everywhere a " + sound + "-" + sound + ",");
        }

    }
























