package abstraction;


abstract class Animal{
	
	public void eat() {
	System.out.println("냠냠");
	}

	
	abstract void sound();		//일반클래스에서는 추상메소드를 만들수없다.
}

class Dog extends Animal{
	@Override
	void sound() {
		System.out.println("멍멍");
	}
}

class Cat extends Animal{
	@Override
	void sound() {
		System.out.println("야옹");
	}
}




public class Ex01 {

	public static void main(String[] args) {
		Animal dog = new Dog();
		dog.sound();
		
		Animal cat = new Cat();
		cat.sound();
		
	}

}
