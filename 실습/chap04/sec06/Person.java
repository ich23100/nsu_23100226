package sec06; //p.151-152

class Person {
	String name;
	int age;

	public Person setName(String name) {
		this.name = name;
		return this;
	}

	public Person setAge(int age) {
		this.age = age;
		return this;
	}

	public void sayHello() {
		System.out.println("안녕, 나는 " + name + "이고 " + age + "살이야.");
	}
}