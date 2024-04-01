package Demo.abstractAndInterface;
class parent1{
	int age;
	parent1(){
		System.out.println("parent");
	}
	parent1(int age){
		this.age=age;
		//System.out.println("parent");
		
	}
	void show() {
		System.out.println("i am parent");
	}
	void print() {
		System.out.println("i m fine");
	}
	
}
class child extends parent1{
	String name;
	String add;
	child(){
		//super();
		System.out.println("c");
	}
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
		//child d=new child();
		child p=new child("jav","adf",6);
		p.show();
		p.greeting();
		
	}

}
