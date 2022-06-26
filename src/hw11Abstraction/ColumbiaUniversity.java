package hw11Abstraction;

/*
-->An regular class can inherit only one abstract class or one regular class by extends keyword only
-not by implements
-->An regular class can't inherit an Interface by extends key word, but can by implements keyword
-->An regular class can inherit one or more Interface with implements keyword only
-not by extends
-->When a regular class extends an abstract class or implements an interface, then the methods 
-which are abstract, are implemented in the regular class by @Override annotation
 */

public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool {

	public ColumbiaUniversity() {

	}

	// public abstract void chemistry();---> error B/C abstract method can only be
	// defined by abstract class

	// Default methods are allowed only in interfaces
	/*
	 * public default void gymnasium() {
	 * 
	 * }
	 */
	public void biology() {
		System.out.println("All about Biology-101");

	}

	public static void chemistry() {
		System.out.println("All about CHEM static");
	}

	@Override
	public void anatomyLab() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hygiene() {
		// TODO Auto-generated method stub

	}

	@Override
	public void commonRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void laboratory() {
		// TODO Auto-generated method stub

	}

	@Override
	public void languageClub() {
		// TODO Auto-generated method stub

	}

	@Override
	public void emergencyRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void surgeryRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cafeteria() {
		// TODO Auto-generated method stub

	}

	@Override
	public void lawInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void vocationalInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void classSize() {
		// TODO Auto-generated method stub

	}

	@Override
	public void playGround() {
		// TODO Auto-generated method stub

	}

	@Override
	public void teacher() {
		// TODO Auto-generated method stub

	}

}
