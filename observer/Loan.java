package observer;

import java.util.ArrayList;
import java.util.List;

public class Loan implements Subject {
	
	private List<Observer> observers = new ArrayList<Observer>();
	private String type;
	private float interest;
	private String bank;
	
	public Loan(String type, float interest, String bank) {		
		this.type = type;
		this.interest = interest;
		this.bank = bank;
	}

	public String getType() {
		return type;
	}

	public void setInterest(float interest) {
		this.interest = interest;
		notifyObservers();
	}

	public float getInterest() {
		return interest;
	}



	public String getBank() {
		return bank;
	}



	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void deleteObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		
		for(Observer observer : observers) {
			
			System.out.println("Notifying Observers on change in Loan interest rate");
			
			observer.update(this.interest);
		}
	}

}
