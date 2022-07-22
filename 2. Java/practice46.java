package poly;


//필드의 다형성

class Car{
	Tire tire = new Tire();
	
}



class Tire{
	
	public String tireName;
	
	public Tire() {
		tireName = "정품타이어";	
	}
	
	public String getTireName() {
		return tireName;
	}
}



class HankookTire extends Tire{
	public HankookTire() {
		tireName = "한국타이어";
	}
}


class KumhoTire extends Tire{
	public KumhoTire() {
		tireName = "금호타이어";
	}
}


public class Ex03 {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		String tireName1 = myCar.tire.getTireName();
		System.out.println(tireName1);
		
		myCar.tire = new HankookTire();
		String tireName2 = myCar.tire.getTireName();
		System.out.println(tireName2);
		
		myCar.tire = new KumhoTire();
		String tireName3 = myCar.tire.getTireName();
		System.out.println(tireName3);

	}

}
