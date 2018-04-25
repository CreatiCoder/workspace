package com.test.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {
		Student s = new Student("김철수",173, "H2017722000", "컴퓨터정보공학부");
		writeObject(s, "./data.backup");
		s = null;
		s = (Student) readObject("./data.backup");
		System.out.println(s.getName());
	}
	public static void writeObject(Object object, String fileName) {
		FileOutputStream fos = null;
		ObjectOutputStream out = null;
		try {
			fos = new FileOutputStream(fileName);
			out = new ObjectOutputStream(fos);
			out.writeObject(object);
			out.close();
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("에러가 발생하였습니다.");
		}
	}
	public static Object readObject(String fileName) {
		FileInputStream fis = null;
		ObjectInputStream in = null;
		Object object = null;
		try {
			fis = new FileInputStream(fileName);
			in = new ObjectInputStream(fis);
			object = in.readObject();
			in.close();
		} catch (Exception ex) {
			System.out.println("에러가 발생하였습니다.");
		}
		return object;
	}
}
