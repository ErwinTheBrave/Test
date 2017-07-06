package classPack;

public class Player26 extends Player {
	public void move() {
		if (position < end){
			int r;
			do {
				r = (int) Math.floor(Math.random()*9);
			} while (r == 4);
			if (r < 4)
				position += 2;
			else
				position += 6;
		}
		if (position > end)
			position = end;
	}
}
