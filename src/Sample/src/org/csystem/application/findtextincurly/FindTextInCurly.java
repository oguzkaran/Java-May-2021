package org.csystem.application.findtextincurly;

public class FindTextInCurly {
	public String text;
	public String result;
	public boolean isValid;
	
	public FindTextInCurly(String txt)
	{
		text = txt;
		result = text;
		isValid = true;
	}
	
	public void findText()
	{
		for (;;) {
			int begin = result.indexOf("{");
			int end = result.lastIndexOf("}");
			
			if (begin == -1 && end != -1 || begin > end) {
				isValid = false;
				break;
			}
			
			if (end == -1)
				break;
			
			result = result.substring(begin + 1, end);
		}
	}
}

