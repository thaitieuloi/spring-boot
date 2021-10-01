package com.ttl.oop.b1;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Staff extends Officer {
    private String task;
    
    public Staff(Officer officer, String task) {
        super(officer.getName(), officer.getAge(), officer.getGender(), officer.getAddress());
        this.task = task;
    }
    
    @Override
    public String toString() {
        return "Staff{" +
                "task='" + task + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}
