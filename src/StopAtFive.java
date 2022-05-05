import java.util.Scanner;

public class StopAtFive {
	public static void main(String args[]) {
		Scanner scanObj = new Scanner(System.in);
		int input = 0;
		
		do {
			System.out.println("Give a number:");
			input = scanObj.nextInt();
		}while (input != 5);
		
		System.out.println("Process finished with exit code 0");
	}
}