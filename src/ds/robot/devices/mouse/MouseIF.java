package ds.robot.devices.mouse;

import java.awt.Point;

import ds.robot.MouseButtons;
import ds.robot.MouseScrol;

public interface MouseIF {

	public void moveTo(Point point);
	
	public void click(MouseButtons mouseButtons);
	
	public void scrol(MouseScrol mouseScrol);
}
