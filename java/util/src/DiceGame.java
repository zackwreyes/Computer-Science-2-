import java.util.Scanner;
public class DiceGame {

	public static void main(String[] args) {
	System.out.println("You are playing the dice game, you start out with 5 dice. \n"
			+ "If the dice rolls 2 or 5 it takes a dice away until you have no more dice to roll.\n"
			+ "At the end of the game you get a total of all your dice added up.\n");
	System.out.println("Would you like to play? (1 = yes/2 = no)");
	
	//Ask for user input
	Scanner scanner = new Scanner(System.in);
	int play = scanner.nextInt();
	
	if(play == 1) {
	
		
		int[] dicearray = new int [5];
		
		dicearray[0] = (int) (Math.random()*6 + 1);
		dicearray[1] = (int) (Math.random()*6 + 1);
		dicearray[2] = (int) (Math.random()*6 + 1);
		dicearray[3] = (int) (Math.random()*6 + 1);
		dicearray[4] = (int) (Math.random() *6 + 1);
	
		
	
		for(int dicenumber = 5; dicenumber >= 0; dicenumber--) {
			int dicecount = 5;
			
			if(dicecount >= 1) {
		switch(dicenumber) {
		
		case 0:
			if(dicearray[0] == 2 || dicearray[0] == 5) {
				System.out.println("the dice hit a mud number");
				dicecount = dicenumber - 1;
				break;
			}
			else {
				System.out.println("dice number is " + dicearray[0]);
				break;
			}
			
		case 1:
			if(dicearray[1] == 2 || dicearray[1] == 5) {
				System.out.println("the dice hit a mud number");
				dicecount = dicenumber - 1;
				break;
			}
			else {
				System.out.println("dice number is " + dicearray[1]);
				break;
			}
			
		case 2:
			if(dicearray[2] == 2 || dicearray[2] == 5) {
				System.out.println("the dice hit a mud number");
				dicecount = dicenumber - 1;
				break;
			}
			else {
				System.out.println("dice number is " + dicearray[2]);
				break;			
			}
		case 3:
			if(dicearray[3] == 2 || dicearray[3] == 5) {
				System.out.println("the dice hit a mud number");
				dicecount = dicenumber - 1;
				break;
			}
			else {
				System.out.println("dice number is " + dicearray[3]);
				break;
			}
		case 4:	
			if(dicearray[4] == 2 || dicearray[4] == 5) {
				System.out.println("the dice hit a mud number");
				dicecount = dicenumber - 1;
				break;
			}
			else {
				System.out.println("dice number is " + dicearray[4]);
				break;
			}
		} 
			}
			else {
				System.out.println("no more dice");
			}
		
		//end of for loop	
		}
	
	}
	else  {
		System.out.println("Thanks try again sometime else.");
	}
	
}
}



//floress2@student.swosu.edu