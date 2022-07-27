
package api;


class Person{
	private String name;
	private int age;
	private final String SSN;
	
	public Person(String name, int age, String ssn) {
		this.name = name;
		this.age = age;
		this.SSN = ssn;
	}
	
	// 데이터를 비교해서 같으면 true 아니면 false 가 나오도록 재정의해준다.
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person person = (Person)obj;
			boolean bool = this.name.equals(person.name) && this.age == person.age && this.SSN.equals(person.SSN);
			return bool;
		}else {
			return false;
		}
	}
	
	
	// 데이터가 같을 경우 같은 hashCode(정수값)을 반환하도록 재정의해준다.
	@Override
	public int hashCode() {
		String hashCode = (name + age + SSN);
		return hashCode.hashCode();
	}
	
		
	// 가치있는 정보로 재정의 해준다.
	@Override
	public String toString() {
		return "이름 : "+name+"\n나이 : "+age+"\n주민번호 : "+SSN;
	}
	
	
}


public class Ex01 {
	

	public static void main(String[] args) {
		
		Person person1 = new Person("홍길동", 20, "123456-1234567");
		Person person2 = new Person("홍길동", 20, "123456-1234567");
		System.out.println(person1.equals(person2));
		System.out.println(person1.hashCode());
		System.out.println(person2.hashCode());
		System.out.println(person1.toString());
		
		

	}

}
