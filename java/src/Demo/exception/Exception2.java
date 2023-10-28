package Demo.exception;

public class Exception2 {

	public static void main(String[] args) throws Myexception {
		int a=4;
		int b=0;
		try {
			divide(a,b);
			}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
			//System.out.println("error");
		}
		finally {
			System.out.println("code is running ");
		}
		
	}
//	static int divide(int a,int b) throws ArithmeticException{
//		if (b==0) {
//			throw new ArithmeticException("do not divide by 0");
//		}
//		else 
//			return a/b;
//				
//	}
	static int divide(int a,int b) throws Myexception{
		if (b==0) {
			throw new Myexception("do not divide by 0");
		}
		else 
			return a/b;
				
	}
	
		
	}

