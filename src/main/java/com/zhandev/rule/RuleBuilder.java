package com.zhandev.rule;

import com.zhandev.Action;
import com.zhandev.Condition;

public class RuleBuilder {

    private final Condition condition;

    // Builder pattern, constructor is private
    private RuleBuilder(final Condition condition) {
        this.condition = condition;
    }

    public static RuleBuilder when(final Condition condition) {
        return new RuleBuilder(condition);
    }

    public Rule then(final Action action) {
        return new DefaultRule(condition, action);
    }
}
