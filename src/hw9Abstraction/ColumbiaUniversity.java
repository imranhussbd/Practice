package hw9Abstraction;

//A regular class can inherit only one (regular class or one abstract class) by extends keyword
//-->only 1 keyword is used [extends]
//for inherit of abstract class in regular must accept override of methods declared to be implemented
//A regular class can't inherit an Interface by extends keyword

public class ColumbiaUniversity extends MedicalSchool {

	public ColumbiaUniversity() {

	}

	// public abstract void chemistry();---> error B/C abstract method can only be
	// defined by abstract class

	public void biology() {
		System.out.println("All about Biology-101");
	}

	@Override
	public void anatomyLab() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hygiene() {
		// TODO Auto-generated method stub

	}

}
