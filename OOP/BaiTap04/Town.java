package com.ttl.oop.b4;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Town {
    List<Family> families;

    public Town() {
        this.families = new ArrayList<>();
    }
    
    public void showInfor() {
		this.families.forEach(family -> System.out.println(family.toString()));
	}

    public void addFamily(Family family) {
        this.families.add(family);
    }
}
