
public class PlayerComputer extends Player{
    private String[] possibleCodes;
    private int numPossibleCodes;

    public PlayerComputer() {
        possibleCodes = new String[5040]; // 5040 total combinations of 4 digit codes
        numPossibleCodes = 0;
        generatePossibleCodes();
    }


    //ensures a number isnt present moer than once
    private void generatePossibleCodes() {
        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                for (int k = j + 1; k < 10; k++) {
                    for (int l = k + 1; l < 10; l++) {
                        possibleCodes[numPossibleCodes++] = "" + i + j + k + l;
                    }
                }
            }
        }
    }

    @Override
    public String getGuesses() {
        int randomNumber = (int) (Math.random() * numPossibleCodes);
        String guess = possibleCodes[randomNumber];
        System.out.println("Computer guessed: " + guess);
        return guess;

    }

    @Override
    public void setSecretCode() {
        int randomCode = (int) (Math.random() * numPossibleCodes);
        secretCode = possibleCodes[randomCode];
    }

    @Override
    public void receiveGuess(String guess, int numBulls, int numCows) {
        // do nothing
    }

}





