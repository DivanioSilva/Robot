package com.cf.robot.devices.mouse;

import java.awt.Point;

import com.cf.robot.MouseButtons;
import com.cf.robot.MouseScrol;

public interface MouseIF {

	public void moveTo(Point point);
	
	public void click(MouseButtons mouseButtons);
	
	public void scrol(MouseScrol mouseScrol);
}
