package com.ttl.oop.b2;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class Newspaper extends Document {
    private int dayIssue;
        
    public Newspaper(Document docuement, int dayIssue) {
    	super(docuement.getId(), docuement.getNxb(), docuement.getNumber());
        this.dayIssue = dayIssue;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "dayIssue=" + dayIssue +
                ", id='" + id + '\'' +
                ", nxb='" + nxb + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
