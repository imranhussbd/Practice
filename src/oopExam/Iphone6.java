package oopExam;

public class Iphone6 extends Iphone5 {
	/*
	 * Iphone1 to 6 is Multi-Level Inheritance -A derived class created from another
	 * derived class is called Multi Level Inheritance.
	 */
	public void compass() {
		System.out.println("North, East, South, West");
	}

	/*
	 * Method over loading and Method overriding are the 2 types of Polymorphism
	 * -which is the ability of an object to take on many forms.
	 * 
	 * 1)Method over loading - Static Polymorphism, early binding and compile time
	 * polymorphism: happens in compile time. --When different methods exist with
	 * the same method name but with different parameters or signature, it is called
	 * method overloading.
	 * 
	 * 2)Method overriding - Dynamic Polymorphism, late binding and run time
	 * polymorphism: happens in Run time.-- When different methods exist with the
	 * same method name with same parameters or signature but with different syntax
	 * or logic, it is called method overriding.
	 * 
	 * 
	 */

	public int materials(int ramPrice, int cameraPrice) {
		int total1 = ramPrice + cameraPrice;
		System.out.println("Total price is: " + total1);
		return total1;
	}

	public int materials(int ramPrice, int cameraPrice, String processorPrice) {
		int total2 = ramPrice + cameraPrice + Integer.parseInt(processorPrice);
		System.out.println("Total price is: " + total2);
		return total2;
	}

	public void materials(int ramPrice, int cameraPrice, int screenPrice) {
		int total3 = ramPrice + cameraPrice + screenPrice;
		System.out.println("Total price is: " + total3);
	}

	public final int materials(int ramPrice, String processorPrice, int cameraPrice) {
		int total4 = ramPrice + Integer.parseInt(processorPrice) + cameraPrice;
		System.out.println("Total price is: " + total4);
		return total4;
	}

	public static int materials(int ramPrice, int cameraPrice, int screenPrice, int airpodPrice) {
		int total5 = ramPrice + cameraPrice + screenPrice + airpodPrice;
		System.out.println("Total price is: " + total5);
		return total5;
	}

	public void materials() {
		System.out.println("Materials Info");
	}
}
