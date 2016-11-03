public class Counter {

	protected int value;
	protected int maxValue;
	protected int minValue;

	public Counter() {

		value = 10;
		maxValue = 100;
		minValue = 0;

	}

	public Counter(int maxValue, int minValue, int value) {

		this.value = value;
		this.maxValue = maxValue;
		this.minValue = minValue;

	}

	public boolean countUp() {
		value++;
		return checkBounds();
	}

	public boolean countDown() {
		value--;
		return checkBounds();
	}

	public boolean checkBounds() {
		return (value >= minValue || value <= maxValue);
	}
}
