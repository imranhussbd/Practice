package oopExam;

public class Iphone1 extends AppleWatch implements Phone {

	private int price;
	private String info;
	private char user;
	private boolean madeInUsa;

	public int vol;
	public String userName;

	public Iphone1() {

	}

	public Iphone1(int price, String info, char user, boolean madeInUsa) {
		this.price = price;
		this.info = info;
		this.user = user;
		this.madeInUsa = madeInUsa;
		System.out.println("I bought this phone in 2001, " + info + "\nThe price was $" + price + "\nUser's sex is: "
				+ user + "\nIs it made in USA is: " + madeInUsa);// use for iphone2
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public char getUser() {
		return user;
	}

	public void setUser(char user) {
		this.user = user;
	}

	public boolean isMadeInUsa() {
		return madeInUsa;
	}

	public void setMadeInUsa(boolean madeInUsa) {
		this.madeInUsa = madeInUsa;
	}

	@Override
	public void interfaceInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void call() {
		// TODO Auto-generated method stub

	}

	@Override
	public void message() {
		// TODO Auto-generated method stub

	}

	@Override
	public void camera() {
		// TODO Auto-generated method stub

	}

	@Override
	public void ancient() {
		// TODO Auto-generated method stub

	}

	@Override
	public void tenFour() {
		// TODO Auto-generated method stub

	}

	@Override
	public void tickTock() {
		// TODO Auto-generated method stub

	}

	@Override
	public void digiInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void appleWatchInfo() {
		// TODO Auto-generated method stub

	}

	public void regularClassInfo() {
		System.out
				.println("Regular class can inherit only one (regular class or one abstract class by extends keyword.\n"
						+ "A regular class can't inherit an Interface by extends keyword.\n"
						+ "Implements keyword is used to inherit Interface in regular class.\n"
						+ "A regular class can inherit more than one Interface.\n"
						+ "A regular class cannot inherit a regular class or abstract class by implements keyword.\n"
						+ "Methods are only implemented(non-abstract) in Regular class.\n"
						+ "Any abstract method inherited by Regular class are Overriden and implemented with @Override annotation.\n"
						+ "Default type method not allowed in Regular class");
	}

	public void youTube() {
		System.out.println("Online Video Stream");
	}

}
