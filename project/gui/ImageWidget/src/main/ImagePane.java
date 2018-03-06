package main;

import java.awt.Color;
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
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class ImagePane extends JPanel implements DropTargetListener {
	/**
	 
	 */
	private static final long serialVersionUID = 7226120178750477830L;
	private Icon ic;

	ImagePane() {
		DropTarget dt = new DropTarget(this, DnDConstants.ACTION_COPY_OR_MOVE, this, true);
		this.setBackground(Color.BLACK);
		ic = new ImageIcon("default.gif");
		JLabel label = new JLabel(ic);
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
		repaint();
	}

	@Override
	public void drop(DropTargetDropEvent dtde) {
		dtde.acceptDrop(DnDConstants.ACTION_COPY_OR_MOVE);
		Transferable t = dtde.getTransferable();
		List fileList;
		try {
			fileList = (List) t.getTransferData(DataFlavor.javaFileListFlavor);
			File f = (File) (fileList.get(0));
			String path = f.getAbsolutePath();
			if (path.split("\\.")[1].equals("gif")) {
				ic = new ImageIcon(path);
				JLabel label = new JLabel(ic);
				this.removeAll();
				this.add(label);
				JFrame root = (JFrame) SwingUtilities.getRoot(this);
				root.pack();
				this.repaint();
			}
		} catch (UnsupportedFlavorException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
