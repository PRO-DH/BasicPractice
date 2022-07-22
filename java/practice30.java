package clazz.filed;


class Car2{
	String color;
	int speed;
	
	public void upSpeed(int value) {
		speed+= value;
	}
}
public class Ex03 {

	public static void main(String[] args) {
		
		Car2 myCar1 = new Car2();
		Car2 myCar2 = new Car2();
		
		myCar1.upSpeed(3);
		
		if(myCar1 == myCar2) {
			System.out.println("같은객체입니다");
		}else {
			System.out.println("다른객체입니다.");
		}
		
		myCar1.color= "빨강";
		myCar1.speed = 100;
		myCar1.upSpeed(20);
		
		System.out.println("자동차1의 색상 : " + myCar1.color);
		System.out.println("자동차1의 속도 : " + myCar1.speed);
		myCar2.color="파랑";
		myCar2.speed=80;
		myCar2.upSpeed(30);
		
		System.out.println("자동차2의 색상 : " + myCar2.color);
		System.out.println("자동차2의 속도 : " + myCar2.color);
		
		

	}

}

package clazz.filed;


class Car3{
	
	private String color;	// public대신 private을 사용하면 데이터 보호에 용이. 외부에서 필드에 바로 접근 못하게함.
	private int speed;
	
	 public void setSpeed(int speed) {	
		if(speed<0 || speed>300) {
			return;
		}else {
			this.speed = speed;
		}
		
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
}

public class Ex04 {
	

	public static void main(String[] args) {
		
//		Car3.color = "파랑"; - 불가능 : private으로 이루어져있기때문에
		Car3 mycar = new Car3();
		mycar.setColor("파랑");
		mycar.setSpeed(-100);
		System.out.println(mycar.getSpeed());
		
		
		// 필드를 바로 접근하지말고 메소드를 통해 접근하는게 객체의 무결성에 더 좋다.
		
		// 필드에 바로 접근을 못하게 하고 메소드를 통해 접근하게 하려면 public 대신 private 을 사용한다.(데이터 보호를 위해 사용)
		
	}

}
