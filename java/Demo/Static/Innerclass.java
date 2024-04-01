package Demo.Static;
class Test{
	 static String name;
	Test(String name){
		//this.name=name;
		Test.name=name;
	}
	
}

public class Innerclass {

	public static void main(String[] args) {
		Test obj =new Test("divya");
		Test obj1 =new Test("shivani");
		System.out.println(Test.name);
		System.out.println(obj.name);
		System.out.println(obj1.name);
		
		//output
		//shivani
		//shivani
		
		}

}
