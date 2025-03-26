package practice;

public class Toggle_Case {

	public static void main(String[] args) {
		String s1="HeLLo WoRLD";
		StringBuilder s2=new StringBuilder();
		for(char i:s1.toCharArray() ) {
			if(Character.isLowerCase(i)) {
				s2.append(Character.toUpperCase(i));
			}
			else if(Character.isUpperCase(i)) {
				s2.append(Character.toLowerCase(i));
			}
			else if (Character.isWhitespace(i)) {
				s2.append(i);
			}
			
	}
		System.out.println(s2);

}
}
