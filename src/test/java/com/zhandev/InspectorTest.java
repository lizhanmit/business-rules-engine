package com.zhandev;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.List;

public class InspectorTest {

    @Test
    public void inspectOneConditionEvaluatesTrue() {
        final Facts facts = new Facts();
        facts.addFact("jobTitle", "CEO");

        final Condition condition = (Facts f) -> "CEO".equals(f.getFact("jobTitle"));
        final Inspector inspector = new Inspector(condition);

        final List<Report> reportList = inspector.inspect(facts);

        assertEquals(1, reportList.size());
        assertEquals(true, reportList.get(0).isPositive());
    }
}
