package com.zhandev.rule;

import com.zhandev.Action;
import com.zhandev.Condition;
import com.zhandev.Facts;

public class DefaultRule implements Rule {

    private final Condition condition;
    private final Action action;

    public DefaultRule(final Condition condition, final Action action) {
        this.condition = condition;
        this.action = action;
    }

    @Override
    public void perform(final Facts facts) {
        if (condition.evaluate(facts)) {
            action.execute(facts);
        }
    }
}
