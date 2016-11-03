public class LoopTracing {
	public static void main(String[] args) {
		int input = 10, output = 0;
		while (input > 1) {
			output += input;
			if (input % 2 == 0)
				input /= 2;
			else
				input = (input + 1) / 2;
		}

		System.out.println(output);
	}
}