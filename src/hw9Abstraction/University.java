package hw9Abstraction;

//-->An Interface can inherit more than one Interface by extends keyword
//-->for more than use comma exp: [interface University extends College, Hospital]
//-->only 1 keyword is used [extends]
//-->An Interface can't inherit a regular class or an abstract class by extends keyword

public interface University extends College, Hospital {

	// public University () {} ---> error B/C Interfaces can not have Constructors

	public void classSize();

	public void playGround();

	public void teacher();

//below-->from Java 1.8, JAVA implemented static and default type method in interface	which are implemented

	public default void gymnasium() {

	}

	public static void library() {

	}

}
