// factories/InterviewFactory.java
package main.java.factories;

import main.java.interviews.Interview;

public interface InterviewFactory {
    Interview createInterview(String type);
}