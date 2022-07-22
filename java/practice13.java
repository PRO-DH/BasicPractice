package loop;

public class Ex03 {

	public static void main(String[] args) {
		
		// for문 사용 1~ 10까지 합
		int sum = 0;
		for(int i=1;i<=10;i++) {
			sum += i;		
			
		}
		System.out.println("합은 "+sum+" 입니다");
		
		for (int i = 0;i<100;i+=10) {
			if(i<90) {
				System.out.printf("%d,",i);
			} else{
				System.out.println(i);
			}
			
		}
	}

}
