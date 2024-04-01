package Demo.exception;

public class Exception1 {

	public static void main(String[] args) {
		int a=4;
		int b=0;
		try {
			int c=a/b;
			}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
			//System.out.println("error");
		}
		finally {
			System.out.println("code is running ");
		}
	}

}
