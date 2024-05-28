// interviews/ExecutiveInterview.java
package main.java.interviews;

import main.java.behaviors.*;

public class ExecutiveInterview extends Interview {
    public ExecutiveInterview() {
        schedulingBehavior = new ScheduleOne();
        interviewingBehavior = new VPInterview();
        teamingBehavior = new ExecutiveReview();
        notifyingBehavior = new Notify();
    }
}