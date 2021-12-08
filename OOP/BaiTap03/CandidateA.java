package com.ttl.oop.b3;

public class CandidateA extends Candidate {
    public static final String MON_TOAN = "Toan";
    public static final String MON_LY = "Ly";
    public static final String MON_HOA = "Hoa";
    public CandidateA(Candidate candidate) {
		super(candidate.getId(), candidate.getName(), candidate.getAddress(), candidate.getPriority());
    }

    @Override
    public String toString() {
        return "CandidateA{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", priority=" + priority + ", Subject: " + MON_TOAN + " - " + MON_LY + " - " + MON_HOA +
                '}';
    }
}
