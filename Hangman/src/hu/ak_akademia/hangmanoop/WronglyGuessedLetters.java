package hu.ak_akademia.hangmanoop;

import java.util.Arrays;

public class WronglyGuessedLetters {
	private String[] letters;
	private int counter;
	private String randomlyGeneratedWord;

	public WronglyGuessedLetters(String randomlyGeneratedWord) {
		this.randomlyGeneratedWord = randomlyGeneratedWord;
		letters = new String[10];
	}

	public void store(String letter) {
		if (!Arrays.asList(letters)
				.contains(letter)) {
			if (!randomlyGeneratedWord.contains(letter)) {
				letters[counter] = letter;
				counter++;
			}
		}
	}

	public boolean isLost() {
		if (counter >= 10) {
			return true;
		}
		return false;
	}

	public int getCounter() {
		return counter;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Incorrect gusses: ");
		for (int i = 0; i < counter; i++) {
			builder.append(letters[i])
					.append(" ");
		}
		return builder.toString();
	}

}
