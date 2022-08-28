package oopExam;

/*An Interface can inherit more than one Interface by extends keyword
 * To inherit more than one use comma exp: [interface Phone extends Pager, Wakitoki]
 * only 1 keyword is used [extends]
 * we can not use implements keyword for inheritance in Interface
 * An Interface can't inherit a regular class or an abstract class at all
 * method is declared inside Interface (not implemented)
 * the method which are declared -- called also abstract method
 * This is not mandatory to put abstract keyword with the abstract method inside Interface
 * From Java 1.8, JAVA(allowed) implemented static and default(only interface) type methods in interface
*/

public interface Phone extends Pager, Wakitoki {
	/*
	 * Variables inside Interface are final and static in nature Interfaces can not
	 * have constructors(not allowed)
	 */
	public static final int age = 33;

	public void interfaceInfo();

	public void call();

	public void message();

	public void camera();

	public default void battery() {
		System.out.println("battery is a implemented default method(in interface) from Java 1.8");
	}

	public static void wireless() {
		System.out.println("wireless is a implemented static method(in interface) from Java 1.8");
	}

}
