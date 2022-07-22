package abstraction;



abstract class Worker{
	String name;
	public Worker(String name) {
		this.name = name;
	}
	public abstract void work();
	public abstract void eat();
	
}

class TaxiDriver extends Worker{
	
	public TaxiDriver(String name) {
		super(name);
	}
	
	@Override
	public void work() {
		System.out.println(name + "운전합니다.");
	}

	@Override
	public void eat() {
		System.out.println(name + "기사식당 먹습니다.");	
	}
}

class Cleaner extends Worker{
	
	public Cleaner(String name) {
		super(name);
	}

	
	@Override
	public void work() {
		System.out.println(name + "청소합니다.");	
	}
	
	@Override
	public void eat() {
		System.out.println(name + "뭘먹을까요");
	}
	
}


public class Ex02 {

	public static void main(String[] args) {
		
		TaxiDriver driver = new TaxiDriver("홍길동");
		driver.eat();
		driver.work();
		System.out.println();
		
		Cleaner cleaner = new Cleaner("성춘향");
		cleaner.eat();
		cleaner.work();
		
	}

}
