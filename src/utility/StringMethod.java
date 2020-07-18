package utility;

public class StringMethod{
	
	private String input;
	
	
	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public String lowerCase(String input) {
		return input.toLowerCase();
	}
	
	public String upperCase(String input) {
		return input.toUpperCase();
	}
	
	public String firstChar(String input) {
		String s;
		return s=input.charAt(0)+"";
	}
	
	public String length(String input) {
		int a=input.length();
		String s=Integer.toString(a);
		return s;
	}
	
	public String trimStr(String input) {
		 
		return input.trim();
	}
}