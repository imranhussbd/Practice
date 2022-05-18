package hw4JavaVariables;

public class AboutMe {
	public String name;
	public byte age;
	public short myRent;
	public int mySalary;
	public long myBalance;
	public float myHeight;
	public double myGpa;
	public char sex;
	public boolean tallPerson; // variables declared in lines 4-12

	public AboutMe() { // Constructor declared
		System.out.println("This is all about us:   \n");
	}

	public void aboutMe() { // method implemented
		System.out.println("My Name: " + name + "\nMy Age: " + age + "\nMy Rent: " + myRent + "\nMy Salary:" + mySalary
				+ "\nMy Balance: " + myBalance + "\nMy Height: " + myHeight + "\nMy GPA: " + myGpa + "\nMy Sex: " + sex
				+ "\nI Am Tall: " + tallPerson);

	}

}
