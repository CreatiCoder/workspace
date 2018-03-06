package main;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;

public class ImageWidget extends JFrame {
	private static final long serialVersionUID = -651405855813691971L;
	private JFrame self = this;

	ImageWidget() {

		MouseMotionListener mouseMotionListener = new MouseMotionListener() {
			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseDragged(MouseEvent e) {
				self.setLocation(e.getXOnScreen(), e.getYOnScreen());
			}
		};
		MouseListener mouseListener = new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					System.exit(0);
				}
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
			}

		};

		this.addMouseListener(mouseListener);
		this.addMouseMotionListener(mouseMotionListener);
		this.setUndecorated(true);
		this.setResizable(false);
		this.add(new ImagePane());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setAlwaysOnTop(true);
		this.setLocationRelativeTo(null);
		this.pack();
		this.setVisible(true);
	}
}
