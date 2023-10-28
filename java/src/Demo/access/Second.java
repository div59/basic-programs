package Demo.access;
import Demo.accesspack1.*;
public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Private obj2 =new Private(8);
		System.out.println(obj2.getnum());//we cant as it it private
		
	}

}
