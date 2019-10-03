package _01_houses;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class houses {
	static Robot rob = new Robot();
	public static void main(String[] args) {
		rob.setX(10);
		rob.setY(500);
		MakeHouse("medium" , Color.red);
		MakeHouse("large" , Color.blue);
		MakeHouse("small" , Color.PINK);
		MakeHouse("large" , Color.blue);
		MakeHouse("medium" , Color.PINK);
		MakeHouse("small" , Color.red);
		MakeHouse("large" , Color.PINK);
		MakeHouse("small" , Color.red);
		MakeHouse("medium" , Color.	blue);
		
		
	}
	
	public static void MakeHouse(String height2 , Color boi) {
		int height = 0;
		if (height2.equals("small")) {
			height = 80;
		}
		else if (height2.equals("medium")) {
			height = 120;
		}
		else if (height2.equals("large")){
			height = 250;
		}
		rob.setPenColor(boi);
		rob.penDown();
		rob.setSpeed(50);
		rob.move(height);
		rob.turn(45);
		rob.move(30);
		rob.turn(90);
		rob.move(30);
		rob.turn(45);
		rob.move(height);
		rob.turn(-90);
		rob.setPenColor(Color.green);
		rob.move(25);
		rob.turn(-90);
		rob.setPenColor(Color.black);
	}
}
