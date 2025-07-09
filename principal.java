package purchases;

import java.util.Collections;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner reading = new Scanner(System.in);
		System.out.println("Please enter your credit card limit: ");
		double limit = reading.nextDouble();
		CreditCard card = new CreditCard(limit);
		
		int exit = 1;
		while(exit != 0) {
			System.out.println("Please enter the purchased product.");
			String description = reading.next();
			
			System.out.println("Please enter the amount of the purchase.");
			double value = reading.nextDouble();
			
			Purchase purchase = new Purchase(description, value);
			boolean purchaseCompleted = card.registerPurchase(purchase);
			
			if (purchaseCompleted) {
				System.out.println("Purchase successful!");
				System.out.println("Enter 0 to exit or 1 to continue.");
				exit = reading.nextInt();
			} else {
				System.out.println("Insufficient funds");
				exit = 0;
			}
		}
	
		System.out.println("******************");
		System.out.println("PURCHASE HISTORY:\n");
		Collections.sort(card.getPurchase());
		for (Purchase p : card.getPurchase()) {
			System.out.println(p.getDescription() + " - " + p.getValue());
		}
		
		System.out.println("\n******************");
		
		System.out.println("\nCredit card balance: " + card.getBalance());
		
		reading.close();
	}

}
