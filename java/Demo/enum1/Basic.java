package Demo.enum1;
enum Week{
	sun,mon,tue,wed,thur,fri,sat,sunday;
	//these r all public static final
	Week(){
		System.out.println("this day is " + " " + this);
	}
}
public class Basic {

	public static void main(String[] args) {
		Week day=Week.fri;//by initializing this one it calls contructor for all varibles
		
		System.out.println(day.ordinal());
		System.out.println(day);
		System.out.println("----------------------");
		
//		for(Week days:Week.values()) {
//			System.out.println(days);
//		}
		
	}

}
