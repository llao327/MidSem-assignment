import java.util.Scanner;

public class BullsandCows {
    public static void main(String[] args) {
        //Welcome and Rules of Game
        System.out.println("Welcome to Bulls and Cows");
        System.out.println("=========================");
        System.out.println("Please enter your name");
        Scanner s = new Scanner(System.in);
        String playerName = s.nextLine();
        System.out.println("Welcome " + playerName);
        System.out.println("The rules of the game are as follows:");
        System.out.println("=====================================");
        System.out.println("You vs against a computer of desired difficulty");
        System.out.println("Both create a secret code consisting of a 4 digit number");
        System.out.println("Where the secret code cannot contain more than one of a certain number");
        System.out.println("You then take turns with the computer to crack each others secret code");
        System.out.println("For each guess you will be given a hint such as a \"bulls\" and \"cows\"");
        System.out.println("Whereby a bull corresponds to a correct number in the correct place");
        System.out.println("And a cow corresponding to a correct number in the wrong place");
        System.out.println("You and the computer only gets 7 chances to guess each others secret code");
        System.out.println("Good luck! " + playerName);
        System.out.println("=====================================");
        System.out.println("=====================================");
        System.out.println("=====================================");

        Game g = new Game();
        g.playGame();

    }
}

