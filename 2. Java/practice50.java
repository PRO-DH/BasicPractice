package interface1;


interface Animal{
	
	public static final int MAX_AGE = 500;			// public static final 생략가능
	
	public abstract void sound();					// public abstract 는 생략가능
	
	public default void defaultMethod() {
		System.out.println("디폴트 메소드");			//default 메소드 - 추상메소드가 아니다. 구현클래스에서 구현하지 않아도 된다. 키워드는 default로 명시해주어야하며 접근제한자는 public이다(생략가능) * default접근제한이 아니다.
	}
	public static void staticMethod() {
		System.out.println("static 메소드");		
	}
	
}

class Dog implements Animal{
	
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}

class Cat implements Animal{
	
	@Override
	public void sound() {
		System.out.println("야옹");
		
	}
}




public class Ex01 {

	public static void main(String[] args) {
		Animal myAnimal = new Cat();
		 myAnimal.sound();
		 myAnimal = new Dog();
		 myAnimal.sound();
		 myAnimal = new Cat();
		 myAnimal.sound();
		 
		 Animal[] myAnimals = new Animal[2];
		 myAnimals[0] = new Cat();
		 myAnimals[1] = new Dog();
		 
		 myAnimals[0].sound();
		 myAnimals[1].sound();
		
		 

	}

}
