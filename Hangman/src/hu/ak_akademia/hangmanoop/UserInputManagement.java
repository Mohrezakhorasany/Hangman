package hu.ak_akademia.hangmanoop;

import java.util.Scanner;

public class UserInputManagement {
	private Scanner scanner;

	public UserInputManagement(Scanner scanner) {
		this.scanner = scanner;
	}

	public String getGuessedLetter() {
		return scanner.nextLine();

	}
}
