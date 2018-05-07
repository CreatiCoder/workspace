package com.test.IpFinder;

import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @name ipFinder event
 * @comment ipFinder의 이벤트를 핸들링하는 클래스
 * @from https://www.javatpoint.com/java-awt
 * @author creaticoding
 */
// WindowAdapter	: 종료 이벤트 담당 추상 클래스
// ActionListener	: Find IP 버튼 클릭 동작 담당 인터페이스 
public class EventClass extends WindowAdapter implements ActionListener {
	// 조작할 컴포넌트 담는 변수 선언
	private TextField input;
	private Label result;
	private TextArea log;

	public EventClass() {}

	// 조작할 컴포넌트 인자받아 생성
	public EventClass(TextField input, Label result, TextArea log) {
		this.input = input;
		this.result = result;
		this.log = log;
	}

	// 종료 버튼 이벤트 -> 프로그램 종료
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	// 버튼 클릭 동작 이벤트 -> 결과 및 로그 출력
	public void actionPerformed(ActionEvent arg0) {
		try {
			String host = input.getText();
			String ip = getIpByDomain(host);
			String logStr = "IP of " + (("".equals(host)) ? "localhost" : host) + " is: " + ip;
			result.setText("result ip: " + ip);
			log.setText(log.getText() + getNowTime() + "  " + logStr + "\n");
		} catch (Exception ex) {
			log.setText(log.getText() + getNowTime() + "  " + "Invalid Address" + "\n");
			result.setText("result ip: ");
		}
	}

	// yyyy-MM-dd hh:mm:ss 양식으로 현재시간 문자열 반환하는 함수
	public String getNowTime() {
		long time = System.currentTimeMillis();
		SimpleDateFormat dayTime = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String str = dayTime.format(new Date(time));
		return str;
	}

	// 도메인으로부터 아이피 얻는 함수
	public String getIpByDomain(String host) throws Exception {
		String ip = java.net.InetAddress.getByName(host).getHostAddress();
		return ip;
	}
}
