package oopExam;

public class ConfiguredIphone6 extends Iphone6 {

	@Override
	public int materials(int ramPrice, int cameraPrice) {
		int total1 = ramPrice + cameraPrice + 5;
		System.out.println("Total price is: " + total1);
		return total1;
	}
	
	@Override
	public int materials(int ramPrice, int cameraPrice, String processorPrice) {
		int total2 =10 + ramPrice + cameraPrice + Integer.parseInt(processorPrice);
		System.out.println("Total price is: " + total2);
		return total2;
	}
	
	@Override
	public void materials(int ramPrice, int cameraPrice, int screenPrice) {
		int total3 = ramPrice + cameraPrice + screenPrice + 20;
		System.out.println("Total price is: " + total3);
	}
	
	/*
	 * -Can not Override Final method-its not allowed
	@Override
	public final int materials(int ramPrice, String processorPrice, int cameraPrice) {
		int total4 = ramPrice + Integer.parseInt(processorPrice) + cameraPrice;
		System.out.println("Total price is: "+ total4);
		return total4;
	}
	*/
	
	/*
	 * -Can not Override Static method-- But the ConfigureIphone6 can have its own static method
	@Override
	public static int materials(int ramPrice, int cameraPrice, int screenPrice, int airpodPrice) {
		int total5 = ramPrice + cameraPrice + screenPrice + airpodPrice;
		System.out.println("Total price is: " + total5);
		return total5;
	}
	*/
	
	@Override
	public void materials() {
		System.out.println("Materials Info" + "Concept info");
	}
}
