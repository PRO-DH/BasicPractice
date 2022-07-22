package clazz.filed;

class Person{
	
	private String name;
	private int age;
	private String tel;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		if(age>=20 && age<=60){
			this.age = age;
		}else;{
		}
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getTel() {
		return tel;
	}
	
}

public class Ex05 {

	public static void main(String[] args) {
		
		Person pp = new Person();
		pp.setName("똥쟁이");
		pp.setAge(23);
		pp.setTel("01046606660");
		
		System.out.println( pp.getName() + pp.getAge() + pp.getTel() );
		

	}

}
