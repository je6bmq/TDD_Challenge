package validate_addr_spec;

public class Addr {
	private String str;
	public Addr(String s){
		str = s;
	}

	public static boolean isValidA1(String s){
		return false;
	}

	public String getDomain(){
		return "";
	}

	public String getLocal(){
		return "";
	}
}
