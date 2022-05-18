package hw4JavaVariables;

public class AboutMeTest {
	public static void main(String[] args) {
		AboutMe imran = new AboutMe(); // Constructor Initialized
		imran.name = "Imran Hussain";
		imran.age = 33;
		imran.myRent = 3400;
		imran.mySalary = 3456789;
		imran.myBalance = 5764836856398348l;
		imran.myHeight = 5.25f;
		imran.myGpa = 3.857867434535;
		imran.sex = 'M';
		imran.tallPerson = false; // variables initialized in lines 6-14 for imran
		imran.aboutMe(); // method initialized

		AboutMe alex = new AboutMe(); // Constructor Initialized
		alex.name = "Alex Smith";
		alex.age = 28;
		alex.myRent = 5200;
		alex.mySalary = 5453789;
		alex.myBalance = 8764836856798348l;
		alex.myHeight = 6.35f;
		alex.myGpa = 3.557567434535;
		alex.sex = 'M';
		alex.tallPerson = true; // variables initialized in lines 18-26 for alex
		alex.aboutMe(); // method initialized
		// change
	}

}
