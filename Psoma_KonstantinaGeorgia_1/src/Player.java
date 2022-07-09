import java.util.Scanner;
import java.util.Random;

public class Player {
	private int card;
	private String answer;
	
	public int Cards() {
		Random rand = new Random();
		
		do {
			card = rand.nextInt(12);
		}while(card < 2 || card > 11);
		
		return card;
	} // end of Cards
	
	public int Total(int card1, int card2) {
		
		return card1 + card2;
	} // end of Total
	
	public int Game(int total) {
		int card1;
		
		answer = Answer();
		
		while(answer.equals("hit") && total < 21) {
			
			Player card = new Player();
			card1 = card.Cards();
			
			System.out.println("You drew a " + card1 + ".");
			
			total = Total_Add(total, card1);
			
			System.out.println("Your total is " + total);
			
			if(total < 21) { 
				answer = Answer();
			}
			
		}
		
		if(total > 21) {
			return 0;
		}
		else {
			return total;
		}
		
	} // end of Game
	
	public String Answer() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Would you like to “hit” or “stay”?");
		answer = input.nextLine();
		
		return answer;
	} // end of Answer
	
	public int Total_Add(int total, int card1) {
		return total + card1;
	} // end of Total_Add

} // end of Class(Player)
