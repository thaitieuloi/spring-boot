package com.ttl.oop.b3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Candidate {
    protected String id;
    protected String name;
    protected String address;
    protected int priority;
}
