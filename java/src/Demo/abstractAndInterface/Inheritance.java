package Demo.abstractAndInterface;
class parent1{
	int age;
	parent1(){
		
	}
	parent1(int age){
		this.age=age;
	}
	void show() {
		System.out.println("i am parent");
	}
	void print() {
		System.out.println("i m fine");
	}
	
}
class child extends parent{
	String name;
	String add;
	public child(String name,String add,int age){
		super(age);
		this.name=name;
		this.add=add;
	}
	void show() {
		System.out.println("i m child   "+this.name);
	}
	void greeting() {
		System.out.println("hey i m c");
	}
}

public class Inheritance {
	public static void main(String[] args) {
		child p=new child("jav","adf",6);
		p.show();
		p.greeting();
		
	}

}
