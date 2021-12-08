package com.ttl.oop.b4;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Family {
    private List<Person> presons;
    private String address;

    @Override
    public String toString() {
        return "Family{" +
        		"Size of =" + presons.size() + ", " +
                "presons=" + presons +
                ", address='" + address + '\'' +
                '}';
    }
}
