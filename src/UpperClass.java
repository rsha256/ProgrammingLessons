
public class UpperClass extends People{

	private int numBoats;
	protected static int numRichPeople=0;
	public double incomePerYear;
	public UpperClass() {
		super();
		numBoats=3;
		numRichPeople++;
	}
	public UpperClass(String name, int age, String secretString) {
		super(name, age, secretString);
		numBoats=-3;
		incomePerYear=10000.02;
		numRichPeople++;
	}
	public UpperClass(String name, int age, double incomePerYear, int numBoats) {
		super(name, age);
		this.incomePerYear=incomePerYear;
		this.numBoats=numBoats;
		numRichPeople++;
	}
	public UpperClass(String name, String secret, double incomePerYear) {
		super(name, secret);
		this.incomePerYear=incomePerYear;
	}
	public int getNumBoats() {
		return numBoats;
	}
	public void setNumBoats(int numBoats) {
		this.numBoats = numBoats;
	}
	public int getNumRichPeople() {
		return numRichPeople;
	}
	public static void setNumRichPeople(int numRichPeople) {
		UpperClass.numRichPeople = numRichPeople;
	}
	public double getIncomePerYear() {
		return incomePerYear;
	}
	public void setIncomePerYear(double incomePerYear) {
		this.incomePerYear = incomePerYear;
	}
}
