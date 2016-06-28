/**
 * This is a part of the Java basic assessment
 * 
 * @author Tim Magoun & Aravind Koneru
 */
public class Counter {

	protected int maxValue, minValue, value;

	public Counter() {
		maxValue = 10;
		minValue = 1;
		value = minValue;
	}

	public Counter(int max, int min, int val) {
		maxValue = max;
		minValue = min;
		value = val;
	}

	public boolean checkBounds() {
		if (value < minValue) {
			value = minValue;
			return false;
		}
		if (value > maxValue) {
			value = maxValue;
			return false;
		}
		return true;
	}

	public boolean countUp() {
		value += 1;
		return checkBounds();
	}

	public boolean countDown() {
		value -= 1;
		return checkBounds();
	}
}
