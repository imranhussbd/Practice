package hw5Q2Constructor;

public class ComputerTest {

	public static void main(String[] args) {
		Computer cpu = new Computer();
		Computer cpu01 = new Computer("Apple", "MacBook Air", "MacOS Mojave", 800, false, 'A');
		Computer cpu02 = new Computer("Dell", "Inspiron 16 Plus", "Windows11", 1100, true, 'B');
	}

}
