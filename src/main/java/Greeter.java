package chap02;

public class Greeter {
	
	private String format;

	public String greet(String guest) {
		return String.format(guest , format);
	}

	public void setFormat(String format) {
		this.format = format;
	}

}