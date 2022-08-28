package oopExam;

public class Iphone2 extends Iphone1 {

	public char userOfIphone2 = 'F';

	public Iphone2() {
		super(750, "Iphone2", 'F', false);
		super.vol = 2;
		System.out.println("This Iphone Vol. is: " + vol);
	}

	public Iphone2(char userOfIphone2) {
		super(750, "Iphone2", 'M', false);
		this.userOfIphone2 = userOfIphone2;
		super.youTube();
	}

	public void iPhone2Info() {
		super.regularClassInfo();

	}

	public void iPhone2Info(char userOfIphone2) {
		super.userName = "Rani";
		System.out.println("My name is: " + userName + "\nMy sex is: " + userOfIphone2);

	}

	public void dropbox() {
		System.out.println("Your Cloud so Drop it like it's hot");
	}

}
