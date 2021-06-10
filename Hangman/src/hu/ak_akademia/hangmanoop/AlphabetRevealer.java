package hu.ak_akademia.hangmanoop;

public class AlphabetRevealer {
	private String partiallyRevealedWord;
	private String totallyRevealedWord;

	public AlphabetRevealer(String totallyRevealedWord) {
		this.totallyRevealedWord = totallyRevealedWord;
		String temp = "";
		for (int i = 0; i < totallyRevealedWord.length(); i++) {
			if (totallyRevealedWord.charAt(i) == '-' || totallyRevealedWord.charAt(i) == ' ') {
				temp += totallyRevealedWord.charAt(i);
				temp += " ";
			} else {
				temp += "_ ";
			}
		}
		partiallyRevealedWord = temp;
	}

	public boolean replace(String guessedLetter) {
		char[] partiallyRevealedWordCharArray = partiallyRevealedWord.toCharArray();
		if (totallyRevealedWord.contains(guessedLetter)) {
			int index = totallyRevealedWord.indexOf(guessedLetter);
			while (index >= 0) {
				partiallyRevealedWordCharArray[index * 2] = guessedLetter.charAt(0);
				index = totallyRevealedWord.indexOf(guessedLetter, index + 1);
			}
			partiallyRevealedWord = new String(partiallyRevealedWordCharArray);
			return true;
		}
		return false;
	}

	public boolean isWon() {
		if (partiallyRevealedWord.contains("_")) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return partiallyRevealedWord;
	}
}
