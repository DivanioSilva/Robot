package ds.robot;

public class RobotDemo {

	public static void main(String[] args) {
		RobotMouse r = new RobotMouse();

		try {
			r.goTo();
			
			Thread.sleep(800);
			
			r.mouseClick(MouseButtons.LEFT);
		} catch (Exception e) {
			// TODO: handle exception
		}

		
	}
}