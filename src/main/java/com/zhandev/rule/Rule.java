package com.zhandev.rule;

import com.zhandev.Facts;

@FunctionalInterface
public interface Rule {

    void perform(Facts facts);
}
