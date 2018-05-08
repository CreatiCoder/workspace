package com.test.ToDoList;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * @name DeleteBtnEvent
 * @comment ToDoList의 삭제 버튼 이벤트
 * @author creaticoding
 */
public class DeleteBtnEvent implements ActionListener {
	private JFrame root;
	private JPanel target;

	public DeleteBtnEvent() {
	}

	public DeleteBtnEvent(JFrame root, JPanel target) {
		this.root = root;
		this.target = target;
	}

	// 삭제 버튼이 눌렸을 시에 동작되는 함수
	public void actionPerformed(ActionEvent arg0) {
		this.target.remove(((JButton)arg0.getSource()).getParent());
		root.validate();
		root.repaint();
	}

}
