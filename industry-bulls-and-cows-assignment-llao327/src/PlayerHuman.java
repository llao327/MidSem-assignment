import java.util.Scanner;

public class PlayerHuman extends Player{
    private Scanner s;
    public PlayerHuman() {
        s = new Scanner(System.in);
    }

    //ensures only valid secret code is inputted
    public void setSecretCode() {
        System.out.println("Please enter your 4 digit secret Code");
        secretCode = s.nextLine();
        if (secretCode.length() != 4) {
            System.out.println("Your secret code is not 4 digits!");
            System.out.println("Please try again");
            setSecretCode();
        }
    }
    //ensures only a valid guess is inputted
    public String getGuesses() {
        int i;
        String guess = "";
        boolean valid = true;
        do {
            System.out.println("Please enter your guess");
            guess = s.nextLine();
            if (guess.length() == 4) {
                for (i = 0; i < guess.length(); i++) {
                    if (!Character.isDigit(guess.charAt(i))) break;
                }
                if (i == 4) valid = false;
            }
        }
        while (valid);
        return guess;

    }
    public void receiveGuess(String guess, int numBulls, int numCows) {
        System.out.println("Result: " + numBulls + "bulls " + numCows + " cows");
    }

}
