package strategy;

public class StrategyDemo {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator(new OperationAdd());
		
		System.out.println("10 + 5 = " + calculator.executeOperation(10, 5));
		
		calculator = new Calculator(new OperationSubtract());
		
		System.out.println("10 - 5 = " + calculator.executeOperation(10, 5));
		
		calculator = new Calculator(new OperationMultiply());
		
		System.out.println("10 * 5 = " + calculator.executeOperation(10, 5));
	}
}
