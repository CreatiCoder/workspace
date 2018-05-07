package com.test.ipFInder;

import java.awt.*;

/**
 * @name ipFinder
 * @comment 도메인을 입력하면 아이피를 출력해주는 GUI 프로그램
 * @from https://www.javatpoint.com/java-awt
 * @author creaticoding
 */
public class App {
	public static void main(String[] args) {
		
		// 컴포넌트 선언 및 초기화
		final Frame frame = new Frame("IP 파인더");
		final Label name =  new Label("domain ");
		final Label result = new Label("result ip: ");
		final TextField input = new TextField();
		final TextArea log = new TextArea();
		final Button findBtn =new Button("Find IP");
			
		// 크기 및 위치 지정
		input.setBounds(80, 50, 150, 20);
		name.setBounds(25, 50, 50, 20);
		result.setBounds(25, 80, 250, 20);
		log.setBounds(20, 120, 400, 100);
		findBtn.setBounds(240, 45, 60, 30);
		// 로그는 수정 불가
		log.setEditable(false);
		
		// 이벤트 담당 클래스 생성 및 등록
		EventClass eventClass = new EventClass(input, result, log);
		frame.addWindowListener(eventClass);
		findBtn.addActionListener(eventClass);
		
		// 프레임 컴포넌트에 하부 컴포넌트 추가
		frame.add(input);
		frame.add(log);
		frame.add(name);
		frame.add(result);
		frame.add(findBtn);
		// 크기 및 레이아웃 설정
		frame.setSize(450, 250);
		frame.setLayout(null);
		// 화면에 표시
		frame.setVisible(true);
	}
}
