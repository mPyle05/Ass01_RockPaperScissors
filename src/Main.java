import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean playAgain = true; // Flag to control whether to play the game again

        while (playAgain) {
            // Get player A's choice
            String playerAGuess = getPlayerGuess(in, "Player A");

            // Get player B's choice
            String playerBGuess = getPlayerGuess(in, "Player B");

            // Determine the winner and display the result
            String result = determineWinner(playerAGuess, playerBGuess);
            System.out.println(result);

            // Prompt the user to play again
            System.out.print("Do you want to play again? (Y/N): ");
            String playAgainInput = in.nextLine();
            playAgain = playAgainInput.equalsIgnoreCase("Y");
        }

        System.out.println("Thanks for playing!");
    }

    // Method to get a player's guess
    private static String getPlayerGuess(Scanner in, String player) {
        boolean done = false; // Flag to control the input validation loop
        String guess = "";

        // Input validation loop for the player's guess
        do {
            System.out.print(player + ", pick Rock, Paper, or Scissors (R, P, S): ");
            guess = in.nextLine(); // Read the input and convert it to lowercase
            if (guess.equalsIgnoreCase("r") || guess.equalsIgnoreCase("p") || guess.equalsIgnoreCase("s")) {
                done = true; // Exit the loop since valid input is received
            } else {
                System.out.println("\nInvalid input. Please enter either R, P, or S.");
            }
        } while (!done); // Continue looping until valid input is received

        return guess;
    }

    // Method to determine the winner and display the result
    private static String determineWinner(String playerAGuess, String playerBGuess) {
        String result = "";

        if (playerAGuess.equals("r") && playerBGuess.equals("r")) {
            result = "Rock vs Rock it’s a Tie!";
        } else if (playerAGuess.equals("p") && playerBGuess.equals("p")) {
            result = "Paper vs Paper it’s a Tie!";
        } else if (playerAGuess.equals("s") && playerBGuess.equals("s")) {
            result = "Scissors vs Scissors it’s a Tie!";
        } else if (playerAGuess.equals("r") && playerBGuess.equals("s")) {
            result = "Rock breaks Scissors. Player A wins!";
        } else if (playerAGuess.equals("p") && playerBGuess.equals("r")) {
            result = "Paper covers Rock. Player A wins!";
        } else if (playerAGuess.equals("s") && playerBGuess.equals("p")) {
            result = "Scissors cuts Paper. Player A wins!";
        } else if (playerBGuess.equals("r") && playerAGuess.equals("s")) {
            result = "Rock breaks Scissors. Player B wins!";
        } else if (playerBGuess.equals("p") && playerAGuess.equals("r")) {
            result = "Paper covers Rock. Player B wins!";
        } else if (playerBGuess.equals("s") && playerAGuess.equals("p")) {
            result = "Scissors cuts Paper. Player B wins!";
        }

        return result;
    }
}
