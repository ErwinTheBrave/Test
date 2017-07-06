package classPack;

public class Player {
	protected int position = 0;
	protected int end = 100;
	public void move() {
		if (position < end)
			position += Math.floor(Math.random()*9);
		if (position > end)
			position = 100;
	}
	public int getPosition() {
		return position;
	}
	public int getEnd() {
		return end;
	}
}
