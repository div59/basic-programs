package Demo.Static;

public class Block {
	static int a=2;
	static int b;
	static {
		System.out.println("when only 1st loaded");
		
		b=a*10;
	}
	public static void main(String[] arg) {
		System.out.println(a + " " + b);
		Block obj=new Block();//when class is loaded 1st time all static stuff get run 1st 
		System.out.println(a + " " + b);
		b+=1;
		System.out.println(a + " " + b);
		Block obj2=new Block();//
		System.out.println(a + " " + b);
		b+=1;
		//Block obj3=new Block();//
		System.out.println(a + " " + b);
		b+=1;
		System.out.println(a + " " + b);
		
		
		
	}

}
