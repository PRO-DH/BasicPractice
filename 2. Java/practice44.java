package inheritance;


class Car{
	
	public int speed;
	
	public void upSpeed(int speed) {
		this.speed+=speed;
		System.out.println("현재속도(Car클래스) : " + this.speed);
	}
}

class Genesis extends Car{
	
	@Override
	public void upSpeed(int speed) {
		if(0<= speed && speed <= 200) {
			this.speed+=speed;
			System.out.println("현재속도(Car클래스) : " + this.speed);
		} else {
			System.out.println("오류 !! Genesis의 속도는 0~200km사이 값이어야합니다.");
		}
	}
}

class Porter extends Car{
	
	@Override
	public void upSpeed(int speed) {
		if(0<= speed && speed <= 120) {
			this.speed+=speed;
			System.out.println("현재속도(Car클래스) : " + this.speed);
		} else {
			System.out.println("오류 !! Porter의 속도는 0~120km사이 값이어야합니다.");
		}
	}
}

public class Ex04 {

	public static void main(String[] args) {
		
		Car g = new Genesis();
		Car p = new Porter();
		
		g.upSpeed(150);
		p.upSpeed(150);


	}

}
