public abstract class Player {
    protected String secretCode;
    public abstract void setSecretCode();
    public abstract String getGuesses();
    public abstract void receiveGuess(String guess, int numBulls, int numCows);


}
