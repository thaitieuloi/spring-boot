package com.ttl.oop.b3;

public class CandidateC extends Candidate {

    public static final String MON_VAN = "Van";
    public static final String MON_SU = "Su";
    public static final String MON_DIA = "Dia";

    public CandidateC(Candidate candidate) {
		super(candidate.getId(), candidate.getName(), candidate.getAddress(), candidate.getPriority());
    }

    @Override
    public String toString() {
        return "CandidateC{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", priority=" + priority + ", Subject: " + MON_VAN + " - " + MON_SU + " - " + MON_DIA +
                '}';
    }
}
