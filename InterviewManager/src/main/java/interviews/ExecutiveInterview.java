// interviews/ExecutiveInterview.java
package main.java.interviews;

import main.java.behaviors.*;

public class ExecutiveInterview extends Interview {
    public ExecutiveInterview() {
        schedulingBehavior = new ScheduleOne();
        interviewingBehavior = new ShareJobInfo(); // Placeholder for executive meeting
        teamingBehavior = new SkipLevelReview(); // Placeholder for executive review
        notifyingBehavior = new Notify();
    }
}