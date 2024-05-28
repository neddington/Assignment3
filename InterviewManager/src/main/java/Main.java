// Main.java
package main.java;

import main.java.factories.*;

public class Main {
    public static void main(String[] args) {
        InterviewManager infoManager = new InterviewManager(new InfoInterviewFactory());
        infoManager.arrange("JHG", "info");

        InterviewManager whiteboardManager = new InterviewManager(new WhiteboardInterviewFactory());
        whiteboardManager.arrange("LDM", "whiteboard");

        InterviewManager teamManager = new InterviewManager(new TeamInterviewFactory());
        teamManager.arrange("PPK", "team");

        // Bonus: Executive Interview
        InterviewManager execManager = new InterviewManager(new ExecutiveInterviewFactory());
        execManager.arrange("XYZ", "executive");
    }
}