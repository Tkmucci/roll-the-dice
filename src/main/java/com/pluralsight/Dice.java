package com.pluralsight;

//Dice Class
public class Dice {

    //Main Method
    public static void main(String[] args) {

        //an instance of Dice named dice
        Dice dice = new Dice();

        //Declaration of my variables
        int counterTwo = 0;

        int counterFour = 0;

        int counterSix = 0;

        int counterSeven = 0;

        int sum;

        int i;


        //a loop that executes a hundred times
        for (i = 1; i < 100; i++) {

            //integer variables for roll1 and roll2
            int roll1 = dice.roll();
            int roll2 = dice.roll();

            //sum that adds the two rolls together
            sum = roll1 + roll2;

            System.out.println("Roll 1: " + roll1 + " + " + roll2 + " Sum: " + sum);

//        System.out.println("Roll 2: " + roll2);


            //if/else statement that
            if (sum == 2) {


                counterTwo++;
//                System.out.println("Counter Two: " + counterTwo);

            } else if (sum == 4) {


                counterFour++;
                //               System.out.println("Counter Four: " + counterFour);


            } else if (sum == 6) {


                counterSix++;
                //               System.out.println("Counter Six: " + counterSix);

            } else if (sum == 7) {


                counterSeven++;
//                System.out.println("Counter Seven: " + counterSeven);

            }


        }
        //Print function that prints out the count
        System.out.printf("""
                \n
                Total rolls: %d
                Counter Two: %d
                Counter Four: %d
                Counter Six: %d
                Counter Seven: %d
                """, i, counterTwo, counterFour, counterSix, counterSeven);
    }


    //roll method that generates a random number between 1 and 6
    public static int roll() {

        return (int) (Math.random() * 6) + 1;
    }
}
