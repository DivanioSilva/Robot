package ds.robot.devices.mouse;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class RobotMouse implements MouseIF {
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

	private void getMousePosition() {
		point = MouseInfo.getPointerInfo().getLocation();
	}

	public void goTo(int x, int y) {
		robot.mouseMove(x, y);
		robot.delay(1000);
	}

	public void goTo() {
		robot.delay(3000);
		getMousePosition();
		System.out.println("Tenho a posição registada!");
		robot.delay(6000);
		robot.mouseMove(point.x, point.y);
	}

	@Deprecated
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

	@Override
	public void moveTo(Point point) {
		robot.mouseMove(point.x, point.y);
	}

	@Override
	public void click(MouseButtons mouseButtons) {
		if (mouseButtons.toString().equals("LEFT")) {
			robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		} else if (mouseButtons.toString().equals("RIGHT")) {
			robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
			robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
		} else if (mouseButtons.toString().equals("SCROLL")) {
			robot.mousePress(InputEvent.BUTTON2_DOWN_MASK);
			robot.mouseRelease(InputEvent.BUTTON2_DOWN_MASK);
		}
	}

	@Override
	public void scrol(MouseScroll mouseScrol) {
		// robot.mouseWheel(mouseScrol.);
		// not supported yet

	}

	@Override
	public void takeScreenShot() {
		final String fileTmp ="D:\\tmp.jpg"; 
		final Dimension screenDimension = Toolkit.getDefaultToolkit().getScreenSize();
		final Rectangle screenRectangle = new Rectangle(screenDimension);
		final BufferedImage screenImage = robot.createScreenCapture(screenRectangle);
		try {
			ImageIO.write(screenImage, "", new File(fileTmp));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		 BufferedImage img=ImageIO.read(new File("f://images.jpg"));
	        ImageIcon icon=new ImageIcon(screenImage);
	        JFrame frame=new JFrame();
	        frame.setLayout(new FlowLayout());
	        frame.setSize(screenDimension);
//	        frame.setOpacity(10);
	        JLabel lbl=new JLabel();
	        lbl.setIcon(icon);
	        frame.add(lbl);
	        frame.setVisible(true);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
