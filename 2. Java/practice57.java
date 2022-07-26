package string;


// 자바 api 문서
// http://docs.oracle.com/javase/8/docs/api/


public class Ex01 {

	public static void main(String[] args) {
	
		// String 은 클래스다!
		// 문자열은 굉장히 많이 쓰이기 때문에 자바에서는 String 클래스를 기본형과 같은 형식으로 쓸 수 있도록 해두었다.
		
		String str1 = "Hello";
		
		String str2 = new String("Java");
		String str3 = new String("Java");
		System.out.println(str2 == str3);
		
    		//자바에서 문자열을 기본값으로 변환하기
		
		String str = "10";
		System.out.println(Byte.parseByte(str));
		System.out.println(Short.parseShort(str));
		System.out.println(Integer.parseInt(str));
		System.out.println(Long.parseLong(str));
		
		str = "10.1";
		System.out.println(Float.parseFloat(str));
		System.out.println(Double.parseDouble(str));
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("나이를 입력해 주세요 : ");
		String age = scan.next();
		int age1 = Integer.parseInt(age);
		if(age1>=20) {
			System.out.println("성인입니다");
		}else {
			System.out.println("미성년자입니다.");
		}
				// String 생성자로 String 객체 생성하기
		
		// 배열 전체를 Striong 객체로 생성하기
		
		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		
		String str = new String(bytes);
		System.out.println(str);

		
		String str2 = new String(bytes,6,4);		// 6 인덱스로부터 길이 4만큼 객체생성
		System.out.println(str2);
		
		// 문자열을 byte로 반환
		String str3 = "Hello Java";
		byte[] array = str3.getBytes();
		for(byte i : array) {
			System.out.println(i);
		}
    
    		String str1 = "Hello World";
		
		//charAt : 해당 위치의 문자하나를 char형으로 반환
		System.out.println("charAt : " + str1.charAt(0));
		
		//isEmpty : 변수가 비어있으면 true/ 아니면 false
		System.out.println("isEmpty " + str1.isEmpty());
		
		//length : 문자열의 길이를 반환
		System.out.println("length : " + str1.length());
		
		//toCharArray : 문자열을 한글자씩 char 배열로 반환
		char[] array = str1.toCharArray();
		for(char i : array) {
			System.out.println(i);
		}
		
		//replace : 문자열을 교체해준다
		String str2 = str1.replace("Hello", "Hi");
		System.out.println("replace : " + str2);
		
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("주민번호 입력 : ");
		String s = scan.next();
		char a = s.charAt(7);
		if (a =='1' || a=='3') {
			System.out.println("남자");
		}else if(a=='2' || a=='4') {
			System.out.println("여자");
		}
		String str1 = "Hello Java";
		
		//indexOf : 문자열에 지정한 문자가 처음 몇번째에 있는지 반환
		System.out.println(str1.indexOf("a"));
		
		//lastIndexOf : 문자열에 지정한 문자가 마지막 몇번째에 있는지 반환
		System.out.println(str1.lastIndexOf("a"));
		
		//substring : 문자열에서 지정한 범위에 속하는 문자열을 반환
		//(시작범위에 값은 포함하고, 끝나는 범위의 값은 포함하지 않는다.)
		String str2 = str1.substring(0,4);
		System.out.println(str2);
		
		//toLowerCase : 문자열에 대문자를 소문자로 변환
		System.out.println(str1.toLowerCase());
		
		//toUpperCase : 문자열에 소문자를 대문자로 변환
		System.out.println(str1.toUpperCase());
		
		//toString : 문자열을 그대로 반환
		System.out.println(str1.toString());
		
		//trim : 문자열의 앞 뒤 공백을 없애준다
		System.out.println("             안녕               ".trim());
    
    
	}
}
