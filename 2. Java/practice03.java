package input;

import java.io.IOException;

public class Ex01 {

	public static void main(String[] args) throws IOException {		// throws IOException 은 System.in.read()에 대한 예외처리 코드이다.
		
		System.out.print("키코드 입력하고 엔터 : ");
		
		int keyCode;
		
		keyCode = System.in.read();			// read는 1바이트씩 읽는다. 한글은 1바이트로 표현할 수 없기 때문에 숫자,영문,특수문자만 입력할 수 있다.
		
		System.out.println(keyCode);
		
		keyCode = System.in.read();
		System.out.println(keyCode);
		
		keyCode = System.in.read();
		System.out.println(keyCode);
		
		keyCode = System.in.read();
		System.out.println(keyCode);		// System.in.read()의 단점은 키코드를 하나씩 읽기때문에 2개이상의 키가 조합된 한글은 읽을수없다.
											// 이러한 단점을 보완하기 위해 자바는 Scanner 클래스를 제공한다.
											// 
		

	}

}
