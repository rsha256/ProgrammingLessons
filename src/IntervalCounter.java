
public class IntervalCounter extends Counter {

	private int interval;

	public IntervalCounterSolution() {
		super();
		interval=2;
	}

	public IntervalCounterSolution(int max, int min, int val, int interval) {
		super(max, min, val);
		this.interval = interval;
	}

	public boolean countUp() {
		value += interval;
		return checkBounds();
	}

	public boolean countDown() {
		value -= interval;
		return checkBounds();
	}

	public void correctValues() {
		if (value > maxValue)
			value = maxValue;
		else if (value < minValue)
			value = minValue;
	}
}
