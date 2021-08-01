package com.zhandev;

/**
 * An action is simply a piece of code that will be executed.
 */
@FunctionalInterface  // Functional interface only declares a single abstract method.
public interface Action {

    void execute();
}
