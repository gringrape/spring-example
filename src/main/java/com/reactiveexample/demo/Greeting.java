package com.reactiveexample.demo;

public class Greeting {
    String message;

    Greeting(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String toString() {
        return this.message;
    }
}
