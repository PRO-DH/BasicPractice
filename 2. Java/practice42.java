package inheritance;

class Sedan{
	String color = "파랑";
	public Sedan() {
		System.out.println("부모클래스");
	}
}

class Sonata extends Sedan{
	String color = "빨강";
	public Sonata() {
		 System.out.println("자식클래스");
	}
	public void colorPrint() {
		System.out.println("소나타 색상 : " + color);
		System.out.println("세단의 색상 : " + super.color);
	}
	
}


public class Ex02 {

	public static void main(String[] args) {

		Sonata sonata = new Sonata();

		sonata.colorPrint();

	}

}
