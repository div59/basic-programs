package Demo.Generics;

class Gen1<T,S>{
	T dontknow;
	S no;
	Gen1(T dontknow,S no){
		this.dontknow=dontknow;
		this.no=no;
		
	}
	
	void print() {
	System.out.println("it  is" + " " +this.dontknow + "   another one is " + this.no);
	}
}

public class ClassTwoTypes {

	public static void main(String[] args) {
		Gen1<Integer,String> ob=new Gen1<>(9,"Divya");
		ob.print();
		
		

	}

}
