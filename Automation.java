package week3.day2homework;

public class Automation extends MultipleLangauge {

	public static void main(String[] args) {
		Automation auto = new Automation();
		auto.Selenium();
		auto.Java();
		auto.ruby();
		auto.python();

	}

	public void Selenium() {
		System.out.println("Selenium");
		
	}

	public void Java() {
		System.out.println("Java");
		
	}

	@Override
	void ruby() {
		System.out.println("ruby");
		
	}

}
