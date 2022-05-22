package hw5Q2Constructor;

public class Computer {
	public String brand;
	public String model;
	public String operatingSystem;
	public int price;
	public boolean madeInUsa;
	public char grade;

	public Computer() {
		System.out.println("This is from default Constructor of Computer class. ");

	}

	public Computer(String brand, String model, String operatingSystem, int price, boolean madeInUsa, char grade) {
		this.brand = brand;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.price = price;
		this.madeInUsa = madeInUsa;
		this.grade = grade;
		System.out.println("My Brand: " + brand + ", Model: " + model + ", Operating system: " + operatingSystem
				+ ", Price: $" + price + ", Grade: " + grade + ", Made in USA? Ans: " + madeInUsa);
	}

}
