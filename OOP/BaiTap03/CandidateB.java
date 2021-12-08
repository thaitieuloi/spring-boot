package com.ttl.oop.b3;

public class CandidateB extends Candidate {

    public static final String MON_TOAN = "Toan";
    public static final String MON_HOA = "Hoa";
    public static final String MON_SINH = "Sinh";

    public CandidateB(Candidate candidate) {
		super(candidate.getId(), candidate.getName(), candidate.getAddress(), candidate.getPriority());
    }

    @Override
    public String toString() {
        return "CandidateB{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", priority=" + priority + ", Subject: " + MON_TOAN + " - " + MON_SINH + " - " + MON_HOA +
                '}';
    }
}
