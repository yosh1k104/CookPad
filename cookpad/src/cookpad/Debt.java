package cookpad;

public class Debt {
	public static void main(String[] args) {
		Debt debt = new Debt();
		debt.main(args[0], args[1]);
	}

	public void main(String arg1, String arg2) {
		int total;
		int payment;
		int interest;

		total = Integer.parseInt(arg1);
		payment = Integer.parseInt(arg2);

		System.out.println(total + payment);

		System.out.println(result());
	}

	int result() {
		int month = 0;

		return month;
	}
}
