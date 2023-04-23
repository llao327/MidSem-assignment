import java.util.Scanner;

public class Game {
    private Player playerHuman;
    private Player playerComputer;
    private int numGuesses;
    private final int MAX_GUESSES = 7;

    public Game() {
        playerHuman = new PlayerHuman();
        playerComputer = new PlayerComputer();
        numGuesses = 0;
    }

    public void playGame() {
        // player and computer create their code
        playerHuman.setSecretCode();
        playerComputer.setSecretCode();

        // player and computer guess codes
        while (numGuesses < MAX_GUESSES) {
            // player guesses computer's code
            String HGuess = playerHuman.getGuesses();

            int HNumBulls = getNumBulls(HGuess, playerComputer.secretCode);
            int HNumCows = getNumCows(HGuess, playerComputer.secretCode);
            playerHuman.receiveGuess(HGuess, HNumBulls, HNumCows);

            if (HNumBulls == 4) {
                System.out.print("Congratulations, you won!! :D");
                return;
            }

            // computer guesses player's code
            String CGuess = playerComputer.getGuesses();
            int CNumBulls = getNumBulls(CGuess, playerHuman.secretCode);
            int CNumCows = getNumCows(CGuess, playerHuman.secretCode);
            System.out.println("Bulls: " + CNumBulls + " Cows: " + CNumCows);
            playerComputer.receiveGuess(CGuess, CNumBulls, CNumCows);
            if (CNumBulls == 4) {
                System.out.print("Better luck next time :c ");
                return;
            }

            numGuesses++;
        }
        System.out.println("You ran out of guesses, :c");
        System.out.println("Better luck next time :c");
    }

    private int getNumBulls(String guess, String code) {
        int numBulls = 0;
        for (int i = 0; i < 4; i++) {
            if (guess.charAt(i) == code.charAt(i)) {
                numBulls++;
            }
        }
        return numBulls;
    }

    private int getNumCows(String guess, String code) {
        int numCows = 0;
        for (int i = 0; i < 4; i++) {
            if (guess.charAt(i) != code.charAt(i) && code.indexOf(guess.charAt(i)) >= 0) {
                numCows++;
            }
        }
        return numCows;
    }
}

