package com.ttl.oop.b7;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
	private String id;
	private String name;
	private int age;
	private String hometown;
	private double salary;
	private double bonus;
	private double penaltyPay;
	private double realSalary;
	
	@Override
    public String toString() {
        return "Teacher{" +
        		"id='" + id + '\'' +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary='" + salary +
                '}';
    }
}
