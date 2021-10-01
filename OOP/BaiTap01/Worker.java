package com.ttl.oop.b1;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Worker extends Officer {
    private int level;

    public Worker(Officer officer, int level) {
        super(officer.getName(), officer.getAge(), officer.getGender(), officer.getAddress());
        this.level = level;
    }
    
    @Override
    public String toString() {
        return "Worker{" +
                "level=" + level +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}
