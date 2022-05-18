package hw3JavaVariables;

public class AboutMe {
	public String name = "Imran Hussain";
	public byte age = 33; // variable initialized
	public short myRent; // variable declared
	public int mySalary = 45678;
	public long myBalance = 48959588958595885l;
	public float myHeight = 5.25f;
	public double myGpa = 3.857867434535;
	public char sex = 'M';
	public boolean tallPerson = false;

	public static void main(String[] args) {
		AboutMe aboutMe = new AboutMe();
		System.out.println("My Name: " + aboutMe.name + "\nMy Age: " + aboutMe.age + "\nMy Sex: " + aboutMe.sex
				+ "\nI Am Tall: " + aboutMe.tallPerson);

	}

}
