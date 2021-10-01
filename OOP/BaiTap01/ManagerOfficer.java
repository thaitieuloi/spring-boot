package com.ttl.oop.b1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.Data;

@Data
public class ManagerOfficer {
    private List<Officer> officers;

    public ManagerOfficer() {
        this.officers = new ArrayList<>();
    }

    /**
     * 
     * @param officer
     */
    public void addOfficer(Officer officer) {
        this.officers.add(officer);
    }

    /**
     * 
     * @param name
     * @return
     */
    public List<Officer> searchOfficerByName(String name) {
        return this.officers.stream().filter(o -> o.getName().contains(name)).collect(Collectors.toList());
    }

    /**
     * 
     */
    public void showListInforOfficer() {
        this.officers.forEach(o -> System.out.println(o.toString()));
    }
}
