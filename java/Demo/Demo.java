package Demo;

///import Demo.Arraylist.Multi;

class m{
	static int mul(int a,int b) {
		return  a*b;
	}
}

public class Demo{
	static int add(int a,int b) {
		
		return (a+b);
	}
	public static void main(String[] args) {
		System.out.println("sum is  "+add(4,6));
		System.out.println("mul is " + m.mul(7,8));
		
	}
}