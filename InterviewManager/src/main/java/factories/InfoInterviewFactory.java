// factories/InfoInterviewFactory.java
package main.java.factories;

import main.java.interviews.*;

public class InfoInterviewFactory implements InterviewFactory {
    public Interview createInterview(String type) {
        return new InfoInterview();
    }
}