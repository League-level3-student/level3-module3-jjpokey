package _00_Text_Funkifier;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String storage = "";
		for(int a = s.length() - 1; a >= 0; a--) {
			storage += s.charAt(a);
		}
		return storage;
	}

}
