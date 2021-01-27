package test_3;

public class Person {
	private String name;
	private int age;
	
	public Person(){}
	public Person(String name, int age){
		this.name = name;
		this.age = age;
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
	
	public void show(){
		System.out.println("我叫"+name+"，今年"+age+"岁");
	}
	
	@Override
	public String toString() {
		return "hello,我是"+name+",今年"+age+"岁";
	}
}
