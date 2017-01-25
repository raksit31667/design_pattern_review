package strategy;

public class Calculator {

	private Operation operation;
	
	public Calculator(Operation operation) {
		
		this.operation = operation;
	}
	
	public int executeOperation(int num1, int num2) {
		
		return operation.doOperation(num1, num2);
	}
}
