package entity;

import java.util.List;

public class Assign {
    private Member member;
    private List<Job> jobs;

    public Assign(Member member, List<Job> jobs) {
        this.member = member;
        this.jobs = jobs;
    }

}
