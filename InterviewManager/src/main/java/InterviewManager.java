// InterviewManager.java
package main.java;

import main.java.factories.*;
import main.java.interviews.Interview;

public class InterviewManager {
    private InterviewFactory interviewFactory;

    public InterviewManager(InterviewFactory factory) {
        this.interviewFactory = factory;
    }

    public Interview arrange(String candidateName, String interviewType) {
        System.out.println("_____ PROCESS for candidate: " + candidateName + " _________");
        Interview interview = interviewFactory.createInterview(interviewType);
        interview.displaySteps();
        System.out.println("_________________________________");
        return interview;
    }
}