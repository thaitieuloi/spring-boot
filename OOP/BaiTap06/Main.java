package com.ttl.oop.b6;

import java.util.List;

public class Main {
	public static void main(String[] args) {

		School school = new School();

		for(int i = 0;i < 10; i++) {
			Student student = InputUtils.randomStudentInfoV01();
			school.add(student);
		}
		
		Student student01 = InputUtils.randomStudentInfoV02(23, "DN");
		school.add(student01);
		Student student02 = InputUtils.randomStudentInfoV02(23, "DN");
		school.add(student02);

		System.out.println("SHOW ALL INFO SCHOOL");
		school.showInfor();
		
		System.out.println("SHOW RESULT INFO SCHOOL by condition");
		List<Student> studentYearOld = school.getStudentYearOld(23);
		if(studentYearOld.size() == 0) {
			System.out.println("Not found");
		} else {
			school.showInfor(studentYearOld);
		}

		long count = school.countStudentYearOldInDN(23, "DN");
		System.out.println("Result count = " + count);
	}
}
