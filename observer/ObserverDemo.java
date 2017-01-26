package observer;

public class ObserverDemo {

	public static void main(String[] args) {
		
		Observer newspapaer = new Newspaper();
		
		Observer internet = new Internet();
		
		Loan personalLoan = new Loan("Personal Loan", 12.5f, "Standard Chartered");
		
		personalLoan.addObserver(newspapaer);
		
		personalLoan.addObserver(internet);
		
		personalLoan.setInterest(3.5f);
	}
}
