package Demo.abstractAndInterface;
class shape{//it is class inside of this interface is there
	public interface circle{
		void show();
		static void dis() {
			System.out.println("its circle");
		}
	}
}
class ring implements shape.circle{
	
	public void show() {
		
		System.out.println("its ring");
	}
	
	
}

public class NestedInterface {

	public static void main(String[] args) {
		ring r=new ring();
		r.show();
		

	}

}
