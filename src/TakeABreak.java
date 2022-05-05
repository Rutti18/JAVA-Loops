import java.util.Scanner;

public class TakeABreak {

	public static void main(String args[]) {
		Scanner scanObj = new Scanner(System.in);
		String input = null;
		
		do {
			System.out.println("Do you want to take a break?");
			input = scanObj.nextLine(); 
		}while (!input.equals("yes"));
	}
}
