package builder;

public class Car {
	private String name;
	private int wheels;
	private String color;
	
	public static class Builder {
		
		private String name;
		private int wheels = 4;
		private String color = "Default";
		
		public Builder(String name) {
			this.name = name;
		}
		
		public Builder wheels(int wheels) {
			this.wheels = wheels;
			return this;
		}
		
		public Builder color(String color) {
			this.color = color;
			return this;
		}
		
		public Car build() {
			return new Car(this);
		}
	}
	
	public Car(Builder builder) {
		
		this.name = builder.name;
		this.wheels = builder.wheels;
		this.color = builder.color;
	}
	
		
	public String toString() {
		return String.format("Car [name = %s, wheels = %d, color = %s]", this.name, this.wheels, this.color);
	}
	
	public static void main(String[] args) {
		Builder builder = new Builder("Toyota");
		Car car = builder.wheels(4).color("Red").build();
		System.out.println(car.toString());
	}
}
