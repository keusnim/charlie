package practise;

public class TicketMachine {
	private int price = 100;
	private int balance;
	private int total;
	
	public void showPrompt() {
		System.out.println("Welcome to buy ticket");
		System.out.println("The price is " +price);
	}
	
	public void insertMoney(int bill) {
		if(bill>=price) {
			System.out.println("The ticket.");
			if(bill > price) {
				System.out.println("The change is "+(bill-price));
			}
			balance=bill-price;
		}
	}
	
	public void printBalance() {
		System.out.println("Balance is " + balance);
	}
	
	
	
	public static void main(String[] args) {
		TicketMachine tm = new TicketMachine();
		tm.price=80;
		tm.showPrompt();
		TicketMachine tm2 = new TicketMachine();
		tm2.price=150;
		tm.showPrompt();
		
		tm.insertMoney(200);
		tm.printBalance();
		
	}

}
