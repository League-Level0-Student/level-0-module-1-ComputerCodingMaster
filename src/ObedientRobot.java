import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot bob;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bob = new Robot();
		String color = JOptionPane.showInputDialog(null, "What color do you want? Red,Blue,or Green?");
		if (color.equalsIgnoreCase("Red")) {
			drawRed();
		} else if (color.equalsIgnoreCase("Blue")) {
			drawBlue();
		} else if (color.equalsIgnoreCase("Green")) {
			drawGreen();
		}
		String shape = JOptionPane.showInputDialog(null, "Do you want to draw a circle,a square,or a triangle?");
		if (shape.equalsIgnoreCase("Square")) {
			drawSquare();
		} else if (shape.equalsIgnoreCase("Triangle")) {
			drawTriangle();
		} else if (shape.equalsIgnoreCase("Circle")) {
			drawCircle();
		}

	}

	static void drawSquare() {
		bob.hide();
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
		bob.setSpeed(1000);
		bob.penDown();
		bob.turn(45);
		bob.move(100);
		bob.turn(90);
		bob.move(100);
		bob.turn(135);
		bob.move(140);
	}

	static void drawCircle() {
		bob.hide();
		bob.penDown();
		bob.setSpeed(1000);
		for (int i = 1; i < 100; i++) {
			bob.turn(5);
			bob.move(1);

		}

	}

	static void drawRed() {
		bob.setPenColor(255, 0, 0);
	}

	static void drawBlue() {
		bob.setPenColor(0, 0, 255);
	}

	static void drawGreen() {
		bob.setPenColor(0, 255, 0);
	}
}