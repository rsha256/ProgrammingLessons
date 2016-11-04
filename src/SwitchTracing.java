
public class SwitchTracing {
	public static void main(String[] args) {
		int input = 9;
		for (; input > 0; input--) {
			switch (input) {
			case 1:
				System.out.print("One ");
			case 4:
				System.out.print("Four ");
			case 9:
				System.out.print("Nine ");
			}
		}
	}
}