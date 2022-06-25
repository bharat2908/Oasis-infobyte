import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int computerNumber = 0;
		int guess = 0;
		int chances = 4;
		int win = 0;
		int lost = 0;
		
		// will show the begning status
		//System.out.println("chances :"+chances+ " , win : "+win+",lost :"+lost);
		System.out.println("You have 3 total chances");
		System.out.println("chances :" +chances);
		System.out.println("win :" +win);
		System.out.println("lost:" +lost);
		System.out.println("-----------------------------------------------------");
		while(chances > 0 && win < 5) {
			
			// 1_Computer generated number
			computerNumber = r.nextInt(100)+1;
			
			// 2_ Ask user to input a number
			System.out.println("Please Enter a number between 1 to 100=("+computerNumber+")" );
				// 3_take user input
			guess = sc.nextInt();
			
			// 4_match the input and updates the status
			
			if(guess==computerNumber) {
				win++;
				chances++;
				System.out.println("Congo congo!!..you got right number");
			}
			else {
				{
					lost++;
					chances--;
					
					if(computerNumber >guess) {
						System.out.println("The number was grater than yours!!");
					}else {
						System.out.println("The number was less than yours!!");
					}
				}
				// 5_show the latest status
				//System.out.println("chances :"+chances+ " , win : "+win+",lost :"+lost);
				System.out.println("chances :" +chances);
				System.out.println("win :" +win);
				System.out.println("lost:" +lost);
				System.out.println("-----------------------------------------------------");
			}
			if (win>=5) {
				System.out.println("Congratulations : You won the "+win+" game");
				
			}
			else {
				System.out.println("Oops : You lost the "+lost+" game");
			}			
		}
	}

}
