package hu.ak_akademia.hangmanoop;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class HangmanGame {

	public static void main(String[] args) throws FileNotFoundException {
		TextFileLoader textFileLoader = new TextFileLoader();
		String[] allWords = textFileLoader.load("resources/words.txt");
		System.out.println(Arrays.toString(allWords));
		RandomWordGenerator randomWordGenerator = new RandomWordGenerator();
		String chosenWordString = randomWordGenerator.generate(allWords);
		Scanner scanner = new Scanner(System.in);
		UserInputManagement userInputManagement = new UserInputManagement(scanner);
		AlphabetRevealer alphabetRevealer = new AlphabetRevealer(chosenWordString);
		WronglyGuessedLetters wronglyGuessedLetters = new WronglyGuessedLetters(chosenWordString);
		while (!wronglyGuessedLetters.isLost() && !alphabetRevealer.isWon()) {
			System.out.println(alphabetRevealer);
			System.out.println();
			System.out.println(wronglyGuessedLetters);
			String gussedLetter = userInputManagement.getGuessedLetter()
					.toLowerCase();
			if (gussedLetter.equalsIgnoreCase("!")) {
				System.out.println("You can guess Full word now: ");
				String instantWin = userInputManagement.getGuessedLetter()
						.toLowerCase();
				if (instantWin.equalsIgnoreCase(chosenWordString) == true) {
					System.out.println("You correctly guessed word!");
					System.out.println("\nGood Bye!");
					System.exit(0);
				} else if (instantWin.equalsIgnoreCase(chosenWordString) == false) {
					System.out.println("you lost!");
					System.exit(0);
				}
			}
			alphabetRevealer.replace(gussedLetter);
			wronglyGuessedLetters.store(gussedLetter);
			HangmanDrawer hangmanDrawer = new HangmanDrawer(wronglyGuessedLetters.getCounter());
			hangmanDrawer.setCounter();
		}
		if (wronglyGuessedLetters.isLost()) {
			System.out.println("Sorry you Lost!");
		} else if (alphabetRevealer.isWon()) {
			System.out.println("Congrats!");
		}
	}
}
