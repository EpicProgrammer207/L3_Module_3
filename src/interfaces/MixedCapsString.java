package interfaces;

import java.util.Random;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String s) {
	String j = "";
	for(int i = 0; i<s.length(); i++) {
		String k;
		if(i%2 == 1) {
			k = s.substring(i, i+1);
			k.toUpperCase();
			j+=k;
		}
		else {
			k = s.substring(i, i+1);
			j+=k;
		}
		
	}
			s = j;
		return s;
		// TODO Auto-generated method stub
		
	}

}
