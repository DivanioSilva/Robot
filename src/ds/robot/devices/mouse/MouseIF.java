package ds.robot.devices.mouse;

import java.awt.Point;

public interface MouseIF {

	public void moveTo(Point point);
	
	public void click(MouseButtons mouseButtons);
	
	public void scrol(MouseScroll mouseScrol);
}
