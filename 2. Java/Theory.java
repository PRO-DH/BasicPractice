package folder;

public class Theory {

	public static void main(String[] args) {
		
		
		/*	=====	Day 1. 07.06. eclipse/jdk 설치 및 출력		=====
		  
		 * java의 모든 코드는 객체화를 시킨다(Class로 만든다) 즉 java의 모든 코드는 class 블록 안에 있어야한다.
		 * 이클립스에서 자주 사용하는 단축키
		 * 	ctrl shift c		라인주석 
		 * 	ctrl space  		자동완성 
		 * 	ctrl shift f		자동정렬 
		 * main 이라는 method		-	main = java의 주요 method
		 * println은 출력하고 줄바꿈 / print는 출력하고 줄 바꾸지 않음









		 
		 * =====	Day 2. 07.07. 변수선언		======
		  
		 * 변수 - 하나의 값을 저장할 수 있는 메모리에 붙이는 이름		ex. int radius = 100
		 * 상수 - 값을 한 번 저장하면 변경할 수 없는 변수			ex. final double PI = 3.14
		 * 리터럴 - 값(데이터) 그 자체를 뜻 하는 것
		 * 타입 - 자료형		자바의 변수는 다양한 타입의 값을 저장할 수 없다. 정수타입변수에는 정수만, 실수타입변수에는 실수만
		 
		 * 변수 선언 
		 * 	int(정수) x; double y; char(문자) z;
		 * 		영어 대소문자 구분. 무조건 문자/$/_ 셋중 하나로 시작해야한다.
		 * 		첫 문자는 영어 소문자로 시작하되 다른단어(띄워쓰기)가 붙는경우 첫문자를 대문자로 해준다(관례)
		 * 		문자 길이는 제한없으며 자바예약어는 사용할 수 없다.
		 
		 * 아스키코드
		 * 	저장의 최소단위는 바이트이다. 
		 * 		아스키코드는 1바이트로 1개의 문자를 표현하는데는 영어로 한정
		 * 		이 한계를 극복하기 위해 유니코드가 탄생. 2바이트로 전세계의 모든 문자를 표현한다.
		 
		 * 제일 앞자리 부호비트 - 0양수 1음수
		 * Overflow
		 * 	데이터 타입이 저장할 수 있는 값의 범위를 초과한 경우 가장 작은 숫자로 돌아가서 다시 올라가게 된다.
		 * Underflow
		 * 	데이터 타입이 저장할 수 있는 값의 범위보다 작은값을 저장한 경우 가장 큰 숫자로 돌아가서 다시 내려가게 된다.
		 
		 * 변수의 타입(기본 자료형)
		 * 	기본형 - 실제값을 저장
		 * 	8개 (boolean, char, byte, short, int, long, float, double)
		 * 		정수형 : byte, short, int, long
		 * 			- 자바의 모든 정수는 기본적으로 int형으로 나타낸다.
		 * 			- byte(1byte/-128~127) short(2byte/-2**15~2**15-1) int(4byte/-2**31~2**31-1) long(8byte/-2**63~2**63-1)
		 * 			- long형을 표현할때에는 뒤에 소문자l 이나 대문자L을 붙여준다
		 * 			- 자바에서 int형의 연산이 가장 빨라서 굳이 byte와 short형을 쓰지 않는다.
		 * 			- 자바에서는 int형 값을 byte나 short형 변수에 저장하는 것을 허용하고 있다.
		 * 		문자형 : char
		 * 			- char는 실제로는 문자의 코드인 숫자(정수)가 저장된다. - 유니코드
		 * 		실수형 : float,double
		 * 			- float(4byte/소수점7자리) double(8byte/소수점15자리)
		 * 			- 부동소수점 방식. 더 큰 범위의 값을 저장할 수 있다.
		 * 			- 자바의 실수타입의 기본처리는 double.
		 * 			- float 타입에 값을 저장하려면 실수 값 뒤에 f 또는 F를 붙여야한다.
		 * 		논리형 : boolean
		 * 			- 참 또는 거짓을 표현 (비교연산자, 논리연산자를 사용한다)
		 
		 * 타입변환
		 * 	변수의 값을 다른 타입으로 변환하는 것 / boolean형은 타입변환이 불가능하다
		 * 	1. 자동타입변환 
		 * 		- 작은 크기의 타입을 큰 크기의 타입으로 변환하는 것
		 * 			데이터크기 byte < short < int < long < float < double
		 * 			예외 : char의 경우 음수가 저장될 수 없어서 byte타입을 char타입으로 자동변환시킬수없다.
		 * 	2. 강제타입변환
		 * 		- 큰 타입을 작은 타입으로 변환하는 것
		 * 			4byte인 int 타입을 4개의 byte로 쪼갠다음 끝에 있는 1byte 만 byte 타입 변수에 저장하는 것이 가능하다. 이를 캐스팅이라고 한다.(강제타입변환을 할떄 소괄호()사용)
		
		 * String 문자열
		 * 	큰따옴표로 감싼 문자들. 문자열 저장할때는 String ㅇㅇㅇ = "ㅇㅇㅇ";
		 * 	String 은 기본자료형처럼 다루게 해주는 class
		 * 이스케이프 문자
		 * 	문자열 내부에 \ 가 붙은 문자
		 	
		 * 출력
		 * 	리터럴/변수값을 출력하기 위해서 System.out의 매소드인 println()을 사용한다.
		 * 		println(); 출력 후 행변경
		 * 		print(); 출력
		 * 		printf("형식문자열",값1,값2...); 첫번째 문자의 형식대로 내용을 출력
		 * 			printf("%~",값1,값2..) 형식문자열 - %d : 정수 / %f : 실수 / %c : 문자 / %s : 문자열
		 * 









		 
		 * =====	Day 3. 07.08. 입력		======
		 
		 * 키보드로 입력받기 (System.in)
		 * 키보드로 입력하면 임시저장소(buffer)에 저장된다.
		 * 키보드로 입력한 값을 byte 단위로 읽는다
		 
		 * System.in.read() 의 단점은 키코드를 하나씩 읽는다. 이러한 단점을 보완하기 위해서 자바는 Scanner 클래스를 제공한다.
		 *  Scanner Scan 으로 Scanner 변수를 선언한다.
		 *  new Scanner(System.in);  으로 시스템의 입력장치로부터 읽는 Scanner 생성한다.
		 *  scan.next(); 공백이전까지 입력된 문자열을 읽음
		 *  scan.nextInt(); 공백 이전까지 입력된 숫자(정수)를 읽음
		 *  scan.nextLine(); enter키 이전까지 라인전체(공백포함) 데이터를 읽음
		 
		 * import 단축키 : ctrl+shift+o 
		
		
		
		
		
		
		
				
		








		 
		 * =====	Day 4. 07.11. 제어문		======
		 
		 * 조건문
		 * 	if 문
		 * 		if (조건식) {
		 * 				실행문A;
		 * 		}
		 * 		실행문B;
		 * 		조건문이 True면 A실행 후 B실행 / 조건문이  False 면 A건너뛰고 B실행
		 * 	switch 문
		 * 		switch문은 if문과 마찬가지로 조건 제어문이다.
		 * 		if문은 True/False에 따라 가지만 Switch 문은 변수가 어떤 값을 갖느냐에 따라 실행문이 선택된다.
		 * 		if 문보다 코드가 간결하다
		 * 		switch(변수/값){
		 * 			case 값1:
		 * 				실행문A;
		 * 				break;
		 * 			case 값2:
		 * 				실행문B;
		 * 				break;
		 * 			default;
		 * 				실행문C;
		 * 		}
		 * 반복문
		 * 	for 문, do~ while 문
		 
		 		  		
		








		 
		 * =====	Day 5. 07.12. 반복문		======
		 
		 * for문
		 * 	반복 횟수를 알고 있을때
		 * 	for(초기화식;조건식;증감식){
		 * 		실행문A
		 * 	}
		 * 	조건식이 True일때 A를 실행
		  
		 * while문
		 * 	조건에 따라 반복할 떄	(조건을 먼저 검사하냐 / 나중에 검사하냐 -- while/do-while)
		 * 	while(조건식){
		 * 		실행문A;
		 * 	}
		 * 	조건식이 true일때 A를 실행
		 
		 * do-while문
		 * 	do{
		 * 		실행문 A;
		 * 	}while(조건식);
		 * 	조건을 나중에 검사한다. 우선 실행문A를 실행하고 - while뒤의 조건식을 검사한다.(실행문A는 무조건 1회 실행되고, 조건식이 True라면 반복/ False라면 빠져나온다.)
		 
		 * break문
		 * 	break문은 반복문 for/while/do-while문의 실행을 중지할때 사용된다. break문은 대개 if문과 같이 사용되어서 if문의 조건식에 따라 for/while문을 종료할때 사용된다
		 * continue문
		 * 	continue문은 반복문에서 실행흐름을 이동시킬때 사용된다. continue문이 실행되면 for문은 증감식 while문/do-while문은 조건식으로 이동된다.
		 		  		
		








		 
		 		 * =====	Day 6. 07.13. 배열변수		======
		 
		 * 자바의 타입 = 기본타입 + 참조타입
		 * 	기본타입 : byte character short int long float double boolean
		 * 	참조타입 : 기본타입을 제외한 나머지 타입
		 * 		참조타입 변수는 메모리 주소를 값으로 갖게된다. 주소를 통해 배열의 실제값을 참조한다는 뜻으로 참조타입이라고 부른다.
		 * 		기본타입은 실제값을 갖고있는거고 참조타입은 주소값을 갖고 있다
		 
		 * 자바의 배열
		 * 	자바는 많은 양의 데이터를 적은 코드로 처리할 수 있는 배열이 잇다.
		 * 	배열이란 같은 타입의 데이터를 연속된 공간에 나열하고 각 데이터에 인덱스를 부여해놓은 자료구조이다.
		 * 	배열의 각 인덱스는 각 항목의 데이터를 읽거나 저장하는 데 사용되며 배열 이름 옆에 대괄호[]에 기입된다. 인덱스는 0부터 시작된다.
		 * 	선언 방법 2가지 : 타입 옆에 []를 붙인다 or 변수옆에 []를 붙인다. ex) int[] intArray; or int intArray[];
		 * 	참조할 배열이 없다면 배열 변수는 null값으로 초기화될 수 있다.
		 * 	배열을 생성하려면 new 연산자를 사용하면 된다. 하지만 배열안에 들어갈 목록을 알고 있다면 중괄호만으로 간단하게 생성할 수 있다.
		 * 		int[] array  = new int[] (1,2,3};
		 * 		int[] array = {1,2,3};
		 * 	데이터는 없지만 목록을 나중에 넣을 배열을 만들려면 배열길이를 지정하여 배열을 생성할 수 있다.
		 * 		int[] array = new int[3]
		 * 		위 처럼 만든 후 각 인덱스에 요소를 넣어 줄 수 있다.
		 * 			array[0] = 10;
		 * 			array[1] = 20;
		 * 			array[2] = 30;
				 		  		
		








		 
		 * =====	Day 7. 07.14. 배열복사		======
		 
		 * java에서는 배열의 길이가 한번 정해지면 변경할 수 없다.
		 * 더 많은 저장공간이 필요하다면 더 큰 배열을 새로 만들고 이전 배열로부터 항목 값들을 복사해야 한다.
		 
		 * 향상된 for문
		 * 	배열을 더 쉽게 처리하기 위한 for문
		 * 	int [] array = {1,2,3};
		 * 	for (int i : array) {
		 * 		sysout;
		 * 	}
		 * i 는 배열에서 항목을 하나씩 꺼내 변수에 저장시킨다. 배열 항목의 갯수만큼만 반복한다. 
		 
		 * 임의의 정수 가져오기
		 * Math.random() 메소드를 활용할 수 있다.
		 * 	0.0 ~ 1.0 사이에 속하는 double 타입의 수를 하나 준다.
		 * 	0.0 <= Math.random() < 1.0
		 * 	0 <= (int)(Math.random()*10) < 10 	<- 이런식으로 정수범위로 바꿔 줄수 있다.
		 * 		ex) 주사위 번호 뽑기 -> int num = (int)(Math.random()*6)+1;			 		  		
		








		 
		 * =====	Day 8. 07.15. 메소드		======
		 
		 * 메소드는 동작(기능)에 해당하는 중괄호{} 블록을 말한다.
		 * 메소드 선언은 선언부와 실행 블록으로 구성된다.
		 
		 * 메소드의 구성용어
		 * 	리턴타입	: 메소드 실행 후 메소드가 리턴하는 결과의 타입
		 * 	메소드이름	: 메소드의 기능이 드러나도록 이름을 짓는다.
		 * 	매개변수	: 메소드를 실행할 때 메소드가 필요한 데이터를 받기 위한 변수
		 * 	메소드 실행블록	: {}블록안에 실행할 코드를 작성
		 * 리턴타입 메소드이름 (매개변수선언,...) {
		 * 		실행할 코드 작성
		 * }
		 * 
		 
		 * 리턴 값이 없는 메소드는 리턴타입으로 void를 사용하면 된다. 여기서 return을 사용하면 메소드를 강제 종료한다.
		 * 	void hello() {
		 * 		for(int i = 1;  i <= 10 ; i+) {
		 * 			ysout("")
		 * 			if( i==5){
		 * 				return;
		 * 			}
		 * 		}
		 * 	}
		 
		 * 메소드 오버로딩
		 * 	클래스 내에 같은 이름의 메소드를 여러 개 선언하는 것
		 * 	조건 : 매개변수의 타입, 갯수, 순서 중 하나가 달라야한다.
				








		 
		 * =====	Day 9. 07.18. 클래스		======
		 
		 * 객체 이름
		 * 	첫글자 숫자  x, 첫글자 대문자, 자바키워드 사용x, &,_외의 특수문자 사용 x
		 * 하나의 소스파일에 여러 클래스 선언하기
		 * 	public class가 있을경우 소스파일의 이름은 반드시 public class 의 이름과 일치해야한다.
		 * 	public class가 없을경우 소스파일의 이름은 어떤 클래스의 이름도 가능하다
		 * 클래스 구성 멤버
		 * 	필드 : 객체의 데이터가 저장되는 곳
		 * 	생성자 : 객체 생성시 초기화 역할 담당
		 * 	메소드 : 객체의 동작에 해당하는 실행 블록
		 * new 연산자
		 * 	클래스로부터 객체를 생성시키는 연산자
		 * 	new 연산자 뒤에는 생성자가오는데 클래스명 형태를 가진다
		 * 	클래스 변수 = new 생성자;
		 * 	Scanner scan = new Scanner();
		 * 
		 * this.매개변수
		 * 
		 * Getter Setter 메소드
		 * 	객체의 필드를 직접적으로 사용하기 보다는 메소드를 통해서 사용한다.(무결성에 좋음)
		 * 	외부로부터 필드를 받을때 메소드에서 필드값을 검증한 다음 필드값을 필드에 저장 -> Setter()
		 * 	외부에서 필드를 읽을때도 메소드에서 필드값을 검증한 다음 필드값을 외부로 전달 - > Getter()
		 				








		 
		 * =====	Day 10. 07.19. 생성자		======
		 
		 * 반드시 필요. 모든 클래스는 반드시 하나이상의 생성자를 가진다.
		 * 생성자 선언
		 * 	[클래스명](매개변수){
		 * 		객체 초기화 코드;
		 * }
		 
		 * 생성자 오버로딩
		 * 	다양한 방법으로 객체를 생성할 수 있도록 생성자 오버로딩 제공
		 
		 * 클래스(객체) 배열
		 * 	클래스 배열은 객체를 담는 배열이다.
		 * 	기본 자료형이 직접 값을 메모리에 넣는것과는 다르게 객체배열은 주소값을 넣는다.
		







		 
		 * =====	Day 11. 07.20. 접근제한자		======
		 
		 * 접근을 제한하기 위해 사용된다
		 * 	접근이란 클래스 및 인터페이스, 그리고 이들이 가지고 있는 멤버의 접근을 말한다
		 * public / protected / private
		 * public 접근제한자
		 * 	- 외부 클래스가 자유롭게 사용할 수 있도록 한다.
		 * protected 접근제한자
		 * 	- 같은패키지와 자식 클래스에서 사용할 수 있도록 한다.
		 * private 접근제한자
		 * 	- 외부에서 사용될 수 없도록 한다.
		 
		 * default 접근제한
		 * 	- 같은 패키지에 소속된 클래스에서만 사용할 수 있도록 한다.
		 
		 * java 인스턴스와 정적멤버
		 * 	- 자바는 클래스 멤버(필드/메소드)를 따로 구분해서 선언할 수 있도록 한다
		 * 		클래스로부터 객체가 생성될때 객체가 가지고 있는 멤버를 인스턴스 멤버/ 객체가 가지고 있지않고 클래스에 고정된 멤버를 정적멤버 라고한다.
		 * 메모리 영역
		 * 	스택
		 * 		메소드의 호출과 관계되는 지역/매개변수가 저장
		 * 	힙
		 * 		사용자가 직접 관리할 수있는 메모리 영역. 동적 할당/해제. new연산자를 이용해서 할당하는것은 전부 힙에 할당. 메소드 호출이 끝나도 사라지지않음
		 * 	메소드
		 * 		.class 파일들을 읽어들여 각각의 클래스별로 필드 데이터, 메소드코드, 생성자코드 등을 저장하는 영역. static으로 선언된 값들 저장됨.
		 
		 * static 블록 : static필드 초기화 역할
		 * 	static{
		 * 		  클래스 초기화 영역
		 * 	}
		 * 	







		 
		 * =====	Day 12. 07.21. 내부클래스/상속/싱글톤		======
		 * 
		 * 정적/내부클래스
		 * 익명클래스 - 이름이 없는 객체 - 어떤 클래스를 상속하거나 인터페이스를 구현해야만한다.
		 
		 * 싱글톤
		 * 	자바프로그램에서 단 하나의 객체만 생성하는 경우
		 
		 * 상속
		 * 	부모 클래스의 멤버를 자식 클래스에게 물려줄 수있다.
		 * 	프로그램에서 부모 클래스를 상위 클래스 , 자식 클래스를 하위클래스 라도고 부른ㄴ다.
		 * 	public class B extends A
		 * 	반복적으로 들어가는 공통적인 부분을 빼서 묶어주는 것
		 * 		ex) 모든 자동차는 달린다는 속성을 가짐. class Car 에 달리기 속성넣고 제조사들을 자식 클래스로 만들어버린다.
		 * 	코드가 쓸데없이 길어지지 않고 깔끔해지고 유지보수가 쉽다.
		 * 	여러개의 부모 클래스를 상속할 수 없다. (C나 python 은 되는데, 자바는 다중상속 불가능)
		 * 	부모 클래스에서 private 접근 제한을 갖는 필드와 메소드는상속대상에서 제외된다. 
		 * 	부모 클래스오 ㅏ자식 클래스가 다른 패키지에 존재한다면 default 접근제한을 갖는 필드와 메소드도 상속대상에서 제외된다
		 
		 * Object 클래스
		 * 	모든 클래스의 부모클래스가 되는 클래스이다.
		 * 	자바의 모든 클래스는 자동으로 Object 클래스의 모든 필드와 메소드를 상속받게된다. 		
		 
		 * toString() 메소드
		 * 	해당 객체에 대한 정보를 문자열로 반환한다.
		 * 	이떄 반환되는 문자열은 클래스 이름과 함께 구분자로 @ 가 사용되며 그 뒤로 16진수 해시코드가 추가된다. 코드값은 인스턴스의 주소를 가르키는 값
		 
		 * 상속관계
		 * 	포함관계 : has-a ~은 ~을 가지고있다
		 * 	상속관계 : Is-a  ~은 이다.
		 
		 * super
		 * 	부모 클래스로부터 상속받은 필드나 메소드를 자식클래스에서 참조하는데 사용하는 참조변수이다.
		 * 	부모클래스의 멤버와 자식클래스의 멤버 이름이 같을경우 super키워드를 사용하여 구별할 수 있다.
		 * 	java에서는 super참조변수를 사용하여 부모 클래스의 멤버에 접근할 수 있다.
		 
		 * 자식객체를 생성하면 부모객체가 먼저 생성되고 자식객체가 생성된다.
		 * 부모 생성자는 자식생성자의 맨 첫줄에서 호출된다.
		 * public Child(){
		 * 		super();
		 * }
		 * super()는 부모의 기본생성자를 호출한다.
		 
		 * 메소드 재정의(오버라이딩)
		 * 	부모클래스의 메소드 중 자식클래스에서 사용하기 적합하지 않을 경우, 자식클래스에서 다시 수정하는 경우를 말한다.
		 * 	부모의 메소드와 동일한 시그니처(리턴타입,메소드이름,매개변수목록)을 가져와야한다.
		 * 	접근제한 더 강하게 재정의 x
		 * 	새로운 예외를 throw x
		 
		 * final 클래스 / 메소드
		 * 	클래스를 선언할 때 final키워드를 사용하면 이 클래스는 최종클래스. 상속할 수 없다.
		 * 	final메소드는 재 정의할 수 없다.
		 
		 






		 
		 * =====	Day 13. 07.22. 다형성,추상클래스		======
		 
		 * 다형성 = 여러개의 형태를 갖는다. (하나이상의 형태를 뜻한다)
		 * 	자바에서의 다형성 - 동일한 이름을 사용하지만 다양한 객체를 이용해서 다양한 실행결과가 나오도록 하는 성질이다. (부모타입으로 자식객체를 사용하는 것)
		 * 	다형성을 구현하려면 메소드 재정의와 타입변환이 필요하다.
		
		 * 업캐스팅(자동타입변환)
		 * 	자식은 부모타입으로 자동타입변환이 가능하다.
		 * 	부모타입 변수 = 자식객체;
		 * 		[자동타입변환]
		 * 	부모타입으로 자동 타입변환된 이후에는 부모클래스에 선언된 필드와 메소드만 접근이 가능하다. 변수는 자식객체를 참조하지만, 변수로 접근가능한 멤버는 부모클래스로만 한정된다.
		 * 	하지만 메소드가 자식클래스에서 재정의되었다면 자식클래스의 대신 메소드가 호출된다.
		 
		 * 다운캐스팅(강제타입변환)
		 * 	부모타입을 자식타입으로 변환하는 것을 말한다.	
		 * 	언제나 사용할 수 있는게 아니고, 자식타입이 부모타입으로 자동타입변환한 후 다시 자식타입으로 현환할 때 강제타입변환을 사용할 수 있다.
		 * 	자식클래스 변수 = (자식클래스) 부모클래스타입;
		 
		 * 객체타입 확인
		 * 	강제타입변환은 자식타입이 부모타입으로 변환되어 있는 상태에서만 가능하기 때문에 처음부터 부모타입으로 생성된 객체는 자식타입으로 변환할 수 없다.
		 * 	어떤 객체가 클래스의 인스턴스인지 확인하기 위해 instanceof 연산자를 사용한다.
		 *  boolean result = 좌항(객체) instanceof 우항(타입)
		 
		 * 필드의 다형성
		 *  필드의 타입을 부모타입으로 선언하면 다양한 자식 객체들이 저장될 수 있고, 필드 사용결과가 달라질 수 있다.
		 *  프로그램은 수많은 객체들이 서로 연결되고 각자의 역할을 하게 되는데, 이 객체들은 다른 객체로 교체될 수 있어야한다.
		 * 매개변수(메소드)의 다형성
		 * 	자동변환타입은 주로 메소드를 호출할 때 많이 발생한다.
		 
		 * 추상클래스
		 * 	객체를 직접 생성할 수 있는 클래스를 실체클래스
		 * 	이 클래스들의 공통적인 특성을 추출해서 선언한 클래스를 추상클래스라고한다.
		 * 	추상클래스가 부모, 실체클래스가 자식으로 구현되어 실체클래스는 추상클래스의 모든 공통적인 특성을 가지고 추가적인 특성을 가질 수 있다.
		 * 추상클래스의 용도
		 * 	실체 클래스를 설꼐하는 사람이 여러사람일 경우 각 실체클래스가 필드와 메소드의 이름이 다 다를 수 있다.
		 * 	추상 클래스는 실체클래스의 공통된 필드와 메소드의 이름을 통일할 용도로 사용한다.(실체클래스 설계규격을 만들고자 할 때 사용된다.
		 * abstract를 붙여서 만든다. 추상클래스는 new연산자를 이용해서 객체를 만들지 못하고 상속만 가능하다 abstract class ooo
		 * 추상메소드 설계시 하위 클래스가 반드시 실행내용을 채우도록 강제하고 싶은 메소드가 있을경우 추상메소드로 선언한다.
		 * 	자식클래스는 반드시 추상메소드를 오버라디잉(재정의)해서 실행내용을 작성해야하고, 그렇지 않으면 컴파일에러가 발생한다.
		
			 






		 
		 * =====	Day 14. 07.25. 		======
		 
		 * Java 인터페이스
		 * 	자식 클래스가 여러 부모클래스를 상속받을 수 있다면 다양한 동작을 수행할 수 있겠지만, 메소드 충돌등의 문제가 있어서 자바에서는 다중상속을 지원하지 않는다.
		 * 	대신 자바는 인터페이스라는 것을 통해 다중 상속을 지원하고 있다.
		 * 	인터페이스란 다른 클래스를 작성할 때 기본이 되는 틀을 제공한다. 즉 추상메서드의 집합이다.
		
		 * 인터페이스 선언
		 * 	class 키워드 대신 interface 키워드를 사용한다.
		 * 	인터페이스는 인스턴스 또는 정적필드를 선언할 수 없다. 그러나 상수필드(static final)는 선언이 가능하다.
		 
		 * 구현객체/구현클래스
		 * 	인터페이스에서 정의된 실체 메소드를 가지고 있다. 
		 * 	구현클래스 선언부에 extends 대신에 implements 키워드를 추가하고 인터페이스 이름을 명시하면 된다.
		 		 






		 
		 * =====	Day 15. 07.26. Wrapper 클래스 		======
		 
		 * 기본타입 - 포장클래스
		 * 	자바는 기본타입의 값을 갖는 객체를 생성할수 있다. 이러한 객체를 포장객체라고 한다.
		 * 	byte - Byte
		 * 	char - Character
		 * 	short - Short
		 * 	int - Integer
		 * 	long - Long
		 * 	float - Float
		 * 	double - Double
		 * 	boolean - Boolean
	
		 * 박싱
		 * 	Byte obj = new Byte(10);
		 * 	Integer obj = new Integer(1000);
		 * 언박싱
		 * 	박싱된 포장객체에서 다시 기본타입의 값을 얻어내기 위해 기본타입이름 + Value() 메소드를 호출하면된다.
		 * 	byte num = obj.byteValue();
		 * 	iint num = obj.intValue();
		 
		 * 자동박싱
		 * 	기본타입의 값을 직접 박싱하지 않아도 자동박싱이 일어난다.
		 * 	Integer obj = 100; (자동박싱)
		 * 자동언박싱
		 * 	wrapper클래스 객체에서 직접 언박싱하지 않아도 자동언박싱이 일어난다.
		 * 	Integer obj = new Integer(200);
		 * 	int value1 = obj;
		 * 
		 * wrapper클래스를 사용하는 이유
		 *  - 매개변수로 객체가 요구되는경우
			- 기본형이 아닌 객체로 저장해야 하는 경우
			- 객체간의 비교가 필요한 경우
			- 문자열을 기본값으로 변환하는 경우 등
			- 자바 Collection 인터페이스는 객체만 취급하기 때문에 기본값을 객체로 사용해야 하는 경우가 있다.
		 
		 * String
		 * 	문자열 리터럴은 "" 이다. 문자열은 String 객체로 생성되고 변수는 String 객체를 참조한다.
		 * 	보통 문자열 리터럴을 사용하지만, new 연산자를 사용해서 직접 String 객체를 생성시킬 수도 있다.
		 * 	동일한 String객체건 다른 String객체건 상관없이 내부 문자열이 같은지 비교하고 싶을때는 equals()메소드를 사용한다.
		 *  원본문자열변수.equals(비교문자열변수);
		  
		 * 문자열을 기본타입으로 변환
		 * String = "10"
		 * String -> int
		 * 	int value = Integer.parseInt(str);
		 * String -> double
		 * 	String = "10.1";
		 * 	double value = Double.parseDouble(str);
		 
		 * String 클래스(생성자)
		 
		 * String 메소드
		 * =중요=
		 
		 * // 자바 api 문서
			// http://docs.oracle.com/javase/8/docs/api/
				 		 






		 
		 * =====	Day 16. 07.27. API 클래스 		======
		 
		 * Object 클래스 
		 * 	자바 클래스의 최상위 클래스로 사용
		 * 	클래스 선언 시 extends 키워드로 다른 클래스를 상속하지 않으면 java.lang.Object 클래스를 상속하게 된다.
		 * 	자바의 모든 클래스는 Object 클래스를 상속받기 때문에 Object 클래스의 멤버를 자연스럽게 사용할 수 있다.
		 * 	equals() : Override해서 데이터가 같으면 true
		 *  hashCode() : 객체의 주소값을 변환한 객체의 고유한 정수값. 객체의 데이터가 같을 때 같은 hashCode 를 반환하도록 재정의한다.
		 
		 * System  클래스
		 * 	입력장치로부터 데이터를 받을때, 출력장치로 출력할떄, 가상기계를 종료할때
		 * 	자바 프로그램은 운영체제에서 바로 실행되는 것이 아니라 JVM 위에서 실행된다. 따라서 운영체제의 모든 기능을 직접이용하긴 어렵지만 System 클래스를 사용하면 운영체제의 일부기능을 사용할수 있다.
		 * 	System 클래스의 모든 필드와 메소드는 정적필드 / 정적 메소드로 구성되어 있다.
		 * 	currentTimeMillis(), nanoTime()메소드는 컴퓨터의 시계로부터 현재시간을 읽어서 밀리세컨드와 나노세컨드 단위의 long 값을 리턴한다.
		 
		 * Random 클래스
		 * 	int nextInt() int 범위의 난수 발생
		 * 	int nextInt(int n) 0~n 미만의 int 타입 난수 발생
		 * 	float nextFloat() 0이상 1미만의 float 타입 난수 발생
		 
		 * Class
		 * 	클래스를 메모리로 로딩할때
		 
		 * String
		 * 	문자열 저장-여러가지 정보 얻을때
		 
		 * Wrapper
		 * 	기본타입 데이터를 갖는 객체 만들때 / 문자열을 기본타입으로 변환할때
		 
		 * Math
		 * 	수학함수를 이용할때
		 
		 * Array
		 
		 * Date / Calendar
		 * 		 		 






		 
		 * =====	Day 17. 07.28. 정규표현식 		======
		 
		 * 정규표현식은 문자열을 찾기 위한 조건을 문자열로 표현한 것이다.
		 * 	텍스트에서 새로운 문자열로 치환하거나 올바른 값인지 검사할 때 사용한다.유효성 검사를 할 수 있다.
		 * 메타문자 : ^ $ \d \D \w \W \s \S a-z A-Z 0-9 등... pdf파일 참조하기
		 * [A-Z][a-zA-Z]*

		 * 자바의 오류
		 * 	오류 / 예외
		
		 * 실행예외 ( 자바 컴파일러가 체크하지 않기 때문에 오로지 개발자의 경험에 의해서 예외처리 코드를 작성해야한다. 만약 개발자가 실행예외에 대해 예외처리 코드를 넣지 않았을 경우, 해당 예외가 발생하면 프로그램은 곧바로 종료된다)
		 * 	NullPointerException -> 객체참조가 없는 상태  null값을 갖는 참조변수로 객체 접근연산자인 도트(.)을 사용했을때 발생
		 * 	ArrayIndexOutOfBoundsException -> 배열에서 인덱스 범위 초과한 경우 발생
		 * 	NumberFormatException -> 문자열을 숫자로 변환시
		 * 	ClassCastException -> 타입변환이 되지 않을경우 발생
		 
		 * 예외처리 방법
		 * 	try-catch문(직접처리)
		 *			try {
		 *
		 *				예외 발생가능 코드 작성
		 *
		 *			} catch(예외클래스 e) {
		 *
		 *				예외처리
		 *
		 *			} finally {
		 *
		 *				항상실행
		 *			}
		 *
		 * 	예외 선언하기(throw)
		
		 * 제네릭 타입
		 * 	자바에서 제네릭이란 타입을 일반화하는 것을 의미한다.
		 * 	제네릭 선언은 class 클래스명<E> 등으로 한다.
		 * 		class Generic<E>
		 * 	제네릭 타입을 사용하지 않으면 Object타입 사용 -> 빈번한 타입변환 발생 -> 프로그램 성능 저하
		 * 	제네릭 타입을 사용한 경우 프로그램 성능저하를 유발하는 캐스팅을 제거하고 컴파일시 타입오류를 체크하여 사전에 엄격한 데이터타입 체크를 가능케한다.(타입의안정성)
		
				





		 
		 * =====	Day 18. 07.29. collection framework 		======
		 
		 * Collection - 여러객체를 모아놓은 것
		 * Framework - 표준화 정형화된 체계적인 프로그래밍 방식
		 * Collection Framework 
		 * 	- 여러객체를 다루기위한 표준화된 방식
		 * Iterator(반복자)
		 * 	list set 에서 구현 ( Map에는 없음) - hasNext(), next(), remove()
		 * 	사용 예시 - 
		 * 		while(itr.hasNext()){
		 * 			String str = itr.next();
		 * 		}
		 
		 * 	list, set, map
		 * 		list - 순서가 있고 중복이 허용된다
		 * 			배열과 비슷하게 객체를 인덱스로 관리한다. 배열과 다른점은 배열은 길이가 정해져있지만 list는 저장용량이 자동으로 증가하며 자동인덱스가 부여된다.
		 * 			향상된 for문 사용가능. 
		 * 			List<E> list = new ArrayList<E>();
		 * 		set - 순서가 없고 중복이 안된다
		 * 		map - 순서가 없고 중복은 key 는 x value 는 o
		
		
		
		
		
		
		
		
		
				 * =====	Day 19. 08.01. set,map 컬렉션 		======
		 
		 * SET컬렉션
		 * 	set은 저장 순서가 유지되지 않고 객체를 중복해서 저장할 수 없다.
		 *	 set은 인덱스로 저장되지 않는다. 
		 * 	HashSet = set의 구현클래스
		 
		 * MAP 컬렉션
		 * 	키와 벨류로 객체를 저장한다.키는 중복될수 없지만 벨류는 중복될 수 있다.
		 * 	HashMap - Map인터페이스를 구현한 대표적인 MAP 컬렉션이다.
		 * 	키로 사용할 객체는 중복이 안되기 때문에 hashCode()와 equals메소드를 오버라이딩하여 재정의해야한다.
		
		
		




		 
		 * =====	Day 20. 08.02. 스트림 		======
		 
		 * 자바에서 데이터는 스트림을 통해 입출력된다.
		 * 	스트림 - 데이터를 전달하는데 사용되는 장치
		 * 		바이트기반 스트림 - InputStream / OutputStream / 
		 * 		문자기반 스트림 - Reader / Writer
		 * 모든 작업시에 in 이나 read 라는 단어가 잇다면 읽어내는 기능
		 * 모든 작업시에 out 이나 write 라는 단어가 있다면 쓰는 기능을 의미

		 * 
		 * 
		 * 
		 
		 
		 */
	}

}
