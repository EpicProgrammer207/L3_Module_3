package interfaces;

import java.util.ArrayList;

public class BackwardsString extends SpecialString{

	public BackwardsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String s) {
		String j = "";
		for(int i=s.length()-1; i>=0; i--) {
		String sub =	s.substring(i, i+1);
j+=sub;
		}
		return j;
		// TODO Auto-generated method stub
		
	}

}
