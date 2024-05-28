// behaviors/NoResponse.java
package main.java.behaviors;

public class NoResponse implements NotifyingBehavior {
    public void notifyCandidate() {
        System.out.println("No followup needed");
    }
}