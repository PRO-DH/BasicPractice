package collection;

import java.util.*;

class Person{
	
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person person = (Person)obj;
			boolean bool = this.name.equals(person.name)&& this.age==person.age; 
			return bool;
		}else {
			return false;
		}
		
	}
}

public class Ex07 {

	public static void main(String[] args) {
		
		Set<Person> set = new HashSet<>();
		
		set.add(new Person("홍길동",25));
		set.add(new Person("성춘향",24));
		set.add(new Person("이몽룡",22));
		set.add(new Person("이순신",21));
		
		Iterator<Person> setIter = set.iterator();
		while(setIter.hasNext()) {
			Person person = setIter.next();
			System.out.println("이름 : " + person.name );
			System.out.println("나이 : " + person.age);
		}
		
		
		
		
		

	}

}
