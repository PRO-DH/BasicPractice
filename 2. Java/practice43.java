package inheritance;


class Suv{
	private String color;	// 부모 클래스의  private 접근제한을 갖는 필드/메소드는 자식이 물려받을 수 없다.
	
	int speed = 100;
	
	public void run() {
		System.out.println("suv 차량이 달립니다.");
	}
}

class Santafe extends Suv{
	int speed = 120;
	
	@Override		// 어노테이션. - 소스코드에 메타코드를 주는것. 컴파일러에게 코드문법 에러를 체크하도록 정보제공. 
	public void run() {
		System.out.println("싼타페 차량이 달립니다.");
	}
	
	public void disp() {
		super.run();
		System.out.println("suv속도 : " + super.speed);
		this.run();
		System.out.println("싼타페속도 : " + this.speed);
	}
	
	
}

public class Ex03 {

	public static void main(String[] args) {
		Santafe santafe = new Santafe();
		santafe.disp();
	}

}
