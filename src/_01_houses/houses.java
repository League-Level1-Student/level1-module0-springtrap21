package _01_houses;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class houses {
	static Robot rob = new Robot();
	public static void main(String[] args) {
		rob.setX(10);
		rob.setY(500);
		MakeHouse(120);
		MakeHouse(250);
		MakeHouse(80);
		MakeHouse(250);
		MakeHouse(120);
		MakeHouse(80);
	}
	
	public static void MakeHouse(int height) {
		rob.penDown();
		rob.setSpeed(5);
		rob.move(height);
		rob.turn(90);
		rob.move(45);
		rob.turn(90);
		rob.move(height);
		rob.turn(-90);
		rob.setPenColor(Color.green);
		rob.move(25);
		rob.turn(-90);
		rob.setPenColor(Color.black);
	}
}
