package ru.pelmegov.mentor;

import java.util.Scanner;

// Hello,
// you need to create the game Rock-Paper-Scissors
// the classical rules : https://en.wikipedia.org/wiki/Rock–paper–scissors

public class RockPaperScissors {

    public static void main(String[] args) {
        boolean continueGame = true;

        while (continueGame) {
            int userChoose = userInput();
            int computerChoose = computerChoose();

            boolean isUserWin = runGame(userChoose, computerChoose);

            // print now who winner!
            if (isUserWin) {

            } else {

            }

            continueGame = repeatGame();
        }
    }

    private static int userInput() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter: 0 - Rock; 1 - Paper; 2 - Scissors");
        return reader.nextInt();
    }

    private static int computerChoose() {
        // put logic into this method
        return 0;
    }

    private static boolean runGame(int userChoose, int computerChoose) {
        // put logic into this method
        return false;
    }

    private static boolean repeatGame() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Repeat game? 0 - no; 1 - yes;");
        return reader.nextInt() == 1;
    }

}
