// factories/ExecutiveInterviewFactory.java
package main.java.factories;

import main.java.interviews.*;

public class ExecutiveInterviewFactory implements InterviewFactory {
    public Interview createInterview(String type) {
        return new ExecutiveInterview();
    }
}