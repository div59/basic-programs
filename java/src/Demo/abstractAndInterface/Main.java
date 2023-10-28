package Demo.abstractAndInterface;
abstract class parent{
	int age;
	int f;
	parent(){
		age=7;
	}
	parent(int age){
		this.age=age;
		}
	abstract void show();
	
	void disply() 
		{
			System.out.println("age is " + this.age);//if we not create object for this then why we have to create this?
			//bcz this is parent class as child of this wants parent property if child are more then instead 
			//of writing each time we can call super and use that
		}
	void greeting(String good) {
		System.out.println("hey" + good);
	}
	
}
class son extends parent{
	String name;
	son(String name,int age){
		super(age);
		this.name=name;
		
	}
	 void show() {
		System.out.println("i am son ");
	}
	 void disply() {
		 super.disply();
		 System.out.println("name is "+ this.name);
	 }
	
}
class daughter extends parent{
	String name;
	daughter(String name,int age){
		super(age);
		this.name=name;
	}
	 void show() {
		System.out.println("i am daughter ");
	}
	 void disply() {
		 super.disply();
		 System.out.println("name is "+ this.name);
	 }
	
}
	


public class Main {

	public static void main(String[] args) {
		//parent ob =new parent(78);//we cant create object for abstract class
		//ob.disply();
		parent ob=new son("jay",21);
		System.out.println(ob.age);
		//System.out.println(ob.name);//cant as name is not present in parent 
		
		ob.show();
		ob.disply();
		parent ob2=new daughter("jaylakshmi",22);
		ob2.show();
		ob2.disply();
		ob.greeting("good moring");
		ob2.greeting("good evng");
		

	}

}
