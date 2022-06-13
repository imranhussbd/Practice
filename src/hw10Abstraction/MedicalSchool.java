package hw10Abstraction;

/*
-->An abstract class can inherit only one abstract class or one regular class by extends keyword only
-not by implements
-->An abstract class can't inherit an Interface by extends key word, but can by implements keyword
-->An abstract class can inherit one or more Interface with implements keyword only
-not by extends
 */

public abstract class MedicalSchool extends NursingSchool implements LawSchool {

	public MedicalSchool() {

	}

	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("All about biochemistry");
	}

}
