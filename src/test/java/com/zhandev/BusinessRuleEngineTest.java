package com.zhandev;

import com.zhandev.rule.Rule;
import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.assertEquals;

public class BusinessRuleEngineTest {

    @Test
    public void shouldHaveNoRulesInitially() {
        final BusinessRuleEngine businessRuleEngine = new BusinessRuleEngine(new Facts());

        assertEquals(0, businessRuleEngine.count());
    }

    @Test
    public void shouldAddTwoRules() {
        final Facts facts = new Facts();
        final BusinessRuleEngine businessRuleEngine = new BusinessRuleEngine(facts);

        businessRuleEngine.addRule(mock(Rule.class));
        businessRuleEngine.addRule(mock(Rule.class));

        assertEquals(2, businessRuleEngine.count());
    }

    @Test
    public void shouldPerformOneRuleWithFacts() {
        final Facts mockFacts = mock(Facts.class);
        final BusinessRuleEngine businessRuleEngine = new BusinessRuleEngine(mockFacts);

        final Rule mockRule = mock(Rule.class);
        businessRuleEngine.addRule(mockRule);
        businessRuleEngine.run();

        verify(mockRule).perform(mockFacts);
    }
}
