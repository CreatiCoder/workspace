package main;

import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.dnd.DropTargetListener;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class ImagePane extends JPanel implements DropTargetListener {
	private static final long serialVersionUID = 7226120178750477830L;

	ImagePane() {
		new DropTarget(this, DnDConstants.ACTION_COPY_OR_MOVE, this, true);
		ImageIcon ic = new ImageIcon (ImagePane.class.getResource("./../upload.png").getPath());
		
		Image ig = ic.getImage().getScaledInstance(500, 300, java.awt.Image.SCALE_SMOOTH);
		ic = new ImageIcon(ig);
		JLabel label = new JLabel(ic);
		((FlowLayout) this.getLayout()).setVgap(0);
		((FlowLayout) this.getLayout()).setHgap(0);
		this.add(label);
	}

	@Override
	public void dragEnter(DropTargetDragEvent dtde) {
	}

	@Override
	public void dragOver(DropTargetDragEvent dtde) {
	}

	@Override
	public void dropActionChanged(DropTargetDragEvent dtde) {
	}

	@Override
	public void dragExit(DropTargetEvent dte) {
	}

	@Override
	public void drop(DropTargetDropEvent dtde) {
		dtde.acceptDrop(DnDConstants.ACTION_COPY_OR_MOVE);
		Transferable t = dtde.getTransferable();
		try {
			@SuppressWarnings("unchecked")
			File f = (File) (((List<Object>) t.getTransferData(DataFlavor.javaFileListFlavor)).get(0));
			String path = f.getAbsolutePath();
			if (path.split("\\.")[1].equals("gif")) {
				this.removeAll();
				ImageIcon ic = new ImageIcon(path);
				JLabel label = new JLabel(ic);
				this.add(label);
				((JFrame) SwingUtilities.getRoot(this)).pack();
				this.repaint();
			}
		} catch (UnsupportedFlavorException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
