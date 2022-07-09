import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int card1, card2;
		int total;
		int dealer_card1, dealer_card2;
		int dealer_total;
		
		System.out.println("Welcome to the simplified blackjack game!\n");
		
		Scanner input = new Scanner(System.in);
		
		/*int low = 2;
		int high = 12;
		int result = rand.nextInt(high-low) + low; */
		
		
		Player card = new Player();
		card1 = card.Cards(); 
		
		Player card_2 = new Player();
		card2 = card_2.Cards();
		
		System.out.println("You get a " + card1 + " and a " + card2 + "."); 
		
		Player total_player = new Player();
		total = total_player.Total(card1, card2); // Player's total calculation
		
		System.out.println("Your total is " + total);
		System.out.println();
		
		if(total == 0) { //checks if Player's total is over 21
			System.out.println("DEALER WINS!");
		}
		
		Dealer dealer_card = new Dealer();
		dealer_card1 = dealer_card.Cards();  
		
		Dealer dealer_card_2 = new Dealer();
		dealer_card2 = dealer_card_2.Cards();
		
		Dealer total_dealer = new Dealer();
		dealer_total = total_dealer.Total(dealer_card1, dealer_card2); // Dealer's total calculation
		
		System.out.println("The dealer has a " + dealer_card1 + " showing, and a hidden card."); // shown dealer card (dealer_card1)
		System.out.println();
		
		Player game = new Player();
		total = game.Game(total); // The Player starts playing
		
		System.out.println();
		if(total == 0) { //checks if Player's total is over 21
			System.out.println("DEALER WINS!");
		}
		else {
			
			Dealer dealer_game = new Dealer();
			dealer_total = dealer_game.Dealer_Game(dealer_total, dealer_card2); // The Dealer starts playing
			
			System.out.println();
			if(total == dealer_total) {
				System.out.println("DEALER WINS!");
			}
			else if(dealer_total > total) {
				System.out.println("DEALER WINS!");
			}
			else {
				System.out.println("YOU WIN!");
			}
			
		}
		
		input.close();

	}

} // end of Main
