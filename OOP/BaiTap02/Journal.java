package com.ttl.oop.b2;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class Journal extends Document {

    private int issueNumber;
    private int monthIssue;
        
    public Journal(Document docuement, int issueNumber, int monthIssue) {
    	super(docuement.getId(), docuement.getNxb(), docuement.getNumber());
        this.issueNumber = issueNumber;
        this.monthIssue = monthIssue;
    }


    @Override
    public String toString() {
        return "Journal{" +
                "issueNumber=" + issueNumber +
                ", monthIssue=" + monthIssue +
                ", id='" + id + '\'' +
                ", nxb='" + nxb + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
