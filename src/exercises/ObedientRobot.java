package exercises;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	
	Robot robot = new Robot();

	void draw() {
		robot.penDown();
		robot.setSpeed(100);
		robot.setRandomPenColor();
		robot.setPenWidth(5);
		robot.setPos(new Random().nextInt(600) + 100, new Random().nextInt(400) + 100);
	}

	void circle() {
		draw();
		for (int i = 0; i < 360; i++) {
			robot.move(1);
			robot.turn(1);
		}
	}

	void square() {
		draw();
		for (int i = 0; i < 4; i++) {
			robot.move(100);
			robot.turn(90);
		}
	}

	void triangle() {
		draw();
		for (int i = 0; i < 3; i++) {
			robot.move(100);
			robot.turn(120);
		}
	}
	
	static void draw(int number) {
		if (number == 0)
			new ObedientRobot().circle();
		else if (number == 1)
			new ObedientRobot().square();
		else if (number == 2)
			new ObedientRobot().triangle();
		else
			System.exit(0);
	}

	public static void main(String[] args) {
		
		int answer = 0;
		do {
		int shape = JOptionPane.showOptionDialog(null, "Which shape would you like me to draw?", "Obedient Robot", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Circle", "Square", "Triangle" }, null);
		
		draw(shape);
		answer = JOptionPane.showConfirmDialog(null, "Do you want to draw another shape?", "",
				JOptionPane.YES_NO_OPTION);
	}while(answer == 0);

}
		/*
		 * Create methods to draw a circle, square and triangle and call the appropriate
		 * one depending on the user choice.
		 */
		
		
	}
	
	


