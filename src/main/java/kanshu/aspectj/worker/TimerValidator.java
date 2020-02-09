package kanshu.aspectj.worker;

import kanshu.aspectj.annotation.Timer;

public class TimerValidator {

    @Timer
    public String executeTimer(String message){
        return message + " there!!";
    }
}
