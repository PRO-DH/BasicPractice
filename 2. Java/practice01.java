package folder;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("문자열 입니다. 문자열 안의 내용은 그대로 출력됩니다.");
		
		System.out.print("안녕");
		System.out.print("하세요");
		// println은 출력하고 줄바꿈 / print는 출력하고 줄 바꾸지 않음
		
		System.out.println("1+5");
		System.out.println(1+5);
		// ""이 있으면무조건 문자열. 없으면 계산 결과값이 나온다
    
    		int a = 3 ;
		int b = 2 ;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
    
    		int price1 = 100;
		int $price = 200;
		int _price = 300;
		// 변수 이름은 문자/$/_ 셋중 하나로 시작
		System.out.println(price1);
		System.out.println($price);
		System.out.println(_price);
		
		String firstname = "java" ;
		// String은 문자열을 저장하는 타입이다.
		System.out.println(firstname);
		String firstName="자바";
		System.out.println(firstName);
    
    		int age = 28 ;
		double height = 185.6;
		float weight = 78.5f;
		System.out.println(age);
		System.out.println(height);
		System.out.println(weight);
    
    
    		byte a = 10;
		int b = a;
		System.out.println(b);	// 자동타입변환
		
		double c = 40.3;
		byte d = (byte) c;		// 강제타입변환
		System.out.println(d);
		int cc = d;
		System.out.println(cc);
		
		byte c1 = 10;
		byte d1 = 20;
//		byte result = c1+d1;	- 오류가 난다. why? 자바에서 정수형끼리 연산은 int형으로 하기때문에 c+d는 int형이다. 따라서 byte 으로 저장하면 안되고 int 로 저장되야한다.
		int result = c1+d1;		// 자동타입변환
		System.out.println(result);
		
		int e = 10;
		double f = 10.2;
		double result2 = e+f;
		System.out.println(result2); 	// double타입으로자동타입변환
		
		char ch2 = 'A';
		int g = ch2;		// char의 경우에는 실제로는 아스키코드인 정수로 저장되기 때문에 inht타입으로 자동타입변환가능
		System.out.println(g);
		
	}

}
