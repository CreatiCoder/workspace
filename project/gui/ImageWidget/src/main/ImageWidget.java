package main;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;

public class ImageWidget extends JFrame {
	private static final long serialVersionUID = -651405855813691971L;
	private JFrame self = this;
	private int preX, preY;

	ImageWidget() {
		MouseMotionListener mouseMotionListener = new MouseMotionListener() {
			@Override
			public void mouseMoved(MouseEvent e) {
			}

			@Override
			public void mouseDragged(MouseEvent e) {
				self.setLocation(e.getXOnScreen() - preX, e.getYOnScreen() - preY);
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
				preX = e.getX();
				preY = e.getY();
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
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
		this.setSize(500, 300);
		this.setVisible(true);
	}
}
