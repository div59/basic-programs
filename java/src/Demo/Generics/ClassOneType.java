package Demo.Generics;
import java.util.*;

import Demo.basics.Print;

class Gen<T>{
	T dontknow;
	Gen(T dontknow){
		this.dontknow=dontknow;
		
	}
	
	void print() {
	System.out.println("it  is" + " " +this.dontknow);
	}
}

public class ClassOneType {

	public static void main(String[] args) {
		Gen<Integer> ob=new Gen<>(5);//here we dont know the type we can pass anything so
		//in this we declared as integer so i m passing integer
		ob.print();
		
		
		ArrayList<Integer> k=new ArrayList<>();
		k.add(7);
		k.add(90);//ArrayList diifernet than this...that has its own properties
	System.out.println(k);
	
	
		Gen<String> ob2=new Gen<>("Divyani");
		ob2.print();
		
		
		Gen<Float> ob3=new Gen<>(9.2f);
		ob3.print();
		

	}

}
