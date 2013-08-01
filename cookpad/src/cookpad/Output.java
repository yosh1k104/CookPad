package cookpad;

import java.util.Scanner;

public class Output {
	public static void main(String[] args) {
		Output output = new Output();
		output.main();
	}

	public void main() {
		String baseWords;
		Scanner scan = new Scanner(System.in);

		System.out.println("•¶Žš‚ð“ü—Í‚µ‚Ä‰º‚³‚¢!");

		char[] letters = new char[30];
		boolean[] check = new boolean[letters.length];
		baseWords = scan.next();

		letters = baseWords.toCharArray();

		for (int i = 0; i < check.length; i++) {
			check[i] = true;
		}

		for (int i = 0; i < letters.length; i++) {
			for (int j = i + 1; j < letters.length; j++) {
				if (letters[i] == letters[j]) {
					check[i] = false;
					check[j] = false;
					break;
				}
			}
		}

		for (int i = 0; i < check.length; i++) {
			if (check[i] == true) {
				System.out.println(letters[i]);
				break;
			}
		}
	}
}
