package com.ttl.oop.b1;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Engineer extends Officer {
	private String branch;

	public Engineer(Officer officer, String branch) {
		super(officer.getName(), officer.getAge(), officer.getGender(), officer.getAddress());
		this.branch = branch;
	}
	
	@Override
    public String toString() {
        return "Engineer{" +
                "branch='" + branch + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}
