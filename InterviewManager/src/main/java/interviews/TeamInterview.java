// interviews/TeamInterview.java
package main.java.interviews;

import main.java.behaviors.*;

public class TeamInterview extends Interview {
    public TeamInterview() {
        schedulingBehavior = new ScheduleOne();
        interviewingBehavior = new CoordinateTeam();
        teamingBehavior = new TeamReview();
        notifyingBehavior = new NoResponse();
    }
}