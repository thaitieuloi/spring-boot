package com.ttl.oop.b6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class School {
    private List<Student> students;

	public School() {
		this.students = new ArrayList<>();
	}

	public void add(Student student) {
		this.students.add(student);
	}

	public void showInfor() {
		this.students.forEach(student -> System.out.println(student.toString()));
	}

	public void showInfor(List<Student> students) {
		students.forEach(student -> System.out.println(student.toString()));
	}
	public List<Student> getStudentYearOld(int yearOld) {
		return this.students.stream().filter(student -> student.getAge() == yearOld).collect(Collectors.toList());
	}

	public long countStudentYearOldInDN(int yearOld, String hometown) {
		return this.students.stream()
				.filter(student -> student.getAge() == yearOld && student.getHometown().equals(hometown)).count();
	}
}
