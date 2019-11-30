package _00_Text_Funkifier;

public class CustomString extends SpecialString{

	public CustomString(String s) {
		super(s);
	}
	@Override
	public String funkifyText(String s) {
		String b = "";
		for(int i = 0; i < s.length(); i++) {
			if(i % 3 != 0) {
				String c = "" + s.charAt(i);
				b += c.toUpperCase();
			}
			else {
				String c = "" + s.charAt(i);
				b += c.toLowerCase();
			}
		}
		return b;
		
		
		
	}
	

}
