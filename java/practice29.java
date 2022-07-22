package clazz.filed;


class Student{
	
	//필드 field : class에 선언된 변수(멤버변수)
	// 필드와 메소드에 선언된 변수와는 틀리다.
	// (class에 선언된 변수 > 전역변수, method에 선언된 변수 > 지역변수)
	int studentID = 2022201;
	String name = "홍길동";
	
	public void study() {
		String place = "도서관";
		int time = 2;
		//지역변수는 메모리의 스택 영역에 저장된다.
		// 스택 영역은 메소드의 호출과 함께 지역변수가 할당되며 메소드의 호출이 완료되면 메모리에서 소멸한다.
	}
	
}


public class Ex01 {

	public static void main(String[] args) {
		

	}

}

package clazz.filed;


class Car{
	
	//필드
	String company = "현대자동차";
	String model1 = "그랜져";
	String color = "검정";
	int maxSpeed = 250;
	int speed; // default 값 = 0
	
	
}

public class Ex02 {

	
	public static void main(String[] args) {
		
		// Car 클래스의 객체생성
		// 객체사용(필드출력)
		
		Car cc = new Car();
		System.out.println(cc.company);
		System.out.println(cc.maxSpeed);
		cc.speed = 100;
		System.out.println(cc.speed);

	}

}

