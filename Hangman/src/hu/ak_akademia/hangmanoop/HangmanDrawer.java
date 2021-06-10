package hu.ak_akademia.hangmanoop;

public class HangmanDrawer {

	private int counter;

	public HangmanDrawer(int counter) {
		this.counter = counter;
	}

	public void setCounter() {
		switch (counter) {
		case 1:
			System.out.println("-----\r\n" + "|   |\r\n" + "|\r\n" + "|\r\n" + "|\r\n" + "|\r\n" + "|\r\n" + "|\r\n" + "|\r\n" + "--------");

			break;
		case 2:
			System.out.println("-----\r\n" + "|   |\r\n" + "|   0\r\n" + "|\r\n" + "|\r\n" + "|\r\n" + "|\r\n" + "|\r\n" + "|\r\n" + "--------");

			break;
		case 3:
			System.out.println("-----\r\n" + "|   |\r\n" + "|   0\r\n" + "|  -+-\r\n" + "|\r\n" + "|\r\n" + "|\r\n" + "|\r\n" + "|\r\n" + "--------");

			break;
		case 4:
			System.out.println("-----\r\n" + "|   |\r\n" + "|   0\r\n" + "| /-+-\r\n" + "|\r\n" + "|\r\n" + "|\r\n" + "|\r\n" + "|\r\n" + "--------");
			break;
		case 5:
			System.out.println("-----\r\n" + "|   |\r\n" + "|   0\r\n" + "| /-+-\\ \r\n" + "|\r\n" + "|\r\n" + "|\r\n" + "|\r\n" + "|\r\n" + "--------");
			break;
		case 6:
			System.out.println("-----\r\n" + "|   |\r\n" + "|   0\r\n" + "| /-+-\\ \r\n" + "|   | \r\n" + "|\r\n" + "|\r\n" + "|\r\n" + "|\r\n" + "--------");
			break;
		case 7:
			System.out.println("-----\r\n" + "|   |\r\n" + "|   0\r\n" + "| /-+-\\ \r\n" + "|   | \r\n" + "|   | \r\n" + "|\r\n" + "|\r\n" + "|\r\n" + "--------");
			break;
		case 8:
			System.out.println("-----\r\n" + "|   |\r\n" + "|   0\r\n" + "| /-+-\\ \r\n" + "|   | \r\n" + "|   | \r\n" + "|  |\r\n" + "|\r\n" + "|\r\n" + "--------");
			break;
		case 9:
			System.out.println("-----\r\n" + "|   |\r\n" + "|   0\r\n" + "| /-+-\\ \r\n" + "|   | \r\n" + "|   | \r\n" + "|  | | \r\n" + "|  | | \r\n" + "|\r\n" + "--------");
			break;
		case 10:
			System.out.println("-----\r\n" + "|   |\r\n" + "|   0\r\n" + "| /-+-\\ \r\n" + "|   | \r\n" + "|   | \r\n" + "|  | | \r\n" + "|  | | \r\n" + "|\r\n" + "--------");
			break;

		}
	}
}
