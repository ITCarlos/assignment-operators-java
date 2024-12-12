import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int minutes = input.nextInt();
		
		double bill = 50.0;
		if (minutes > 100) {
			// bill = bill + (minutes - 100) * 2;
			bill += (minutes - 100) * 2;
			System.out.printf("Bill $%.2f\n", bill);
		}
		else {
			System.out.printf("Bill: $%.2f\n", bill);
		}
		
		input.close();

	}

}
