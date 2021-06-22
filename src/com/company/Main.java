package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int money = 1000; //Set original $ to 1000
        int r; //Declare variable for random number of horse to proceed
        int races = 0; //Set total races to 0
        int garfwins = 0; //Set Garfield's score to 0
        int shaunwins = 0; //Set Shaun's score to 0
        int chestwins = 0; //Set Chester's score to 0
        int garf; //Declare Garfield's progress variable
        int shaun; //Declare Shaun's progress variable
        int chest; //Declare Chester's progress variable
        String response; //Declare variable to get input on continuing game
        String horse; //Declare variable to get input on horse
        String track = "------------";
        String trackgarf;
        String trackshaun;
        String trackchest;
        int bet = 0;
        do {
            garf = 0;
            shaun = 0;
            chest = 0;
            System.out.print ("You have $"+money+"\n");
            System.out.print ("Hi, which horse would you like to bet on?\n");
            System.out.print ("a. Garfield ("+garfwins+"/"+races+")\n");
            System.out.print ("b. Shaun ("+shaunwins+"/"+races+")\n");
            System.out.print ("c. Chester ("+chestwins+"/"+races+")\n");
            horse = input.next();
            System.out.print ("How much do you want to bet?\n");
            bet = input.nextInt();
            if (bet <= 0) {
                System.out.print ("Invalid bet.\n");
            }
            else {
                while (garf<12 && shaun<12 && chest<12){
                    r = (int) (Math.random()*3+1);
                    if (r == 1) {
                        garf++;
                    } else if (r == 2) {
                        shaun++;
                    } else if (r == 3) {
                        chest++;
                    }
                    System.out.print ("\n\n\n\n\n\n\n\n\n\n\n\n");
                    trackgarf = track.substring(0, garf)+"1"; //Get Garf's progress on track
                    trackshaun = track.substring(0, shaun)+"1"; //Get Shaun's progress on track
                    trackchest = track.substring(0, chest)+"1"; //Get Chester's progress on track
                    System.out.print (trackgarf+"\n");
                    System.out.print (trackshaun+"\n");
                    System.out.print (trackchest+"\n");
                    System.out.print ("GAR:"+garf+"\nSHA:"+shaun+"\nCHE:"+chest+"\n");
                    try {
                        Thread.sleep(1000L);
                    }
                    catch (Exception j) {}
                }
            }
            if (garf == 12 && horse == "a") {
                System.out.print ("You earned $"+(2*bet));
                money = money + (2 * bet);
                System.out.print ("Total balance: $"+money);
            } else if (shaun == 12 && horse == "b") {
                System.out.print ("You earned $"+(2*bet));
                money = money + (2 * bet);
                System.out.print ("Total balance: $"+money);
            } else if (chest == 12 && horse == "c") {
                System.out.print ("You earned $"+(2*bet));
                money = money + (2 * bet);
                System.out.print ("Total balance: $"+money);
            }
            System.out.print ("Play again?\n");
            response = input.next();

        } while (money >= 0 && (response.equals("Yes")||response.equals("yes")));
        input.close();
    }
}





