package controller;

import model.PilhaInt;

public class ConverteController {

	public ConverteController() {
	super();
	}

	static PilhaInt p = new PilhaInt();
	
	public String decToString(int decimal) throws Exception {
		if (decimal == 0)
		{
			return Integer.toString(p.pop()) ;
		}
		else
		{
			
			if (decimal % 2 > 0)
			{
				p.push(1);
			}
			else
			{
				p.push(0);
			}
			String sobra = decToString(decimal/2);
			if(!p.isEmpty()) {
				sobra = sobra + Integer.toString(p.pop());
			}
			return sobra;
		}
		
	}
}
