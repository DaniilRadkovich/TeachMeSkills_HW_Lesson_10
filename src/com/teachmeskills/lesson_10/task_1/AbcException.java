package com.teachmeskills.lesson_10.task_1;

public class AbcException extends Exception{
    public AbcException() {
    }

    public AbcException(String message) {
        super(message);
    }

    public AbcException(String message, Throwable cause) {
        super(message, cause);
    }

    public AbcException(Throwable cause) {
        super(cause);
    }

    public AbcException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
