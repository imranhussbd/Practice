package hw11Polymorphism;

public class TestFamily {
	public static void main(String[] args) {
		System.out.println("\n<--Sister-->\n");
		Sister sister = new Sister();
		sister.sister();
		sister.sister(10, 15, 16);
		sister.sister(10, 15);
		sister.sister(12, 15, "18");
		sister.sister(10, 15, 16, 20);
		Sister.sister(10, 15, 16, 20, 33);

		System.out.println("\n<--Niece-->\n");
		Niece niece = new Niece();
		niece.sister();
		niece.sister(10, 15, 16);
		niece.sister(10, 15);
		niece.sister(12, 15, "18");

	}

}
