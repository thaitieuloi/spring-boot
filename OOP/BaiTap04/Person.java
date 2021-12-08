package com.ttl.oop.b4;

import com.ttl.oop.b2.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private String name;
    private int age;
    private String job;
    private String passport;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                ", passport='" + passport + '\'' +
                '}';
    }
}
