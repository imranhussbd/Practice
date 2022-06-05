package hw9Abstraction;

//-->An abstract class can inherit only one abstract class or one regular class by extends key word
//-->only 1 keyword is used [extends]
//-->An abstract class can't inherit an Interface by extends key word

public abstract class MedicalSchool extends NursingSchool {

	public MedicalSchool() {

	}

	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("All about biochemistry");
	}

}
