// interviews/InfoInterview.java
package main.java.interviews;

import main.java.behaviors.*;

public class InfoInterview extends Interview {
    public InfoInterview() {
        schedulingBehavior = new ScheduleOne();
        interviewingBehavior = new ShareJobInfo();
        teamingBehavior = new NoReview();
        notifyingBehavior = new NoResponse();
    }
}