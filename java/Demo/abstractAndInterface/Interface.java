package Demo.abstractAndInterface;
interface vehicle{
	// we cant have constructor in interface
	void dis();
	static void tell() {//static method inside interface 
		System.out.println("i am vehicle and static method inside interface");
	}
}
interface angle{
	void print();
}
class circle1 implements vehicle,angle{
	public void dis() {
		System.out.println("i m circle");
	}
	public void print(){
		System.out.println("i m from angle class");
	}
}

public class Interface {
	public static void main(String[] args) {
		circle1 n= new circle1();
		n.dis();
		n.print();
		vehicle.tell();

	}

}
