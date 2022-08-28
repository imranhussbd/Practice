package oopExam;

public class TestPhone {

	public static void main(String[] args) {

		System.out.println("Abstraction1");
		System.out.println("\n---------Iphone1---------\n");
		Iphone1 ip = new Iphone1();
		ip.regularClassInfo();
		ip.youTube();
		ip.abstractClassinfo();
		ip.appleWatchInfo();
		ip.seriesInfo();
		ip.tickTock();
		ip.digiInfo();
		ip.battery();
		ip.interfaceInfo();
		ip.call();
		ip.message();
		ip.camera();
		ip.ancient();
		ip.tenFour();

		System.out.println("\n----------AppleWatch---------\n");
		AppleWatch aw = new Iphone1();
		aw.abstractClassinfo();
		aw.appleWatchInfo();
		aw.seriesInfo();
		aw.tickTock();
		aw.digiInfo();

		System.out.println("\n---------Phone-----------------\n");
		Phone ph = new Iphone1();
		ph.interfaceInfo();
		ph.call();
		ph.message();
		ph.camera();
		ph.battery();
		Phone.wireless();
		ph.ancient();
		ph.tenFour();

		System.out.println("\n------------------\n");

		Iphone1 iphone1 = new Iphone1();
		iphone1.setPrice(750);
		iphone1.setUser('M');
		iphone1.setInfo("Iphone1");
		iphone1.setMadeInUsa(false);
		System.out
				.println("I bought this phone in 2000, " + iphone1.getInfo() + "\nThe price was $" + iphone1.getPrice()
						+ "\nUser's sex is: " + iphone1.getUser() + "\nIs it made in USA is: " + iphone1.isMadeInUsa());

		System.out.println("\n------------------\n");

		Iphone2 iphone2a = new Iphone2();
		iphone2a.iPhone2Info('F');

		System.out.println("\n------------------\n");

		Iphone2 iphone2b = new Iphone2('F');
		iphone2b.iPhone2Info();
		iphone2b.dropbox();

		System.out.println("\n-------Polymorphism--------\n");

		System.out.println("Iphon6");
		Iphone6 iphone6 = new Iphone6();
		iphone6.materials(100, 200);
		iphone6.materials(100, 200, "300");
		iphone6.materials(100, 200, 75);
		iphone6.materials(100, "300", 200);
		Iphone6.materials(100, 200, 75, 150);
		iphone6.materials();

		System.out.println("\nConfiguredIphon6");

		ConfiguredIphone6 config6 = new ConfiguredIphone6();
		config6.materials(100, 200);
		config6.materials(100, 200, "300");
		config6.materials(100, 200, 75);
		config6.materials();

		System.out.println("\n-------Inheritance--------\n");

		Iphone6 iphone6i = new Iphone6();
		iphone6i.youTube();// Iphone1
		iphone6i.dropbox();// Iphone2
		iphone6i.photos();// Iphone4
		iphone6i.email();// Iphone5
		iphone6i.compass();// Iphone6

		/*
		 * Iphone2 extends Iphone1 and Iphone3 extends Iphone 1 = Hierarchical
		 * Inhertiance Also above both are Single Inheritance examples
		 * 
		 * -> = extends for below Iphone6->Iphone5->Iphone4->Iphone2->Iphone1 =
		 * Muti-Level Inheritance
		 * 
		 */

	}

}
