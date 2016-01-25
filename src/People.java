
public class People {
	private String name;
	private int age;
	public final static double AVERAGE_AGE = 70.2;
	protected static String secretString;
	private static int numPeople=0;
	
	public People()
	{
		name = "no name";
		age = -1;
		secretString = "very secret";
		numPeople++;
	}
	
	public People(String name, int age)
	{
		this.name=name;
		this.age=age;
		secretString = "wow much secrecy";
		numPeople++;
	}
	
	public People(String name, String secret)
	{
		this.name=name;
		age=-1;
		secretString=secret;			//No increase in numPeople
	}
	
	public People(String name, int age, String secretString)
	{
		this.name=name;
		this.age=age;
		People.secretString=secretString;
		numPeople++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static String getSecretString() {
		return secretString;
	}

	public static void setSecretString(String secretString) {
		People.secretString = secretString;
	}

	public static int getNumPeople() {
		return numPeople;
	}
	
	
}
