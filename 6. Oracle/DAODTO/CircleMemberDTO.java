package com.jsp.circle;

public class CircleMemberDTO {
	
	// DTO : Data Transfer Object
	// 계층간 데이터를 교환하기 위한 자바 빈 클래스
	
	
	private String name;
	private int age;
	private String phone;
	private String email;
	
	public CircleMemberDTO() {}
	//기본 생성자 반드시 있어야함
	
	public CircleMemberDTO(String name, int age, String phone, String email) {
		super();
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.email = email;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
