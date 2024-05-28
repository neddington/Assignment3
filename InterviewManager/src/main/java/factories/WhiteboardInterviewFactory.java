// factories/WhiteboardInterviewFactory.java
package main.java.factories;

import main.java.interviews.*;

public class WhiteboardInterviewFactory implements InterviewFactory {
    public Interview createInterview(String type) {
        return new WhiteboardInterview();
    }
}