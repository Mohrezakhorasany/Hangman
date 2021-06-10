package hu.ak_akademia.hangmanoop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextFileLoader {

	public String[] load(String fileName) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File(fileName));
		String[] loadedWordStrings = new String[countLinesInFile(fileName)];
		for (int i = 0; i < loadedWordStrings.length; i++) {
			loadedWordStrings[i] = scanner.nextLine();
		}
		scanner.close();
		return loadedWordStrings;
	}

	private int countLinesInFile(String pathOfTheFile) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File(pathOfTheFile));
		int counter = 0;
		while (scanner.hasNextLine()) {
			scanner.nextLine();
			counter++;
		}
		scanner.close();
		return counter;
	}

}
