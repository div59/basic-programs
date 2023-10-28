package Demo;
class Student{
	int roll;
	String name;
	Student(){
//		when new is created that invokes this constructor this. is means object. 
		this.roll=2;
		this.name="Divyani kumbar";
		
	}
//	parameterized constructor
	Student(int roll,String name){
		this.roll=roll;
		this.name=name;
		
	}
//	copy constructor
	Student(Student divya){
		this.roll=divya.roll;
		this.name=divya.name;
	}
	void show() {
		System.out.println("roll number is" + " " + this.roll + " " + "name is " + this.name);
	}
}

public class DemoConstructor {
	public static void main(String[] args) {
		Student divya=new Student(); //this one calls the Student() constructor it means that divya.roll=2; and divya.name="divyani kumbar
		divya.show();
		Student Sandhya =new Student(divya);
//		sandhya.roll=divya.roll;
		Sandhya.show();
		Student aaru=new Student(5,"AARU");
		aaru.show();
		
	}

}
