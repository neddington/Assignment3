// interviews/WhiteboardInterview.java
package main.java.interviews;

import main.java.behaviors.*;

public class WhiteboardInterview extends Interview {
    public WhiteboardInterview() {
        schedulingBehavior = new ScheduleTwo();
        interviewingBehavior = new WhiteboardWork();
        teamingBehavior = new SkipLevelReview();
        notifyingBehavior = new Notify();
    }
}