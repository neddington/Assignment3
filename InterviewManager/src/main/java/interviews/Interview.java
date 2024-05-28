// interviews/Interview.java
package main.java.interviews;

import main.java.behaviors.*;

public abstract class Interview {
    protected SchedulingBehavior schedulingBehavior;
    protected InterviewingBehavior interviewingBehavior;
    protected TeamingBehavior teamingBehavior;
    protected NotifyingBehavior notifyingBehavior;
    
    public void setScheduling(SchedulingBehavior sb) {
        schedulingBehavior = sb;
    }
    
    public void setInterviewing(InterviewingBehavior ib) {
        interviewingBehavior = ib;
    }
    
    public void setTeaming(TeamingBehavior tb) {
        teamingBehavior = tb;
    }
    
    public void setNotifying(NotifyingBehavior nb) {
        notifyingBehavior = nb;
    }
    
    public void displaySteps() {
        schedulingBehavior.schedule();
        interviewingBehavior.interview();
        teamingBehavior.coordinateTeam();
        notifyingBehavior.notifyCandidate();
    }
}