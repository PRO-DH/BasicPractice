package clazz.constructor;


class Student2{
	
	//필드
	String school = "IT학교";
	String name;
	int age;
	int studentID;
	String department;
	
	//기본 생성자 - 단축키 ctrl+space
	public Student2() {
	}
	
	//생성자 오버로딩
	public Student2(String name) {
		this(name,0);	// 다른 생성자 호출 : 무조건 첫줄에만 와야한다.
	}
	public Student2(String name, int age) {
		this(name,age,0);
	}
	public Student2(String name, int age, int studentID) {
		this(name,age,studentID,null);
	}
	public Student2(String name, int age, int studentID, String department) {
		this.name = name;
		this.age = age;
		this.studentID = studentID;
		this.department = department;
	}
	
	//메소드
	public void studentProfile() {
		System.out.println("학교 : " + school);
		System.out.println("학번 : " + studentID);
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("학과 : " + department);
	}
}


public class Ex02 {

	public static void main(String[] args) {
		Student2 student = new Student2();
		Student2 student1 = new Student2("똥쟁이");
		
		student.name = "홍길동";
		student.age = 24;
		student.studentID = 2415;
		
		
		Student2 student2 = new Student2("김구구",24,1524,"아용");
		student.studentProfile();
		student1.studentProfile();
		student2.studentProfile();

	}

}
