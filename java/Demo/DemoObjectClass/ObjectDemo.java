package Demo.DemoObjectClass;

public class ObjectDemo {
	
	int num;
	ObjectDemo(int num){
		this.num=num;
	}
//	public int hashCode() {
//		return num;//this prints normal value what we have sent 
//				
//	}
	public int hashCode() {
		return super.hashCode();
				
	}


	public static void main(String[] args) {
		ObjectDemo ob=new ObjectDemo(7);
		ObjectDemo ob2=new ObjectDemo(9);
		//System.out.println(ob.hashCode());//this prints random value
		//System.out.println(ob2.hashCode());//hashcode checks objects same or not
		System.out.println(ob.hashCode());//if we not call super.hashCode()
		System.out.println(ob2.hashCode());
		System.out.println(ob instanceof ObjectDemo);
		System.out.println(ob.getClass());
		System.out.println(ob.getClass().getName());
		
	}

}
