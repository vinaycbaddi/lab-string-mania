package utility;

public class StringAdvanceMethod{
	private String input1;
	private String input2;

	public String getInput1() {
		return input1;
	}

	public void setInput1(String input1) {
		this.input1 = input1;
	}

	public String getInput2() {
		return input2;
	}

	public void setInput2(String input2) {
		this.input2 = input2;
	}
	
	public String concat(String input1,String input2) {
		return input1.concat(input2);
	}
	public String split(String input1,String input2) {
		String[] s=input1.split(input2);
		return s.toString();
	}
	public String indexOf(String input1,String input2) {
		int i = input1.indexOf(input2);
		String index = Integer.toString(i);
		return index;
	}
}
