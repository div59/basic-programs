package Demo.Static;

public class Hum2 {
	public static void main(String[] arg) {
		Human divya=new Human(10000,"divyani",true);
		Human aaru=new Human(10000,"aaru",true);
		System.out.println(divya.name + " "+ aaru.name);
		System.out.println( "static " + Human.num);
		Hum2 b=new Hum2();
		b.fun();
		Human.display();
		
	}
	void fun(){
		show();//non static method can be called inside non static method
	}
	static void you(){
		//fun();//we cant call non static method inside static method
		//this can be done by creating obj of that
		Hum2 a=new Hum2();
		a.fun2()	;
		}
	void fun2() {
		System.out.println("hiiiiiiiiiiii");
	}
	
	
		void show() {
		you();//non static can call static method
		
	}
	

}
