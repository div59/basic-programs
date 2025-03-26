package builtin_functions.string_functions;

public class String_functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string="divyaniMahanteshKUMBAR";
		for(char i:string.toCharArray()) {
			if(Character.isUpperCase(i)) {
				System.out.print(i);
			}
			
		}
		System.out.println();
		String string2=string.toLowerCase();
		System.out.println(string2);
		
		if(string.startsWith("divyani")) {
			System.out.println("yes");
		}
		if(string2.endsWith("kumbar")) {
			System.out.println("yes");
		}
	}

}
