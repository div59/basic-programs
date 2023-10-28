package Demo.Static;
public class Innerclass1 {
	 static class Test{
		 static String name;
		Test(String name){
			this.name=name;
		}
		
	}

	public static void main(String[] args) {
		//before making test class as Static
		//Test obj =new Test("divya");// we cant call test class as it is dependent on Innerclass1 instatnces
		//Test obj1 =new Test("shivani");//we cant call test class as it is dependent on Innerclass1 instances
		//Innerclass1 obj1=new Innerclass1("divya");//cant
		
		//after making test class as static
		//now it is is Static so it is just depend on Innerclass1 but not its instances
		Test obj =new Test("divya");
		Test obj1 =new Test("shivani");
//		Innerclass1 obj=new Innerclass1();
//		Innerclass1 obj1=new Innerclass1();//cant
		//
		System.out.println(obj.name);
		System.out.println(obj1.name);
		//both prints shivani as name is static so divya changes to shivani when obj2 is called
		
		
		}

}
