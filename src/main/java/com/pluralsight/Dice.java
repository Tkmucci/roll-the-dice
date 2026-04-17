package com.pluralsight;

public class Dice {

    public static void main(String[] args) {

        Dice dice = new Dice();

        int counterTwo = 0;

        int counterFour = 0;

        int counterSix = 0;

        int counterSeven = 0;

        int sum = 0;


//        roll();
        int i = 0;

        for (i = 1; i < 100; i++) {

            int roll1 = dice.roll();
            int roll2 = dice.roll();

            sum = roll1 + roll2;

            System.out.println("Roll 1: " + roll1 + " + " + roll2 + " Sum: " + sum);

//        System.out.println("Roll 2: " + roll2);


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
        System.out.printf("""
                    \n
                    Total rolls: %d
                    Counter Two: %d
                    Counter Four: %d
                    Counter Six: %d
                    Counter Seven: %d
                    """, i, counterTwo, counterFour, counterSix, counterSeven);
    }


    public static int roll() {

        int diceroll = (int) (Math.random() * 6) + 1;

        return diceroll;
    }
}
