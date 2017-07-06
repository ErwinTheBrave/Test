package classPack;

public class Player4 extends Player {
	public void move() {
		if (position < end)
			position += 4;
		if (position > end)
			position = 100;
	}
}
