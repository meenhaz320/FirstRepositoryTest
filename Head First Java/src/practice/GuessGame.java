package practice;

public class GuessGame {

Player p1;
Player p2;
Player p3;

public void startGame() {
	
p1 = new Player();
p2 = new Player();
p3 = new Player();
	
boolean player1right = false;
boolean player2right = false;
boolean player3right = false;

int guess1 = 0;
int guess2 = 0;
int guess3 = 0;

int rightNumber = (int) (Math.random() *10);
	System.out.println("I'm thinking of a number between 0 and 9...");
	System.out.println("Number to guess is "+ rightNumber);
	
	
	while(true) {
	
		p1.guess();
		p2.guess();
		p3.guess();
	
	guess1 = p1.number;
	System.out.println("Player one guessed "+guess1);
	
	guess2 = p2.number;
	System.out.println("Player two guessed "+guess2);
	
	guess3 = p3.number;
	System.out.println("Player three guessed "+guess3);
	
	if(guess3 == rightNumber || guess2 == rightNumber || guess3 == rightNumber) {
	
		System.out.println("You got it");
		System.out.println("Game is over");
		break;
	} else {
		
	
	System.out.println("Please try again");	 
	}
} 
	
}
}


