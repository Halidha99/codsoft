import java.util.Random;
//import java.util.Scanner;

import javax.swing.JOptionPane;

public class NumberGame{
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int maxNumber=100;
        int minNumber=1;
        int attemptsLimit = 05;
        int rounds = 0;
        int totalAttempts = 0;

        
    JOptionPane.showMessageDialog(null, "Welcome to the Number Guessing Game!");

        do {
            int targetNumber = random.nextInt(maxNumber- minNumber+ 1) + minNumber;
            int attempts = 0;

            JOptionPane.showMessageDialog(null, "Round " + (rounds + 1) + ": Guess the number between " + minNumber+ " and " + maxNumber);

            while (attempts < attemptsLimit) {
                String userGuessString = JOptionPane.showInputDialog("Enter your guess:");
                int userGuess = Integer.parseInt(userGuessString);
                attempts++;
                totalAttempts++;

                if (userGuess == targetNumber) {
                    JOptionPane.showMessageDialog(null, "Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    break;
                } else if (userGuess < targetNumber) {
                    JOptionPane.showMessageDialog(null, "Too low! Try again.");
                } else {
                    JOptionPane.showMessageDialog(null, "Too high! Try again.");
                }

                if (attempts == attemptsLimit) {
                    JOptionPane.showMessageDialog(null, "Sorry, you've reached the maximum number of attempts. The correct number was: " + targetNumber);
                }
            }

            int option = JOptionPane.showConfirmDialog(null, "Do you want to play again?", "Play Again", JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.YES_OPTION) {
                rounds++;
            } else {
                JOptionPane.showMessageDialog(null, "Thanks for playing! Your total score is based on the total attempts: " + totalAttempts);
                break;
            }

        } while (true);
    }
    
}