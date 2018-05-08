package com.test.ToDoList;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * @name WriteBtnEvent
 * @comment ToDoList의 추가 버튼 이벤트
 * @author creaticoding
 */
public class WriteBtnEvent implements ActionListener {
	
	// 이벤트 동작에 조작이 필요한 컴포넌트
	private JFrame root;
	private JScrollPane outputScrollPane;
	private JPanel outputInnerPanel;
	private JTextField editor;
	
	public WriteBtnEvent() {}
	public WriteBtnEvent(JFrame root, JScrollPane outputScrollPane, JPanel outputInnerPanel, JTextField editor) {
		this.root = root;
		this.outputScrollPane = outputScrollPane;
		this.outputInnerPanel = outputInnerPanel;
		this.editor = editor;
	}
	public void actionPerformed(ActionEvent arg0) {
		
		// 화면에 새롭게 컴포넌트은 생성 및 초기화
		JScrollBar vertical = outputScrollPane.getVerticalScrollBar();
		JTextField result = new JTextField();
		JPanel todo = new JPanel();
		JButton delBtn = new JButton("DEL");
		
		// 레이아웃 설정
		todo.setLayout(new BoxLayout(todo, BoxLayout.X_AXIS));
		// 출력 부분 색 및 크기 설정
		result.setBackground(new Color(255, 255, 255));
		result.setMinimumSize(new Dimension(380, 50));
		result.setMaximumSize(new Dimension(380, 50));
		result.setPreferredSize(new Dimension(380, 50));
		// 한글 글꼴 지원으로 설정
		result.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		// 출력부분 문자열 등록 등등
		result.setBorder(BorderFactory.createLineBorder(Color.black));
		result.setEditable(false);
		result.setText(editor.getText());
		editor.setText("");
		// 삭제 버튼 등록
		delBtn.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		delBtn.setMaximumSize(new Dimension(50, 50));
		delBtn.addActionListener(new DeleteBtnEvent(root, outputInnerPanel));
		
		// 오른쪽 여백 생성해주는 빈 컴포넌트
		JPanel rightEmpty = new JPanel();
		rightEmpty.setBackground(new Color(255, 255, 255));
		rightEmpty.setMaximumSize(new Dimension(15, 50));
		
		// 생성될 컴포넌트에 추가
		todo.add(result);
		todo.add(delBtn);
		todo.add(rightEmpty);
		// 생성될 컴포넌트 크기 설정
		todo.setPreferredSize(new Dimension(450, 50));
			
		// 추가 후 다시 그리기, 스크롤 위치 재 설정
		outputInnerPanel.add(todo);
		root.validate();
		root.repaint();
		vertical.setValue( vertical.getMaximum() );
	}

}
