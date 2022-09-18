package com.zhandev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * An inspector tool that allows users of the Business Rules Engine to inspect the status of possible conditions.
 */
public class Inspector {

    private final List<Condition> conditions;

    public Inspector(final Condition... condition) {
        this.conditions = Arrays.asList(condition);
    }

    /**
     * Inspector returns a list of reports that captures the facts, the condition, and the result.
     * @param facts
     * @return
     */
    public List<Report> inspect(final Facts facts) {
        final List<Report> reportList = new ArrayList<>();

        for (Condition condition : conditions) {
           final boolean conditionResult = condition.evaluate(facts);
           reportList.add(new Report(facts, condition, conditionResult));
        }

        return reportList;
    }

}
