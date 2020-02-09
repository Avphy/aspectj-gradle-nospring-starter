package kanshu.aspectj;

import kanshu.aspectj.worker.TimerValidator;

public class Runner {

    public static void main(String[] args) {
        TimerValidator timerValidator = new TimerValidator();
        timerValidator.executeTimer("Hello ");
        timerValidator.executeTimer("Bye ");
    }
}
