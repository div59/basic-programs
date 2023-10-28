package Demo.enum1;
//enum Odd implements month{
//	jan,feb,mar,apr,may;
//
//	public void show() {
//		System.out.print("i m inside enum ");
//		
//	}
//	
//}

public class Enum3 {
	enum Odd implements month{
		jan,feb,mar,apr,may;
		private Odd() {
			System.out.println("this one is->" + this);
		}

		public void show() {
			System.out.println("i m inside enum ");
			
		}
		
	}

	public static void main(String[] args) {
		//Odd d ;// we need to initialize local varible d
		Odd d=Odd.apr;
		d.show();
		
	}

}
