package com.ttl.oop.b1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Officer {
    protected String name;
    protected int age;
    protected String gender;
    protected String address;
}
