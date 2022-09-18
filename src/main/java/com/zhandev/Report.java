package com.zhandev;

public class Report {

    private final Facts facts;
    private final Condition condition;
    private final boolean isPositive;

    public Report(final Facts facts, final Condition condition, final boolean isPositive) {
        this.facts = facts;
        this.condition = condition;
        this.isPositive = isPositive;
    }

    public Facts getFacts() {
        return facts;
    }

    public Condition getCondition() {
        return condition;
    }

    public boolean isPositive() {
        return isPositive;
    }

    @Override
    public String toString() {
        return "Report{" +
                "facts=" + facts +
                ", condition=" + condition +
                ", isPositive=" + isPositive +
                '}';
    }
}
