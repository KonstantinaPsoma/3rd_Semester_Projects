import java.util.Random;

public class Dealer {
	int dealer_card, dealer_card2;
	int dealer_total;
	
	public int Cards() {
		Random rand = new Random();
		
		do {
			dealer_card = rand.nextInt(12);
		}while(dealer_card < 2 || dealer_card > 11);
		
		return dealer_card;
	} // Cards
	
	public int Total(int dealer_card1, int dealer_card2) {
		
		return dealer_card1 + dealer_card2;
	} // Total
	
	public int Dealer_Game(int dealer_total, int dealer_card2) {
		int dealer_card;
		
		System.out.println("OK, dealer is playing.");
		System.out.println("His hidden card was " + dealer_card2 + "."); // hidden card (dealer_card2)
		System.out.println("His total is " + dealer_total + ".");
		
		while(dealer_total<=16) {
			System.out.println("Dealer chooses to hit.");
		
			dealer_card = Cards();
			
			System.out.println("He draws a " + dealer_card + ".");
			dealer_total = dealer_total + dealer_card;
			System.out.println("His total is " + dealer_total + ".");
			
		}
		
		if(dealer_total>21) {
			return 0;
		}
		else {
			return dealer_total;
		}
		
	} // end of Dealer_Game
	
} // end of Class(Dealer)
