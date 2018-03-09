package com.cf.robot;

import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class RobotMouse {
	private Robot robot;
	private Point point;
	private MouseButtons mouseButtons;

	public RobotMouse() {
		try {
			robot = new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}
	
	private void getMousePosition(){
		point = MouseInfo.getPointerInfo().getLocation();
//		point.

	}

	public void goTo(int x, int y) {
		robot.mouseMove(x, y);
		robot.delay(1000);
	}
	
	public void goTo(){
		robot.delay(3000);
		getMousePosition();
		System.out.println("Tenho a posição registada!");
		robot.delay(6000);
		robot.mouseMove(point.x, point.y);
	}

	public void mouseClick(MouseButtons mouseButtons) {
		if (mouseButtons.toString().equals("LEFT")) {
			robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		} else if (mouseButtons.toString().equals("RIGHT")) {
			robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
			robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
		}
	}

	public MouseButtons getMouseButtons() {
		return mouseButtons;
	}

	public void setMouseButtons(MouseButtons mouseButtons) {
		this.mouseButtons = mouseButtons;
	}

}
