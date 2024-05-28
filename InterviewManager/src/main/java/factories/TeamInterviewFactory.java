
// factories/TeamInterviewFactory.java
package main.java.factories;

import main.java.interviews.*;

public class TeamInterviewFactory implements InterviewFactory {
    public Interview createInterview(String type) {
        return new TeamInterview();
    }
}