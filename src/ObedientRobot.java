import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
static Robot bob;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bob = new Robot();
	drawSquare();
	
	}

	static void drawSquare() {
		bob.hide();
		bob.setPenColor(255, 0, 0);
		bob.penDown();
		bob.move(100);
		bob.turn(90);
		bob.move(100);
		bob.turn(90);
		bob.move(100);
		bob.turn(90);
		bob.move(100);
	}
}