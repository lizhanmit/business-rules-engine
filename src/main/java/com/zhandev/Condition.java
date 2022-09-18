package com.zhandev;

@FunctionalInterface
public interface Condition {

    boolean evaluate(Facts facts);
}
