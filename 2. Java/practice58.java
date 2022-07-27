
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
	
	@Override
	public int hashCode() {
		String hashCode = (name + age + SSN);
		return hashCode.hashCode();
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
