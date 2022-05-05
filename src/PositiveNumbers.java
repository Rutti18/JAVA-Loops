import java.util.Scanner;

public class PositiveNumbers {
	public static void main(String args[]) {
		Scanner scanObj = new Scanner(System.in);
		int number = 0;
		
		do {
			System.out.println("Enter a number:");
			number = scanObj.nextInt();
			
			if (number < 0 ) {
				System.out.println("Number must be a positive number");	
			}else if(number > 0){
				System.out.println("Number is "+number);
			}
		}while (number != 0);
		
		System.out.println("Process finished with exit code 0");
	}
}