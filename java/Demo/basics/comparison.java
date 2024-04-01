package Demo.basics;

public class comparison {
	public static void main(String args[]) {
		String a="divya";
		String b="divya";
		System.out.println(a==b); // both a and b points to same object in string pool which is in heap and it doesnt make copy 
		String x = new String("divya");
		String y=new String("divya");
		System.out.println(x==y);//x and y now points to different obj not in string pool out side that is in heap
		
	}

}
