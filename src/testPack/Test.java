package testPack;
import classPack.Player;
import classPack.Player26;
import classPack.Player26m;
import classPack.Player4;

public class Test {
	public static void main(String[] args) {
		Player p1 = new Player();
		Player26 p2 = new Player26();
		Player4 p3 = new Player4();
		Player26m p4 = new Player26m();
		int turn = 0;
		System.out.printf("Turn  p1   p2   p3   p4\n");
		System.out.printf("%-6d%-5d%-5d%-5d%-5d\n", turn, p1.getPosition(), p2.getPosition(), p3.getPosition(), p4.getPosition());
		while ((p1.getPosition()+p2.getPosition()+p3.getPosition()+p4.getPosition())<(p1.getEnd()+p2.getEnd()+p3.getEnd()+p4.getEnd())) {
			turn++;
			p1.move();
			p2.move();
			p3.move();
			p4.move();
			System.out.printf("%-6d%-5d%-5d%-5d%-5d\n", turn, p1.getPosition(), p2.getPosition(), p3.getPosition(), p4.getPosition());
		}
	}
}