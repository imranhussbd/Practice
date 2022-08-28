package oopExam;

/*
 	You have to put abstract keyword in abstract class
	Abstract class can inherit only one abstract class or one regular class by extends key word
	Abstract class can't inherit an Interface by extends key word
	-implements keyword is used to inherit Interface in abstract class
	Abstract class can inherit more than one Interface
	Abstract class cannot inherit a regular class or abstract class by implements keyword
 */

public abstract class AppleWatch extends AppleWatchSeries5 implements Watch, DigitalWatch {
	/*
	 * Yes you create a variable and constructor inside Abstract Class. You can
	 * instantiate an Abstract Class with help of a Concrete Class.
	 */
	public String price = "$400";
	public double screenSize = 1.5;

	public AppleWatch() {

	}

	public void abstractClassinfo() {
		System.out.println("You have to put abstract keyword in Abstract Class\n"
				+ "Abstract class can inherit only one abstract class or one regular class by extends key word\n"
				+ "Abstract class can't inherit an Interface by extends key word\n"
				+ "-implements keyword is used to inherit Interface in abstract class\n"
				+ "Abstract class can inherit more than one Interface\n"
				+ "Abstract class cannot inherit a regular class or abstract class by implements keyword\n"
				+ "Abstract class can have declared(abstract) or implemented(non-abstract) methods\n"
				+ "This is mandatory to put abstract keyword with the abstract method inside Abstract Class\n"
				+ "It is a norm to write at least one abstract method inside abstract class\n"
				+ "Default type method not allowed in Abstract class");
	}

	public abstract void appleWatchInfo();

}
