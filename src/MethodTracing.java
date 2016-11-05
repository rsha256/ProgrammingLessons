
public class MethodTracing {

	public int integerValue;
	public String stringValue;

	public MethodTracing() {
		integerValue = 1;
		stringValue = "Hello World!";
	}

	public static void main(String[] args) {

		MethodTracing m = new MethodTracing();
		changeValues(m, m.integerValue);
		
		System.out.println(m.stringValue);
		System.out.println(m.integerValue);
	}

	public static void changeValues(MethodTracing m, int intValue) {
		m.stringValue="Changed!";
		intValue = 10;
	}

}
