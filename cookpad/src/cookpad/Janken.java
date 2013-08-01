package cookpad;

import java.util.Scanner;

public class Janken {
	public static void main(String[] args) {
		Janken janken = new Janken();
		janken.main();
	}

	public void main() {
		String str;
		Scanner scan = new Scanner(System.in);

		System.out.println("Ç∂Ç·ÇÒÇØÇÒÇµÇ‹ÇµÇÂÇ§ÅI");

		char[] mine = new char[30];
		char[] yours = new char[30];
		boolean[] check = new boolean[yours.length];

		str = scan.next();
		yours = str.toCharArray();

		mine[0] = 'G';

		for (int i = 0; i < yours.length; i++) {
			if ((mine[i] == 'G' && yours[i] == 'T')
					|| (mine[i] == 'T' && yours[i] == 'P')
					|| (mine[i] == 'P' && yours[i] == 'G')) {
				check[i] = true;
			} else {
				check[i] = false;
			}

			if (check[i] == true) {
				mine[i + 1] = mine[i];
			} else if (check[i] == false) {
				if (mine[i] == 'G') {
					mine[i + 1] = 'P';
				} else if (mine[i] == 'T') {
					mine[i + 1] = 'G';
				} else if (mine[i] == 'P') {
					mine[i + 1] = 'T';
				}
			}
			System.out.print(mine[i]);
		}
	}
}
