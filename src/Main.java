import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean done = false; // Flag to control the input validation loop
        String playerAGuess = "";
        String playerBGuess = "";

        // Input validation loop for player A's guess
        do {
            System.out.print("Player A, pick Rock, Paper, or Scissors (R, P, S): ");
            playerAGuess = in.nextLine(); // Read the input and convert it to lowercase
            if (playerAGuess.equalsIgnoreCase("r") || playerAGuess.equalsIgnoreCase("p") || playerAGuess.equalsIgnoreCase("s")) {
                done = true; // Exit the loop since valid input is received
            } else {
                System.out.println("\nInvalid input. Please enter either R, P, or S.");
            }
        } while (!done); // Continue looping until valid input is received

        done = false; // Reset the flag for player B's guess

        // Input validation loop for player B's guess
        do {
            System.out.print("Player B, pick Rock, Paper, or Scissors (R, P, S): ");
            playerBGuess = in.nextLine(); // Read the input and convert it to lowercase
            if (playerBGuess.equalsIgnoreCase("r") || playerBGuess.equalsIgnoreCase("p") || playerBGuess.equalsIgnoreCase("s")) {
                done = true; // Exit the loop since valid input is received
            } else {
                System.out.println("\nInvalid input. Please enter either R, P, or S.");
            }
        } while (!done); // Continue looping until valid input is received

        // Determine the winner
        if (playerAGuess.equals(playerBGuess)) {
            System.out.println("It's a tie!");
        } else if (playerAGuess.equals("r") && playerBGuess.equals("s") ||
                playerAGuess.equals("p") && playerBGuess.equals("r") ||
                playerAGuess.equals("s") && playerBGuess.equals("p")) {
            System.out.println("Player A wins!");
        } else {
            System.out.println("Player B wins!");
        }
    }
}
