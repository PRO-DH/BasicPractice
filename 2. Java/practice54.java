package interface1;

import java.util.Scanner;

class IronMan{
	
	IronSuit ironsuit;
	public IronMan(IronSuit ironsuit) {
		this.ironsuit = ironsuit;
	}
	public void fight() {
		ironsuit.flying();
		ironsuit.attack();
		if(ironsuit instanceof NewIronSuit) {
			((NewIronSuit) ironsuit).laserBeamAttack();
		}
	}
}








interface IronSuit{
	public abstract void flying();
	public abstract void attack();
}







class NormalIronSuit implements IronSuit{
	
	String suitName = "마크1";
	@Override
	public void flying() {
		System.out.println("아이언맨이" + suitName + "을 장착하고 날아갑니다.");
	}
	@Override
	public void attack() {
		System.out.println(suitName+"을 장착한 아이언맨이 적을 향해 공격합니다.");
	}
}







class NewIronSuit implements IronSuit{
	
	
	String suitName = "마크43";
	
	@Override
	public void flying() {
		System.out.println("아이언맨이" + suitName + "을 장착하고 날아갑니다.");		
	}
	@Override
	public void attack() {
		System.out.println(suitName+"을 장착한 아이언맨이 적을 향해 공격합니다.");
	}
	
	public void laserBeamAttack() {
		System.out.println(suitName+"을 장착한 아이언맨이 레이저빔을 쏩니다.");
	}
	
}






public class Ex06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		IronMan ironMan = null;
		IronSuit ironSuit = null;
		System.out.println("아이언맨 적이 나타났습니다.");
		System.out.println("어떤 슈트를 입을까요? 1.(마크1) 2.(마크43)");
		
		int choice = scan.nextInt();
		
		if(choice ==1) {
		
			ironSuit = new NormalIronSuit();
			ironMan = new IronMan(ironSuit);
		}else if(choice ==2) {
			ironSuit = new NewIronSuit();
			ironMan = new IronMan(ironSuit);
		}else {
			
				System.out.println("잘못입력하셨습니다.");
				System.exit(0);
		}
		
		ironMan.fight();
		
	}

}
