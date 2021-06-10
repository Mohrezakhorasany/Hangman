package hu.ak_akademia.hangmanoop;

import java.util.Random;

public class RandomWordGenerator {

	public String generate(String[] wordsToChooseFrom) {
		Random random = new Random();
		int index = random.nextInt(wordsToChooseFrom.length);
		return wordsToChooseFrom[index];
	}
}
