package com.test.ToDoList;

import javax.swing.*;
import java.awt.*;

/**
 * @name ToDoList
 * @comment 할 일을 적어두는 프로그램 예제
 * @author creaticoding
 */
public class App {
	public static void main(String[] args) {

		// 컴포넌트 선언 및 초기화
		final JFrame frame = new JFrame("To Do List");
		final JPanel inputPanel = new JPanel();
		final JTextField editor = new JTextField();
		final JButton writeBtn = new JButton("ADD");
		final JPanel outputPanel = new JPanel();
		final JPanel outputInnerPanel = new JPanel();
		final JScrollPane outputScrollPane = new JScrollPane();

		// 입력패널
		inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.X_AXIS));
		inputPanel.setBounds(5, 5, 470, 60);
		inputPanel.setBackground(new Color(255, 255, 255));
		frame.add(inputPanel);

		// 사용자 입력칸
		editor.setMaximumSize(new Dimension(370, 50));
		editor.setFont(new Font("맑은 고딕", Font.PLAIN, 24));
		inputPanel.add(editor);

		// 추가 버튼 등록 및 이벤트 등록
		writeBtn.setMaximumSize(new Dimension(100, 50));
		writeBtn.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		inputPanel.add(writeBtn);
		writeBtn.addActionListener(new WriteBtnEvent(frame, outputScrollPane, outputInnerPanel, editor));

		// 출력패널
		outputPanel.setLayout(null);
		outputPanel.setBounds(5, 70, 470, 330);
		outputPanel.setBackground(new Color(255, 255, 255));
		frame.add(outputPanel);

		// 출력 내부 패널
		outputInnerPanel.setBackground(new Color(255, 255, 255));
		outputInnerPanel.setLayout(new BoxLayout(outputInnerPanel, BoxLayout.Y_AXIS));
		
		// 스크롤 양 설정
		outputScrollPane.getVerticalScrollBar().setUnitIncrement(8);

		// 스크롤 패널 설정
		outputScrollPane.setBounds(0, 0, 470, 330);
		outputScrollPane.setViewportView(outputInnerPanel);
		
		//출력 패널에 스크롤 패널을 추가
		outputPanel.add(outputScrollPane);

		// frame 설정
		frame.setLayout(null);
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}
}
