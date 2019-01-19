import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
static Robot bob;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bob = new Robot();
		JOptionPane.showInputDialog(null,"What shape do you want draw?");

	}
	static void drawSquare() {
		bob.hide();
		bob.setPenColor(255, 0, 0);
		bob.setSpeed(1000);
		bob.penDown();
		bob.move(100);
		bob.turn(90);
		bob.move(100);
		bob.turn(90);
		bob.move(100);
		bob.turn(90);
		bob.move(100);
	}
	static void drawTriangle() {
		bob.hide();
		bob.setPenColor(255,0,0);
		bob.setSpeed(1000);
		bob.turn(45);
		bob.move(100);
		bob.turn(90);
		bob.move(100);
		bob.turn(135);
		bob.move(100);
	}
	static void drawCircle() {
		bob.hide();
		bob.setPenColor(255,0,0);
		bob.setSpeed(1000);
		for(int i=1; i<100; i++) {
		bob.turn(5);
		bob.move(1);
	}
	}
	}