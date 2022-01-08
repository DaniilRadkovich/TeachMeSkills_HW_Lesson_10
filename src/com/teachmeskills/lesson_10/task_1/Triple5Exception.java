package com.teachmeskills.lesson_10.task_1;

public class Triple5Exception extends Exception{
    public Triple5Exception() {
    }

    public Triple5Exception(String message) {
        super(message);
    }

    public Triple5Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public Triple5Exception(Throwable cause) {
        super(cause);
    }

    public Triple5Exception(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
