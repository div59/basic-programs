package Demo.accesspack1;
 class D{
	  private int j=9;
	  public int getnum2() {
			return j;
			
		}
	  
 }
public class Private {
	private int num;
//	int num;
	int [] arr;
	public Private(int num){
		this.num=num;
		this.arr=new int[num];
	}
	public int getnum() {
		return num;
		
	}
//	public void setnum(int num) {
//		this.num=num;
//		
//	}
	void gib() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		Private obj =new Private(8);
		System.out.println(obj.getnum());//we cant as it it private
		System.out.println(obj.num);
		obj.gib();
//		int n=obj.num;
		D k=new D();
		//System.out.println(k.j);//cant as it is private
		System.out.println(k.getnum2());
	}

}
