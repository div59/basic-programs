package builtin_functions.string_functions;

public class stringbuilder_reverse {

	public static void main(String[] args) {
		String string="divyani";
		StringBuilder builder=new StringBuilder(string);
		builder.reverse();
		System.out.println(builder);
		
		builder.replace(1, 3, "k");
		System.out.println(builder);
		
		
		String newone=string.replace("ya", "dd");
		System.out.println(newone);
		
		
		
		System.out.println(string.substring(1, 3));
		
	}

}
