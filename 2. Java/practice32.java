package clazz.constructor;


class Student{
	
	// 필드
	String school = "IT학교";
	int studentID;
	String name;
	int age;
	
	// 생성자
	// 1. 생성자를 명시하지 않으면 자바 컴파일러는 기본생성자를 자동으로 만든다.
	// 2. 그러나 생성자를 명시해주면 만들지 않는다.
	// 3. 반환타입이 없다
	// 4. 생성자는 클래스 이름과 같은 이름을 써야한다.
	public Student() {
		System.out.println("Student 생성자를 호출했습니다.");	
	}
	
	// 생성자는 보통 매개변수로 매개값을 받아 필드를 초기화한다.
	public Student(int studentID, String name, int age) {
		this.studentID = studentID;
		this.name = name;
		this.age = age;
	}
	
	// 메소드
	public void studentProfile() {
		System.out.println("학교 : " + school);
		System.out.println("학번 : " + studentID);
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
	
	
	
}

public class Ex01 {

	public static void main(String[] args) {
	
		Student s1 = new Student();	// 객체생성
		// 객체를 생성하면 생성자가 호출이 되고 필드초기화와 메소드호출 등 객체를 사용할 준비를 한다.
		s1.age = 24;
		s1.studentProfile();
		
		Student ss = new Student(14352,"홍",23);
		ss.studentProfile();

	}

}
