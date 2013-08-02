package test;
//will this push to Github?
public class Extra {
	private String girlName;
	
	public Extra (String name) {
		girlName = name;
	}
	public void setName(String name) {
		girlName = name;
		
	}
	public String getName () {
		return girlName;
	}
	public void saying () {
		System.out.printf("The Girl name you entered was %s", getName());
		
	}
}

